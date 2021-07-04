package com.cognizant.springlearn;

import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
	}

	public static void displayDate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat bean = (SimpleDateFormat) context.getBean("dateFormat");
		String format = bean.format("31/12/2018");
		System.out.println(format);
		context.close();
	}

}
