package com.codeit.springcore.config;

import com.codeit.springcore.chap03.*;

public class AppConfig {
    // 쉐프 객체 생성
    public Chef chef01() {
        return new KimChef();
    }

    public Chef chef02() {
        return new JohnChef();
    }

    // 코스 요리 객체 생성
    public Course course01() {
        return new SushiCourse();
    }

    public Course course02() {
        return new WesternCourse();
    }

    // 레스토랑 객체 생성
    public Restaurant restaurant01() {
        return new AsianRestaurant(chef01(), course01());
    }

    public Restaurant restaurant02() {
        return new WesternRestaurant(chef02(), course02());
    }

    // 호텔 객체 생성
    public Hotel hotel() {
        return new Hotel(restaurant01(), chef01());
    }
}
