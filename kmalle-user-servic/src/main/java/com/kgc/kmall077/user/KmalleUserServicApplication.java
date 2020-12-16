package com.kgc.kmall077.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kgc.kmall077.user.mapper")
@SpringBootApplication
public class KmalleUserServicApplication {

	public static void main(String[] args) {
		SpringApplication.run(KmalleUserServicApplication.class, args);
	}

}
