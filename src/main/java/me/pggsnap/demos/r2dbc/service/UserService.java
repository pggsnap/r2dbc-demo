package me.pggsnap.demos.r2dbc.service;

import me.pggsnap.demos.r2dbc.domain.User;
import me.pggsnap.demos.r2dbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author pggsnap
 * @date 2020/6/27
 */
@Service
public class UserService {
    @Autowired
    private DatabaseClient databaseClient;

    @Autowired
    private UserRepository userRepository;

    public Flux<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Mono<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

//    public Flux<User> findAllUsers2() {
//        databaseClient.select()
//        return databaseClient
//                .execute("select * from t_user")
//                .as(User.class)
//                .fetch()
//                .all();
//    }
}
