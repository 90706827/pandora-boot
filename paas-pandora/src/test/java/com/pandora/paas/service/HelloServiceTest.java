package com.pandora.paas.service;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.pandora.paas.PaasPandoraApplication;
import com.taobao.pandora.boot.test.junit4.DelegateTo;
import com.taobao.pandora.boot.test.junit4.PandoraBootRunner;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.AdditionalAnswers;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @Author zhangguoq
 **/
@RunWith(PandoraBootRunner.class)
@DelegateTo(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {PaasPandoraApplication.class,HelloService.class})
@Component
public class HelloServiceTest {

    @HSFConsumer(generic = true)
    HelloService helloService;
    //普通的调用。
    @Test
    public void testInvoke() {
        TestCase.assertEquals("欢迎张三", helloService.test("张三"));
    }

    //返回值Mock。
    @Test
    public void testMock() {
        HelloService mock = Mockito.mock(HelloService.class, AdditionalAnswers.delegatesTo(helloService));
        Mockito.when(mock.test("张三")).thenReturn("欢迎张三");
        TestCase.assertEquals("欢迎张三", helloService.test("张三"));
    }
}