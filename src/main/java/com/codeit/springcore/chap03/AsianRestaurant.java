package com.codeit.springcore.chap03;

public class AsianRestaurant implements Restaurant {

    private Chef chef;
    private Course course;

    // 의존객체를 직접 생성하는 것이 아닌, 외부에서 생성자를 통해 전달할 예정.
    public AsianRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        System.out.println("안녕하세요. 아시안 레스토랑 입니다.");
        chef.cook();
        course.combineMenu();
    }
}
