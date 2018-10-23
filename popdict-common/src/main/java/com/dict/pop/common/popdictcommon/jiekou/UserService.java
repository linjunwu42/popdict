/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserService
 * Author:   lin
 * Date:     2018/9/28 16:03
 * Description: 用户登录接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dict.pop.common.popdictcommon.jiekou;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户登录接口〉
 *
 * @author lin
 * @create 2018/9/28
 * @since 1.0.0
 */
public interface UserService {
    boolean register(String name, String password);
}
