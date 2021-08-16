package com.maksuu.TreesCampsAPI;

public class Map {
    private int[][] map;

    // 0 - clear
    // 1 - grass
    // 2 - camp
    // 3 - tree

    public int width = 0;
    public int height = 0;

    public Map(int width, int height) {
        if(setMapSize(width, height))
            map = new int[this.width][this.height];
    }

    private boolean setMapSize(int width, int height) {
        if(width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        }
        return false;
    }

    public void tileClick(int x, int y) {
        if(x < width && y < height) {
            if(map[x][y] < 2)
                map[x][y]++;
            else if(map[x][y] == 2)
                map[x][y] = 0;
        }
    }

    public int[][] getMapArray() {
        return map;
    }

    public int getTile(int x, int y) {
        if(x < width && y < height) {
            return map[x][y];
        }
        return -1;
    }
}