package nLayeredCampHomework.dataAccess.concretes;

import java.util.List;

import nLayeredCampHomework.dataAccess.abstracts.UserDao;
import nLayeredCampHomework.entities.concretes.User;

public class GoogleUserDao implements UserDao {

	@Override
	public void login(User user) {
		System.out.println("Google hesabý ile giriþ yapýldý");
		
	}

	@Override
	public void register(User user) {
		System.out.println("Google hesabý ile kayýt yapýldý");
		
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
