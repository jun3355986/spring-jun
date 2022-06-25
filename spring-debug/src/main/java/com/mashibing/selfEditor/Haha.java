package com.mashibing.selfEditor;

import java.util.Date;

/**
 * @className: Haha
 * @description: TODO 类描述
 * @author: jdt
 * @date: 2022/6/26 01:12
 **/
public class Haha {

    private String haWhat;

    private Date haTime;

    private int haScore;

    public String getHaWhat() {
        return haWhat;
    }

    public void setHaWhat(String haWhat) {
        this.haWhat = haWhat;
    }

    public Date getHaTime() {
        return haTime;
    }

    public void setHaTime(Date haTime) {
        this.haTime = haTime;
    }

    public int getHaScore() {
        return haScore;
    }

    public void setHaScore(int haScore) {
        this.haScore = haScore;
    }

    @Override
    public String toString() {
        return "Haha{" +
                "haWhat='" + haWhat + '\'' +
                ", haTime=" + haTime +
                ", haScore=" + haScore +
                '}';
    }
}
