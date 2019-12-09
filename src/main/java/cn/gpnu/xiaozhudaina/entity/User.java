package cn.gpnu.xiaozhudaina.entity;



public class User {

    //用户Id
    public Integer userId;
    //用户名
    public String username;
    //密码
    public String password;
    //电话
    public String phoneNumber;
    //宿舍地址
    public String dormAddr;
    //图片地址
    public String imgAddr;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDormAddr() {
        return dormAddr;
    }

    public void setDormAddr(String dormAddr) {
        this.dormAddr = dormAddr;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }
}
