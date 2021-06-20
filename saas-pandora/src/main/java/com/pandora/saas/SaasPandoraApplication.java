package com.pandora.saas;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author zhangguoq
 **/
@SpringBootApplication
public class SaasPandoraApplication {
    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(SaasPandoraApplication.class, args);
        PandoraBootstrap.markStartupAndWait();
    }
}