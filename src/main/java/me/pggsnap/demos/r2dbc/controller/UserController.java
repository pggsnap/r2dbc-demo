package me.pggsnap.demos.r2dbc.controller;

import me.pggsnap.demos.r2dbc.domain.User;
import me.pggsnap.demos.r2dbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author pggsnap
 * @date 2020/6/28
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findall")
    public Flux<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/findbyusername")
    public Mono<User> findByUsername(String username) {
        return userService.findByUsername(username);
    }
}
