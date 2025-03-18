package data;

import data.Block;

public class Map {
    private Block[][] content;
    private int  width = 15;
    private int height = 15;

    public Map() {
        this.content =  new Block[width][height];
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                this.content[i][j] = new Block();
            }
        }
    }

    public void display_on_out() {
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                System.out.print(this.content[i][j].toString());
            }
            System.out.println();
        }
    }

    public void change_cell(int row, int col) {
        this.content[row][col] = new Block('A');
    }
}
