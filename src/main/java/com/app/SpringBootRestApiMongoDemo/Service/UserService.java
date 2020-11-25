package com.app.SpringBootRestApiMongoDemo.Service;

import java.util.List;
import java.util.Optional;

import com.app.SpringBootRestApiMongoDemo.Entity.User;

public interface UserService {

	User save(User user);

	User updateUser(User user);

	List<User> getAllUser();

	void deleteUser(String userId);

	Optional<User> getUser(String userId);

}
