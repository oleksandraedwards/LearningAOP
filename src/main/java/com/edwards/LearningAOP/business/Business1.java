package com.edwards.LearningAOP.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwards.LearningAOP.aspect.TrackTime;
import com.edwards.LearningAOP.data.Dao1;

// component
@Service
public class Business1 {
	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	private Dao1 dao1;
	

	@TrackTime
	public String calculateSomething(){
		// business logic
		String value = dao1.retrieveSomething();
		logger.info("In the business layer - {}", value);
		return value;
	}
}
