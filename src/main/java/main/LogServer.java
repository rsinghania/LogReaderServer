package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogServer
{

  public static void main(final String[] args)
  {
    System.setProperty("spring.config.name", "logServer");
    SpringApplication.run(LogServer.class, args);
  }
}
