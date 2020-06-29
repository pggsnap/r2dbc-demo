package me.pggsnap.demos.r2dbc.repository;

import me.pggsnap.demos.r2dbc.domain.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author pggsnap
 * @date 2020/6/27
 */
@Repository
public interface UserRepository extends R2dbcRepository<User, String> {
    @Query("select u.* from t_user u")
    Flux<User> findAll();

    @Query("select u.username, u.sex, u.birth from t_user u where u.username = :username")
    Mono<User> findByUsername(String username);
}
