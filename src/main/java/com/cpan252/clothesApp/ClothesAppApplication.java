package com.cpan252.clothesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClothesAppApplication {
	private String id;
	private String name;
	private int creationYear = 1992;
	private double price = 129.99;

	public enum brand{
		JORDAN,NIKE,ADIDAS,REEBOCK;
	}
	public static void main(String[] args) {
		SpringApplication.run(ClothesAppApplication.class, args);
	}

}
