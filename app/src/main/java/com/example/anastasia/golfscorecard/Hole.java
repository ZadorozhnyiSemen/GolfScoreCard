package com.example.anastasia.golfscorecard;

public class Hole {
    private String mHole;
    private int mStrokeCount;

    public Hole(String hole, int strokeCount) {
        mHole = hole;
        mStrokeCount = strokeCount;
    }

    public String getHole() {
        return mHole;
    }

    public void setHole(String hole) {
        mHole = hole;
    }

    public int getStrokeCount() {
        return mStrokeCount;
    }

    public void setStrokeCount(int strokeCount) {
        mStrokeCount = strokeCount;
    }
}
