package com.yueyibo.homework.mapper;


import com.yueyibo.homework.pojo.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * ClassName:UserMapper
 * <p>
 * Package:com.yueyibo.homework.mapper
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2023/12/25-12:06
 * @Version: v1.0
 */






@Mapper
public interface UserMapper {

    void register(User user);

    User selectUserById(Integer id);

    void updateUserInformation(User user);

    void deleteUserById(Integer id);

}

