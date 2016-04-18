package io.egen.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String company;
	
	@JsonIgnore
	private String password;
}
