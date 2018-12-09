package com.sms.digital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.digital.service.InitialLoadService;

@SpringBootApplication
public class SmsDigitalApplication implements CommandLineRunner {
  @Autowired
  InitialLoadService initialLoadService;

  public static void main(String[] args) {
    SpringApplication.run(SmsDigitalApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    initialLoadService.initilaLoad();

  }
}
