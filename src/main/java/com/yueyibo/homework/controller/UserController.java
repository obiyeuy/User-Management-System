package com.yueyibo.homework.controller;

import com.yueyibo.homework.pojo.User;
import com.yueyibo.homework.service.UserService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName:UserController
 * <p>
 * Package:com.yueyibo.homework.controller
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2023/12/25-12:21
 * @Version: v1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

        @Autowired
        private UserService userService;

        @RequestMapping(value="/register",method = RequestMethod.POST)
        public void register(@RequestBody User user) {
            userService.register(user);
        }


//        @Log
        @RequestMapping(value="/update",method = RequestMethod.PUT)
        public void updateUserInformation(@RequestBody User user) {
                userService.updateUserInformation(user);

        }


//        @Log
        @RequestMapping(value="/show",method = RequestMethod.GET)
        public User selfSelect(int id) {
                User user = userService.selectUserById(id);
                return user;
        }

//        @Log
        @RequestMapping(value="/logoff",method = RequestMethod.DELETE)
        public void logout(int id){
                userService.deleteUserById(id);
        }

}
