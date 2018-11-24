package idv.caemasar.demo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSameLevelPackage {
	public static void main(String[] args) {
		SpringApplication.run(AppSameLevelPackage.class, args);
	}
}
