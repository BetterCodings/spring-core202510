package com.codeit.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 이 클래스는 Bean을 등록하기 위한 설정 클래스다
// 지정한 패키지 내에 있는 @Component가 붙은 객체들을 모두 스캔해서 빈으로 등록한다
// 테스트를 위해서 설정 -> 서버를 돌릴 때는 굳이 필요없다 (@SpringBootApplication이 모든 것을 다해준다)
@ComponentScan(basePackages = "com.codeit.springcore.chap04")
public class AppConfig04 {
}
