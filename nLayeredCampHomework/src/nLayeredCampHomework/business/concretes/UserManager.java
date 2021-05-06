package nLayeredCampHomework.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredCampHomework.business.abstracts.UserService;
import nLayeredCampHomework.core.abstracts.AccountVerifyingService;
import nLayeredCampHomework.core.abstracts.EmailConfirmationService;
import nLayeredCampHomework.dataAccess.abstracts.UserDao;
import nLayeredCampHomework.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private EmailConfirmationService emailConfirmationService;
	private AccountVerifyingService accountVerifyingService;
	
	public UserManager(UserDao userDao,EmailConfirmationService emailConfirmationService,AccountVerifyingService accountVerifyingService) {
		this.userDao = userDao;
		this.emailConfirmationService= emailConfirmationService;
		this.accountVerifyingService=accountVerifyingService;
	}

	@Override
	public void register(User user) {
		
		if (user.getPassword().length()>=6&&user.getFirstName().length()>2&&user.getLastName().length()>2&&
				this.emailConfirmationService.emailConfirming(user.getEmail())==true) {
			this.userDao.register(user);
			System.out.println("sisteme baþarýlý bir þekilde kayýt oluþturuldu");
			this.accountVerifyingService.verifying(user.getEmail());
		}else {
			System.out.println("Kayýt oluþturulamadý");
		}
		
	}

	@Override
	public void login(User user) {
		if (!user.getEmail().isEmpty()&&user.getPassword().isEmpty()) {
			this.userDao.login(user);
			System.out.println("sisteme giriþ yapýldý");
		}
		else {
			System.out.println("sisteme giriþ baþarýsýz");
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
