package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogClient 
{

  public static void main(final String[] args)
  {
    System.setProperty("spring.config.name", "logClient");
    SpringApplication.run(LogClient.class, args);
  }
}
