package com.codeit.springcore.chap01;

public class WesternRestaurant {

    private JohnChef johnChef = new JohnChef();

    private WesternCourse westernCourse = new WesternCourse();

    public void order() {
        System.out.println("안녕하세요 WesternRestaurant 입니다.");
        johnChef.cook();
        westernCourse.combineMenu();
    }

}
