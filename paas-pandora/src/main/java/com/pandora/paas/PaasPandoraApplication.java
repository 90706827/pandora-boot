package com.pandora.paas;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * vm  -Djmenv.tbsite.net=127.0.0.1 -Dhsf.server.ip=127.0.0.1
 * @Description
 * @Author zhangguoq
 **/
@SpringBootApplication
public class PaasPandoraApplication {

    public static void main(String[] args) {
        //启动Pandora Boot用于加载Pandora容器。
        PandoraBootstrap.run(args);
        SpringApplication.run(PaasPandoraApplication.class);
        //标记服务启动完成，并设置线程wait。防止业务代码运行完毕退出后，导致容器退出。
        PandoraBootstrap.markStartupAndWait();
    }
}