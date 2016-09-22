package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LogClient 
{

  public static void main(final String[] args)
  {
    System.setProperty("spring.config.name", "logClient");
    SpringApplication.run(LogClient.class, args);
  }
}
