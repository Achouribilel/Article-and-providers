package com.cip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cip.ams.controllers.ArticleController;

import java.io.File;


@SpringBootApplication
public class AmsultdataApplication {

	public static void main(String[] args) {
			new File(ArticleController.uploadDirectory).mkdir();
			SpringApplication.run(AmsultdataApplication.class, args);
			}

}
