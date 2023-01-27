package dev.be.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dev.be")
public class ModuleApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(ModuleApiApplication.class, args);
  }
}
