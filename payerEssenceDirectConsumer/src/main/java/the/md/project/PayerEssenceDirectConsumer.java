package the.md.project;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import the.md.project.wsProject.PayerEssenceWebservice;

/**
 * Test du webservice directement depuis les stubs de payerEssence, sans passer
 * par le client ws
 * 
 * @author mdoiteau
 */
public class PayerEssenceDirectConsumer {

	/**
	 * Constructeur
	 */
	public PayerEssenceDirectConsumer() {
	}

	/**
	 * Appel via une construction de la factory par Spring
	 */
	public boolean callServiceWithSpring() {
		// Charge le contexte Spring
		ClassPathXmlApplicationContext cpxapc = new ClassPathXmlApplicationContext(
				"classpath:/WEB-INF/ws-context.xml");
		cpxapc.start();

		// Récupère le bean du webservice et l'appel
		PayerEssenceWebservice service = (PayerEssenceWebservice) cpxapc.getBean("client");
		return service.checkTransaction("testCardNumber", 3L);
	}

	/**
	 * Appel via une construction de la factory en code java
	 */
	public boolean callServiceWithFactory() {
		String serviceUrl = "http://localhost:8090/payerEssenceWebService/payerEssence";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PayerEssenceWebservice.class);
		factory.setAddress(serviceUrl);
		PayerEssenceWebservice service = (PayerEssenceWebservice) factory.create();
		return service.checkTransaction("testCardNumber", 3L);
	}

	/**
	 * Lanceur
	 * 
	 * @param args
	 *            arguments du lanceur
	 */
	public static void main(String args[]) {
		System.out.println("Construction...");
		PayerEssenceDirectConsumer pedc = new PayerEssenceDirectConsumer();
		System.out.println("Factory called : " + pedc.callServiceWithFactory());
		System.out.println("Spring called : " + pedc.callServiceWithSpring());
	}

}
