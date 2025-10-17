package com.codeit.springcore.chap03;

public class WesternRestaurant implements Restaurant {

    private Chef johnChef;

    private Course westernCourse;

    public WesternRestaurant(Chef johnChef, Course westernCourse) {
        this.johnChef = johnChef;
        this.westernCourse = westernCourse;
    }

    public void order() {
        System.out.println("안녕하세요 WesternRestaurant 입니다.");
        johnChef.cook();
        westernCourse.combineMenu();
    }

}
