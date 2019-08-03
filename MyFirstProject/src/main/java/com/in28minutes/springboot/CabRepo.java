package com.in28minutes.springboot;

import org.springframework.data.repository.CrudRepository;

public interface CabRepo extends CrudRepository<MyCab, Integer>{
	public MyCab findByPhone(String phone); 
}
