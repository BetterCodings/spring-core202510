package com.codeit.springcore.chap04;

import com.codeit.springcore.config.AppConfig04;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelTest {

    @Test
    void hotelTest(){

        // 스프링 컨테이너(등록한 빈(객체)을 담아놓는 컨테이너)를 로딩하는 객체를 생성.
        // AppConfig04 클래스에 지정한 형식을 사용
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig04.class);

        Hotel hotel = ctx.getBean(Hotel.class);
        hotel.inform();
    }
}
