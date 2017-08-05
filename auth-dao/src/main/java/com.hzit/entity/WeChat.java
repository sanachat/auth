package com.hzit.entity;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月05日 - 11:19
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class WeChat
{
    private String wechatId;
    private String wechatName;
    private String wechatImage;
    private UserInfo userInfo;

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    public String getWechatImage() {
        return wechatImage;
    }

    public void setWechatImage(String wechatImage) {
        this.wechatImage = wechatImage;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "WeChat{" +
                "wechatId='" + wechatId + '\'' +
                ", wechatName='" + wechatName + '\'' +
                ", wechatImage='" + wechatImage + '\'' +
                ", userInfo=" + userInfo +
                '}';
    }
}
