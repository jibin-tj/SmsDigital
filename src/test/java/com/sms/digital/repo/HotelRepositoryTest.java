package com.sms.digital.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sms.digital.repository.HotelRepository;
import com.sms.digital.service.InitialLoadService;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class HotelRepositoryTest {

  @BeforeEach
  void setUp() throws Exception {
  }

  @Autowired
  InitialLoadService service;

  @Autowired
  HotelRepository repo;

  @Test
  @DisplayName("Initial load sucess.Repo not empty")
  void test() {
    assertThat(repo.findAll()).isNotEmpty();
  }

  @Test
  @DisplayName("findByIdTest")
  void finByIdtest() {
    assertThat(repo.findById(1)).matches(hotel -> hotel.get().getId() == 1);
  }

}
