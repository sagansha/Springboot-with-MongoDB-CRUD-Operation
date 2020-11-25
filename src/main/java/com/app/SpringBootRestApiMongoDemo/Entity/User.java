package com.app.SpringBootRestApiMongoDemo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "users")
public class User {
	
	@Id
	private String id;
	
	@Field(value = "name")
	private String name;
	
	@Field(value = "age")
	private String age;
	
	@Field(value = "subject")
	private String subject;

}
