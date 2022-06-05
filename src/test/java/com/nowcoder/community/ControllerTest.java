package com.nowcoder.community;

import com.nowcoder.community.controller.HomeController;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootTest
@ContextConfiguration
public class ControllerTest {
    @Autowired
    private HomeController homeController;

//    @Test
//    public void homeControllerTest(Model model) {
//        String s = homeController.getIndexPage(model);
//        System.out.println(s);
//    }
}
