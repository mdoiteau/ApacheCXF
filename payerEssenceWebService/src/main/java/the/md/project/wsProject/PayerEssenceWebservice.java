package the.md.project.wsProject;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Webservice pour payer la station essence
 * @author mdoiteau
 */
@WebService
public interface PayerEssenceWebservice {
 
	
	/**
	 * Valide une transaction avec un CB
	 * @param cardNumber le numéro de la carte
	 * @param price le prix à payer
	 * @return true si ok, false sinon
	 */
	@WebMethod
	public boolean checkTransaction(@WebParam(name="cardNumber") String cardNumber, 
			@WebParam(name="price") Long price);
	
}
