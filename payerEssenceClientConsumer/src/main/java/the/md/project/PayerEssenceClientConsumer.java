package the.md.project;

import the.md.project.wsproject.impl.PayerEssenceWebserviceImplService;


/**
 * Test du webservice via le client généré
 * 
 * @author mdoiteau
 */
public class PayerEssenceClientConsumer {

	/**
	 * Constructeur
	 */
	public PayerEssenceClientConsumer() {
		PayerEssenceWebserviceImplService service = new PayerEssenceWebserviceImplService();
		service.getPayerEssenceWebserviceImplPort().checkTransaction("test", 1L);
	}

	/**
	 * Lanceur
	 * @param args arguments du lanceur
	 */
	public static void main(String args[]) {
		new PayerEssenceClientConsumer();
	}

}
