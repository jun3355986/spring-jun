package com.mashibing.selftag;

/**
 * @decription: shaohuiinfo
 * @date: 2022/6/23 17:32
 * @author: longjunjie@xinpayroll.com
 * @Since:
 */
public class ShaohuiInfo {

    private String name;

    private String job;

    private int faceScore;

    private String doForHer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getFaceScore() {
        return faceScore;
    }

    public void setFaceScore(int faceScore) {
        this.faceScore = faceScore;
    }

    public String getDoForHer() {
        return doForHer;
    }

    public void setDoForHer(String doForHer) {
        this.doForHer = doForHer;
    }


    @Override
    public String toString() {
        return "ShaohuiInfo{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", faceScore=" + faceScore +
                ", doForHer='" + doForHer + '\'' +
                '}';
    }
}
