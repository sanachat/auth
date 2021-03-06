package com.hzit.entity;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月03日 - 16:50
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */

    public class UserInfo
    {
        private int uid;
        private String uname;
        private String upass;
        private String ustatus;
        private String wechatId;
        private WeChat weChat;

        /*public UserInfo(String wechatId) {
            this.wechatId = wechatId;
        }*/

        public int getUid() {
            return uid;
        }
        public void setUid(int uid) {
            this.uid = uid;
        }
        public String getUname() {
            return uname;
        }
        public void setUname(String uname) {
            this.uname = uname;
        }
        public String getUpass() {
            return upass;
        }
        public void setUpass(String upass) {
            this.upass = upass;
        }
        public String getUstatus() {
            return ustatus;
        }
        public void setUstatus(String ustatus) {
            this.ustatus = ustatus;
        }

        public WeChat getWeChat() {
            return weChat;
        }

        public void setWeChat(WeChat weChat) {
            this.weChat = weChat;
        }

        @Override
        public String toString() {
            return "UserInfo{" +
                    "uid=" + uid +
                    ", uname='" + uname + '\'' +
                    ", upass='" + upass + '\'' +
                    ", ustatus='" + ustatus + '\'' +
                    ", weChat=" + weChat +
                    '}';
        }
    }
