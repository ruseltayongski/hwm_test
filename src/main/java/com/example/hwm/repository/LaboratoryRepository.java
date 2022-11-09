package com.example.hwm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.hwm.model.*;

import java.util.List;

@Repository
public interface LaboratoryRepository extends MongoRepository<Laboratory, String> {
    List<Laboratory> getLabByUserId(String userId);
}
