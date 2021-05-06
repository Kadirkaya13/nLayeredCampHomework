package nLayeredCampHomework.dataAccess.abstracts;

import java.util.List;

import nLayeredCampHomework.entities.concretes.User;

public interface UserDao {
	void login(User user);
	void register(User user);
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> getAll();
	
}
