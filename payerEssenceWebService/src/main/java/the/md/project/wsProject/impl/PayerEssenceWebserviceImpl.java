package the.md.project.wsProject.impl;


import javax.jws.WebService;

import the.md.project.wsProject.PayerEssenceWebservice;

/**
 * Webservice pour payer la station essence
 * @author mdoiteau
 */
@WebService(endpointInterface = "the.md.project.wsProject.PayerEssenceWebservice")
public class PayerEssenceWebserviceImpl implements PayerEssenceWebservice {
	
	/**
	 * Valide une transaction avec un CB
	 * @param cardNumber le numéro de la carte
	 * @param price le prix à payer
	 * @return true si ok, false sinon
	 */
	public boolean checkTransaction (String cardNumber, 
			 Long price) {
		if (cardNumber == null || price == null) {
			return false;
		}
		System.out.println("PAIEMENT : " + price + "€ with card " + cardNumber);
		return true;
	}
	
}
