package com.gamba.uploadedNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.gamba.uploadedNew.uploadFile.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadedNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadedNewApplication.class, args);
	}

}
