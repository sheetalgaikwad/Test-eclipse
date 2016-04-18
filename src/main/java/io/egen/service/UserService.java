package io.egen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import io.egen.entity.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		users.add(new User("101", "Praveen1", "Salitra", "psalitra1@egen.io", "Egen Solutions", "password"));
		users.add(new User("102", "Praveen2", "Salitra", "psalitra2@egen.io", "Egen Solutions", "password"));
		users.add(new User("103", "Praveen3", "Salitra", "psalitra3@egen.io", "Egen Solutions", "password"));
		users.add(new User("104", "Praveen4", "Salitra", "psalitra4@egen.io", "Egen Solutions", "password"));
		return users;
	}
	
	public User findOne(String id) {
		return new User(id, "Praveen", "Salitra", "psalitra@egen.io", "Egen Solutions", "password");
	}
	
	public User create(User user) {
		String someid = UUID.randomUUID().toString();
		user.setId(someid);
		
		return user;
	}
	
	
}
