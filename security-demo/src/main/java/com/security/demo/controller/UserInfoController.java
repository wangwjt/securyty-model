package com.security.demo.controller;

import com.security.demo.dto.entity.User;
import com.security.demo.dto.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangjiantao
 * @date 2020/4/29 11:30
 */
@RestController
public class UserInfoController {

    @GetMapping("/AllUser")
    public UserVO getAllUserInfo() {
        UserVO userVO = new UserVO();
        List<User> userList = Arrays.asList(new User("123", "abc"),
                new User("456", "def"),
                new User("789", "qwe"));
        return userVO;
    }

}
