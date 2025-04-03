package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringApplication {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(DemospringApplication.class, args);
		HomeController hc = new HomeController();
		int x = s.nextInt();
		if (hc.sint == x) {
			hc.sample2();
		}
	}
}
