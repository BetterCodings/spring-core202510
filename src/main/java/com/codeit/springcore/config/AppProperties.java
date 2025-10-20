package com.codeit.springcore.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
// Properites(yml)에 있는 설정값을 여러 개 읽어올 때 사용. (prefix로 접두어 설정)
@ConfigurationProperties(prefix = "my-app")
@Getter @Setter @ToString
public class AppProperties {

    // 필드명은 설정의 key랑 동일하게 작성 필수
    private String name;
    private String version;
    private Admin admin;
    private List<String> features;

    // 하위 구조가 추가로 더 존재하는 경우에는 별도의 클래스로 관리. (내부 클래스)
    @Getter @Setter @ToString
    public static class Admin {
        private String email;
        private String phone;
    }
}
