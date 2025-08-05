package com.pm.auth_service.Service;

import com.pm.auth_service.Model.User;
import com.pm.auth_service.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Optional<User> findByEmail (String email){
        return userRepository.findByEmail(email);
    }
}
