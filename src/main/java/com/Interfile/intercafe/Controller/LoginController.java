package com.Interfile.intercafe.Controller;

import com.Interfile.intercafe.Entity.UserEntity;
import com.Interfile.intercafe.HashGenerator;
import com.Interfile.intercafe.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api")
@CrossOrigin("/api")
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public UserEntity userLogin(@RequestBody Map<String, String> loginBody)
    {
        return userService.performLogin(loginBody.get("username"), HashGenerator.md5(loginBody.get("password")));
    }

}
