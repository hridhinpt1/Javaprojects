package com.hridhinpt;

public class Room {
    private Wall wall;
    private Table table;

    public Room(Wall wall, Table table) {
        this.wall = wall;
        this.table = table;
    }

    public Wall getWall() {
        return wall;
    }

    public Table getTable() {
        return table;
    }
}
