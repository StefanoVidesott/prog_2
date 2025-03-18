package data;

import data.Block;

public class Map {
    private Block[][] content;
    private int  width;
    private int height;

    public Map(int _width, int  _height) {
        this.width = _width;
        this.height = _height;

        this.content =  new Block[_width][_height];
        for(int i = 0; i < _width; i++) {
            for(int j = 0; j < _height; j++) {
                this.content[i][j] = new Block();
            }
        }
    }

    public void displayOnOut() {
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                System.out.print(this.content[i][j].display());
            }
            System.out.println();
        }
    }

    public void changeCell(int row, int col) {
        this.content[row][col] = new Block('A');
    }
}
