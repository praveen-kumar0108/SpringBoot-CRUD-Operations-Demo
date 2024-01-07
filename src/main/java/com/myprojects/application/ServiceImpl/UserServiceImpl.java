package com.myprojects.application.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.application.Entity.User;
import com.myprojects.application.Repository.UserRepository;
import com.myprojects.application.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		
		return userRepo.findAll();
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
		
	}
	@Override
	public Optional<User> getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	@Override
	public User updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = userRepo.findById(id);
		if (optionalUser.isPresent()) {
	        User existingUser = optionalUser.get();
	        existingUser.setName(user.getName());
	        existingUser.setEmail(user.getEmail());

	        return userRepo.save(existingUser);
	    } else {
	        return null;
	    }
	}

	
	

	
	

	
	

}
