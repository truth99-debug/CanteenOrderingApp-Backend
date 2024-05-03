package com.Interfile.intercafe.Service;

import com.Interfile.intercafe.Entity.UserEntity;
import com.Interfile.intercafe.HashGenerator;
import com.Interfile.intercafe.Repository.UserRepository;
import com.Interfile.intercafe.exception.UserAlreadyExistsException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity performLogin(String userName, String passWord) {
        System.out.println(userName + passWord);
        return userRepository.getUserByEmailAndPassword(userName, passWord);
    }

    public UserEntity registerUser(UserEntity request) {
        Optional<UserEntity> user = this.findByEmail(request.getEmail());
        if (user.isPresent()){
            throw new UserAlreadyExistsException(
                    "User with email " + request.getEmail() + " already exists");
        }
        var newUser = new UserEntity();
        newUser.setFirstname(request.getFirstname());
        newUser.setLastname(request.getLastname());
        newUser.setEmail(request.getEmail());
        newUser.setPassword(HashGenerator.md5(request.getPassword()));
        newUser.setRole(request.getRole());
        return userRepository.save(newUser);
    }

    public Optional<UserEntity> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
