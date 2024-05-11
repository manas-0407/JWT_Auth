package com.example.JWT_AUTH.repository;

import com.example.JWT_AUTH.models.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserEntity , Integer> {

    Optional<UserEntity> findByUsername(String username);

    boolean findExistByUsername(String username);
}
