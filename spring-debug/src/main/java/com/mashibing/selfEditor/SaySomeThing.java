package com.mashibing.selfEditor;

/**
 * @className: SaySomeThing
 * @description: TODO 类描述
 * @author: jdt
 * @date: 2022/6/26 01:19
 **/
public class SaySomeThing {

    private String whoSaying;

    private Haha saying;

    public String getWhoSaying() {
        return whoSaying;
    }

    public void setWhoSaying(String whoSaying) {
        this.whoSaying = whoSaying;
    }

    public Haha getSaying() {
        return saying;
    }

    public void setSaying(Haha saying) {
        this.saying = saying;
    }

    @Override
    public String toString() {
        return "SaySomeThing{" +
                "whoSaying='" + whoSaying + '\'' +
                ", saying=" + saying +
                '}';
    }
}
