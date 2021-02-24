package com.wangzhenghe.POJO;

public class User {

    private Cat cat;
    private Dog dog;

    private String str;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat.toString() +
                ", dog=" + dog.toString()+
                ", str='" + str + '\'' +
                '}';
    }
}
