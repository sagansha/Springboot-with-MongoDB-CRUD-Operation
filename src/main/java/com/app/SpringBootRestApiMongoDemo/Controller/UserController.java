package com.app.SpringBootRestApiMongoDemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.SpringBootRestApiMongoDemo.Entity.User;
import com.app.SpringBootRestApiMongoDemo.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.save(user);
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@GetMapping("/getuser/{id}")
	public Optional<User> getUser(@PathVariable String id) {
		return userService.getUser(id);
	}

	@GetMapping("/getalluser")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@DeleteMapping("/deluser/{id}")
	public void delUser(@PathVariable String id) {
		userService.deleteUser(id);
	}

}
