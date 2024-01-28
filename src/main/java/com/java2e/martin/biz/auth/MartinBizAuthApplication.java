package com.java2e.martin.biz.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 狮少
 * @version 1.0
 * @date 2019/5/6
 * @describtion MartinBizAuthApplication
 * @since 1.0
 */
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class MartinBizAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(MartinBizAuthApplication.class, args);
    }

    @GetMapping("/g")
    public String getSt() {
        return "1323";
    }

    @GetMapping("/g1")
    public String g1() {
        return "g1";
    }


}
