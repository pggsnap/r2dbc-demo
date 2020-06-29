package me.pggsnap.demos.r2dbc.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.util.StringJoiner;

/**
 * @author pggsnap
 * @date 2020/6/26
 */
@Table("t_user")
public class User {
    @Id
    private String username;

    private String password;

    private String sex;

    private LocalDate birth;

    public User() {}

    public User(String username, String password, String sex, LocalDate birth) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.birth = birth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("username='" + username + "'")
                .add("password='" + password + "'")
                .add("sex=" + sex)
                .add("birth=" + birth)
                .toString();
    }
}
