package com.example.kltntest.repository;

import com.example.kltntest.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
