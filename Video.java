package com.company;

public class Video {
    private String nameVideo;
    private int qualityVideo;
    private double weightVideo;

    public String getNameVideo() {
        return nameVideo;
    }

    public void setNameVideo(String nameVideo) {
        this.nameVideo = nameVideo;
    }

    public int getQualityVideo() {
        return qualityVideo;
    }

    public void setQualityVideo(int qualityVideo) {
        this.qualityVideo = qualityVideo;
    }

    public double getWeightVideo() {
        return weightVideo;
    }

    public void setWeightVideo(double weightVideo) {
        this.weightVideo = weightVideo;
    }

    public Video(String nameVideo, int qualityVideo, double weightVideo) {
        this.nameVideo = nameVideo;
        this.qualityVideo = qualityVideo;
        this.weightVideo = weightVideo;
    }
}
