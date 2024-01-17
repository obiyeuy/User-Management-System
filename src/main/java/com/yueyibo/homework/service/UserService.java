package com.yueyibo.homework.service;


import com.yueyibo.homework.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName:User
 * <p>
 * Package:com.yueyibo.homework.pojo
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2023/12/24-20:57
 * @Version: v1.0
 */


@Transactional
public interface UserService {
    void register(User user);


    User selectUserById(Integer id);

    void updateUserInformation(User user);

    void deleteUserById(Integer id);

}