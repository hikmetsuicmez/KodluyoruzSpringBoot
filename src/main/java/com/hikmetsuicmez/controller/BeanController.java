package com.hikmetsuicmez.controller;

import com.hikmetsuicmez.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class BeanController {
    @Autowired
    BeanConfig beanConfig;

    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto") // url
    @ResponseBody // html olmadan direkt ekranda göster
    public String getBeanDto() {
        return beanConfig.beanDto()+"";
    }





//    public static void main(String[] args) {
//        BeanController beanController = new BeanController();
//        System.out.println(beanController);
//    }

}
