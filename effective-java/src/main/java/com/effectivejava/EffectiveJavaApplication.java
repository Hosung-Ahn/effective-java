package com.effectivejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class EffectiveJavaApplication {

	public static void main(String[] args) throws ClassNotFoundException {
		SpringApplication.run(EffectiveJavaApplication.class, args);
	}

}
