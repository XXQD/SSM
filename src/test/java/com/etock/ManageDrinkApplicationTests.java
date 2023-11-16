package com.etock;

import com.etock.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManageDrinkApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void selectOne(){
        System.out.println(userService.IfIsNull("zhangsan"));
    }

}
