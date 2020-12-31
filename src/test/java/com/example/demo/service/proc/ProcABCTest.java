package com.example.demo.service.proc;

import com.example.demo.until.SpringUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProcABCTest {


    @Autowired
    ProcABC procABC;

    @Before
    public void init() {
        System.out.println("ddddddd");
    }
    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }


    @Test
    public void test() {
        procABC.process();
        SpringUtil.getBean(ProcABC.class).process();
    }

}