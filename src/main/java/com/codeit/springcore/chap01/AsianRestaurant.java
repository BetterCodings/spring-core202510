package com.codeit.springcore.chap01;

public class AsianRestaurant {

    private KimChef chef = new KimChef();

    private SushiCourse course = new SushiCourse();

    public void order() {
        System.out.println("안녕하세요. 아시안 레스토랑 입니다.");
        chef.cook();
        course.combineMenu();
    }
}
