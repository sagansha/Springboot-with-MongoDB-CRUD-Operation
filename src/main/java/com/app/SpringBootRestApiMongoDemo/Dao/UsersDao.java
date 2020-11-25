package com.app.SpringBootRestApiMongoDemo.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.SpringBootRestApiMongoDemo.Entity.User;

@Repository
public interface UsersDao extends MongoRepository<User, String> {

}
