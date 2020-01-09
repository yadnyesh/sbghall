package io.yadnyesh.sbghall.service;

import io.yadnyesh.sbghall.model.User;
import io.yadnyesh.sbghall.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Iterable<User> saveUsers(List<User> userList) {
		return userRepository.saveAll(userList);
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public Iterable<User> list() {
		return userRepository.findAll();
	}
}
