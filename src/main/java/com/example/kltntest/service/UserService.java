package com.example.kltntest.service;

import com.example.kltntest.dto.request.UserCreationRequest;
import com.example.kltntest.entity.UserEntity;
import com.example.kltntest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity createUser(UserCreationRequest request) {
        UserEntity userEntity = new UserEntity();

        userEntity.setEmail(request.getEmail());
        userEntity.setFirstName(request.getFirstName());
        userEntity.setLastName(request.getLastName());
        userEntity.setUsername(request.getUsername());
        userEntity.setPassword(request.getPassword());

        return userRepository.save(userEntity);
    }
}
