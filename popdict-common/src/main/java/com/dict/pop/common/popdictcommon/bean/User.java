/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: User
 * Author:   lin
 * Date:     2018/9/29 14:10
 * Description: 用户bean
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dict.pop.common.popdictcommon.bean;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户bean〉
 *
 * @author lin
 * @create 2018/9/29
 * @since 1.0.0
 */
public class User {
    public String prikey;
    public String name;
    public String password;
    public String sign;
    public String headPic;
    public Date registerTime;
    public Date lastLoginTime;

    public String getPrikey() {
        return prikey;
    }

    public void setPrikey(String prikey) {
        this.prikey = prikey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
