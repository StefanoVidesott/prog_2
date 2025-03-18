package data;

public class Block {
    private char content;

    public Block() {
        this.content = '.';
    }

    public Block(char _content) {
        this.content = _content;
    }

    public char display() {
        return content;
    }
}
