package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.userDetails;

public interface UserRepo extends CrudRepository<userDetails, Integer> {
	
	// List<userDetails> findbByuserId(int userId);
	
	List<userDetails> findByuserIdGreaterThan(int userId);
	
	@Query("from userDetails where name=?1 order by userId")
	List<userDetails> sortByUserId(String name);

}
