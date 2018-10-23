/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserMapper
 * Author:   lin
 * Date:     2018/9/29 14:14
 * Description: 用户映射
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dict.pop.user.popdictuser.mapper;

import com.dict.pop.common.popdictcommon.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户映射〉
 *
 * @author lin
 * @create 2018/9/29
 * @since 1.0.0
 */
@Repository
public interface UserMapper {
    /*
    登录查找用户
    * */
    @Select("select * from user where userId = #{prikey}")
    User findUserByUserid(String userId);

    /*
    新增用户
     */
    @Insert("insert into user (prikey,name,password) values (#{prikey},#{name},#{password})")
    boolean insertUsers (User user);
}
