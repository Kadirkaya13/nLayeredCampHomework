package nLayeredCampHomework.core.utils.verifiers;

import nLayeredCampHomework.core.abstracts.AccountVerifyingService;

public class EmailVerifyLinkSender implements AccountVerifyingService{

	@Override
	public void verifying(String message) {
		System.out.println("Email hesab�n�za onaylama linkine t�klay�n�z "+message);
		
	}

}
