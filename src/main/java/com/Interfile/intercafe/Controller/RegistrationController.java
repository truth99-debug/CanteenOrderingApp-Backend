package com.Interfile.intercafe.Controller;

import com.Interfile.intercafe.Entity.UserEntity;
import com.Interfile.intercafe.HashGenerator;
import com.Interfile.intercafe.Service.UserService;
import org.springframework.web.bind.annotation.*;
import com.Interfile.intercafe.CorsConfig;
import java.util.Map;

@RestController()
@RequestMapping("api")
@CrossOrigin("/api")
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserEntity userLogin(@RequestBody UserEntity registrationRequest){
        return userService.registerUser(registrationRequest);
    }

}
