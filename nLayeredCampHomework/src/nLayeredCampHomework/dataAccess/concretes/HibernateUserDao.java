package nLayeredCampHomework.dataAccess.concretes;

import java.util.List;

import nLayeredCampHomework.dataAccess.abstracts.UserDao;
import nLayeredCampHomework.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void login(User user) {
		System.out.println("Hibernate ile giriþ yapýldý :" +user.getFirstName());
		
	}
	
	@Override
	public void register(User user) {
		System.out.println("Hibernate ile kayýt olundu :" +user.getFirstName());
		
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
		
		return null;
	}


}
