package com.hzq.desginpatterns.builder;

/**
 * Created by hzq on 2018/4/28.
 */

/**
 * 方式1-链式写法构造对象, 借助内部Builder类，不破坏BuilderDemo2类结构
 * 目的：优雅创建对象。
 */
public class BuilderDemo2 {

    private String username;
    private String password;
    private String email;
    private String desc;

    public BuilderDemo2(Builder builder){
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.desc = builder.desc;
    }

    static class Builder{
        private String username;
        private String password;
        private String email;
        private String desc;

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public BuilderDemo2 build(){
            return new BuilderDemo2(this);
        }
    }

    public BuilderDemo2 setUsername(String username) {
        this.username = username;
        return this;
    }

    public BuilderDemo2 setPassword(String password) {
        this.password = password;
        return this;
    }

    public BuilderDemo2 setEmail(String email) {
        this.email = email;
        return this;
    }

    public BuilderDemo2 setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return "BuilderDemo2{" + "username='" + username + '\'' + ", password='" + password + '\'' + ", email='" + email
                + '\'' + ", desc='" + desc + '\'' + '}';
    }

    public static void main(String[] args) {
        BuilderDemo2.Builder builder = new Builder();
        BuilderDemo2 demo2 = builder.setUsername("hzq")
                .setPassword("123")
                .setEmail("1@qq.com")
                .setDesc("18").build();

        System.out.println(demo2.toString());
    }
}
