package me.pggsnap.demos.r2dbc.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Optional;

/**
 * @author pggsnap
 * @date 2020/6/26
 */
public enum SexEnum {
    MALE("m"),
    FEMALE("f");

    private String sex;

    SexEnum(String sex) {
        this.sex = sex;
    }

    @JsonValue
    public String getSex() {
        return this.sex;
    }

    @JsonCreator
    public static SexEnum decode(final String sex) {
        return Optional.ofNullable(SexEnum.valueOf(sex)).orElse(null);
    }
}
