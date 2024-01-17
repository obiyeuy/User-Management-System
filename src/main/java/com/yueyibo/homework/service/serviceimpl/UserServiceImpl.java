package com.yueyibo.homework.service.serviceimpl;

import com.yueyibo.homework.mapper.UserMapper;
import com.yueyibo.homework.pojo.User;
import com.yueyibo.homework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName:UserServiceImpl
 * <p>
 * Package:com.yueyibo.homework.service.serviceimpl
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2023/12/25-12:27
 * @Version: v1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
//    @Autowired
//    UserResumeMapper userResumeMapper;



    @Override
    public void updateUserInformation(User user) {
//        user.setId();
//        user.setUpdateTime(LocalDateTime.now());
//        userBasicInformationMapper.updateUserInformation(userBasicInformation);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
//        userResumeMapper.deleteByIds(ids);
    }

    @Override
    public void register(User user) {
        System.out.println(user);
        userMapper.register(user);
    }

    @Override
    public User selectUserById(Integer id) {
        User user = userMapper.selectUserById(id);
        return user;
    }

}

