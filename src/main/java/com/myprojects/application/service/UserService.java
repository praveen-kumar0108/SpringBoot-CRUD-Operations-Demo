package com.myprojects.application.service;

import java.util.List;
import java.util.Optional;

import com.myprojects.application.Entity.User;

public interface UserService {
	List<User> getAllUser();
	User createUser (User user);
	Optional<User> getUserById(Long id);
	void deleteUser (Long id);
	User updateUser(Long id, User user);
	

}
