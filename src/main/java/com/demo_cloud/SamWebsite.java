package com.demo_cloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamWebsite {

    @RequestMapping("/demo")
    public String landingPage() {
        return "Willkommen zu Sams Website!";
    }

}
