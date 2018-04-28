package com.hzq.desginpatterns.builder;

/**
 * Created by hzq on 2018/4/28.
 */

/**
 * 方式1-链式写法构造对象, 不需要Builder类，直接set方法中返回this
 * 目的：优雅创建对象。
 */
public class BuilderDemo1 {

    private String username;
    private String password;
    private String email;
    private String desc;

    public BuilderDemo1 setUsername(String username) {
        this.username = username;
        return this;
    }

    public BuilderDemo1 setPassword(String password) {
        this.password = password;
        return this;
    }

    public BuilderDemo1 setEmail(String email) {
        this.email = email;
        return this;
    }

    public BuilderDemo1 setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return "BuilderDemo1{" + "username='" + username + '\'' + ", password='" + password + '\'' + ", email='" + email
                + '\'' + ", desc='" + desc + '\'' + '}';
    }

    public static void main(String[] args) {
        BuilderDemo1 demo1 = new BuilderDemo1();
        demo1.setUsername("hzq")
                .setPassword("123")
                .setEmail("1@qq.com")
                .setDesc("18");

        System.out.println(demo1.toString());
    }
}
