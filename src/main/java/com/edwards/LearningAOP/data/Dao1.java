package com.edwards.LearningAOP.data;

import org.springframework.stereotype.Repository;

import com.edwards.LearningAOP.aspect.TrackTime;

@Repository
public class Dao1 {
	
	// retrieve instead of get

	@TrackTime
	public String retrieveSomething(){
		return "Dao1";
	}

}
