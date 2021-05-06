package nLayeredCampHomework;


import nLayeredCampHomework.business.concretes.UserManager;
import nLayeredCampHomework.core.concretes.RegaxEmailConfirmation;
import nLayeredCampHomework.core.utils.verifiers.EmailVerifyLinkSender;
import nLayeredCampHomework.dataAccess.concretes.HibernateUserDao;
import nLayeredCampHomework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "kadir", "kaya", "kadir@hotmail.com", "123456");
		
		User user2 = new User(2,"Engin","Demiroð","engin@demirog.com","123456");
		
		UserManager userManager = new UserManager(new HibernateUserDao(),new RegaxEmailConfirmation(),new EmailVerifyLinkSender());
		
		userManager.register(user);
	}

}
