package com.egencia.rail.repositories;

import com.egencia.rail.Models.Solution;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rnair on 11/20/15.
 */
public interface SearchRepository extends MongoRepository<Solution, String>{
}
