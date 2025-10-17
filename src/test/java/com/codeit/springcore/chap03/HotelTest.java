package com.codeit.springcore.chap03;

import com.codeit.springcore.config.AppConfig;
import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    void hotelTest(){
        AppConfig appConfig = new AppConfig();
        Hotel hotel = appConfig.hotel();
        hotel.inform();
    }
}
