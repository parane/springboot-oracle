package com.parane.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	private static final String GREEN = "\u001B[" + AnsiColor.GREEN + "m";
	private static final String CYAN = "\u001B[" + AnsiColor.CYAN + "m";
	private static final String MAGENTA = "\u001B[" + AnsiColor.BRIGHT_MAGENTA + "m";
	private static final String RESET = "\u001B[0m";
	private static final String SEPERATOR = "------------------------------------------------------";


	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		//printBeans( ctx);
	}
/*	private static void printBeans(ApplicationContext ctx) {

		consoleOut(MAGENTA, "\n\nInspecting the beans available at Messaging Engine");
		consoleOut(MAGENTA, SEPERATOR);

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			consoleOut(CYAN, beanName);
		}
	}

	private static void consoleOut(String color, String message) {
		System.out.println(color + message + RESET);
	}*/

}
