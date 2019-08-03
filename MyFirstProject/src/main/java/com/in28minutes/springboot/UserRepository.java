package com.in28minutes.springboot;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Myuser, Long> {
	
	@Query("from Myuser where username=?1")
	Myuser findByUsername(String username);
	
}
