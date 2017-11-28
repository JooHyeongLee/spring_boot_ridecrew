package com.ridecrew.springbootridecrew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@Autowired
    private BlogDao blogDao;
	
	@RequestMapping("/")
    public String index() {
        blogDao.insertNewContent("H�ѱ����尡��??");
        return "Greetings from Spring Boot!";
    }
}
