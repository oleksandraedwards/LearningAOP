package com.edwards.LearningAOP.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwards.LearningAOP.data.Dao2;


@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething(){
		// business logic
		return dao2.retrieveSomething();
	}

}
