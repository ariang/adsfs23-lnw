package com.example.demo.junit_demo2;

import org.springframework.boot.SpringApplication;

public class JunitDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(JunitDemo2Application.class, args);
		int number = 1234;
			String romanNumeral = RomanNumeralsConverter.convertToRoman(number);
			
			System.out.println("Number: " + number);
			System.out.println("Roman Numeral: " + romanNumeral);
	}

}
