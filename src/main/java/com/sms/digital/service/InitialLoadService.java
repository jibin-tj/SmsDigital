package com.sms.digital.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sms.digital.entity.Hotel;
import com.sms.digital.repository.HotelRepository;

@Service
public class InitialLoadService {
  Logger logger = LoggerFactory.getLogger(InitialLoadService.class);
  @Autowired
  HotelRepository hotelRepository;

  public void initilaLoad() {
    ObjectMapper mapper = new ObjectMapper();
    InputStream inputStream = TypeReference.class.getResourceAsStream("/json/data.json");
    try {
      List<Hotel> hotels = mapper.readValue(inputStream, new TypeReference<List<Hotel>>() {
      });
      hotelRepository.saveAll(hotels);
    } catch (IOException e) {
      logger.info(e.getMessage());
    }
  }
}
