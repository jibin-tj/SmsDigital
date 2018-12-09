package com.sms.digital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.sms.digital.entity.Hotel;

@Repository
@RepositoryRestResource(collectionResourceRel = "hotel", path = "hotel")
public interface HotelRepository extends CrudRepository<Hotel, Integer>{

}
