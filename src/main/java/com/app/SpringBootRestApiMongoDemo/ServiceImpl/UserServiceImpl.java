package com.app.SpringBootRestApiMongoDemo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.SpringBootRestApiMongoDemo.Dao.UsersDao;
import com.app.SpringBootRestApiMongoDemo.Entity.User;
import com.app.SpringBootRestApiMongoDemo.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UsersDao usersDao;
	
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return usersDao.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return usersDao.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return usersDao.findAll();
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		usersDao.deleteById(userId);

	}

	@Override
	public Optional<User> getUser(String userId) {
		// TODO Auto-generated method stub
		return usersDao.findById(userId);
				
	}

}
