package com.edwards.LearningAOP.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
	
	// retrieve instead of get
	public String retrieveSomething(){
		return "Dao2";
	}

}
