package com.rest.restapi.repository;

import com.rest.restapi.entity.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends MongoRepository<Entry,String> {

}