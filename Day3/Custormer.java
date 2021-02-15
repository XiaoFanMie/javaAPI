package com.ff.javaapi.Day3;

public class Custormer {
    /*启动程序选择操作功能:1.注册,2.登录

      输入1进入注册流程,提示用户输入手机号,密码.
	  输入符合规则后将用户信息存储到用户对象中,
	  注册会产生对个用户对象,将多个用户对象存储到一个用户数组中(预定数组长度为20),
	  回到功能选择.

	  输入2进入用户登录流程,提示用户输入手机号,密码.
	   输入后 与之前保存的用户信息比较,验证手机号和密码是否存在.
	   判断登录能否成功.

     */
    private int num;
    private String passWord;

    public Custormer(int num, String passWord) {
        this.num = num;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Custormer{" +
                "num=" + num +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
