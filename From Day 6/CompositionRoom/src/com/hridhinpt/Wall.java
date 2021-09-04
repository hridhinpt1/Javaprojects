package com.hridhinpt;

public class Wall {
    private int wall1;
    private int wall2;
    private int wall3;
    private int wall4;
    private String wallColor;

    public Wall(int wall1, int wall2, int wall3, int wall4, String wallColor) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.wallColor = wallColor;
    }

    public int getWall1() {
        return wall1;
    }

    public int getWall2() {
        return wall2;
    }

    public int getWall3() {
        return wall3;
    }

    public int getWall4() {
        return wall4;
    }

    public String getWallColor() {
        return wallColor;
    }
}
