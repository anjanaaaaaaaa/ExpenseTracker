package com.anjana.expensetracker.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anjana.expensetracker.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, String> {
	User findByEmailIdIgnoreCase(String emailId);
	@Query("select userid from User")
	public long[] ids();
}

