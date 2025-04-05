package com.eduerp.edu_erp_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer//config Server를 위한 애노테이션
public class EduErpConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduErpConfigServerApplication.class, args);
	}
}