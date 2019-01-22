package com.edwards.LearningAOP.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)

// infroamtion at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

}
