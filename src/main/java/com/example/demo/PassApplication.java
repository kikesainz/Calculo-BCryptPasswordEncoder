package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PassApplication {

	public static void main(String[] args) {
		
		  org.springframework.security.crypto.password.PasswordEncoder encoder
		   = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();

		   // $2a$10$lB6/PKg2/JC4XgdMDXyjs.dLC9jFNAuuNbFkL9udcXe/EBjxSyqxW
		   // true
		   // $2a$10$KbQiHKTa1WIsQFTQWQKCiujoTJJB7MCMSaSgG/imVkKRicMPwgN5i
		   // true
		   // $2a$10$5WfW4uxVb4SIdzcTJI9U7eU4ZwaocrvP.2CKkWJkBDKz1dmCh50J2
		   // true
		   // $2a$10$0wR/6uaPxU7kGyUIsx/JS.krbAA9429fwsuCyTlEFJG54HgdR10nK
		   // true
		   // $2a$10$gfmnyiTlf8MDmwG7oqKJG.W8rrag8jt6dNW.31ukgr0.quwGujUuO
		   // true

		    for (int i = 0; i < 5; i++) {
		      // "1234" - plain text - user input from user interface
		      String passwd = encoder.encode("1234");

		 
		      System.out.println(passwd); // print hash

		      // true para todas las iteraciones
		      System.out.println(encoder.matches("1234", passwd));
		    }
		}

}
