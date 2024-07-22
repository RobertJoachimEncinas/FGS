package Inheritance2.Abstract;

public class Pawn extends Piece {
    private boolean hasMoved;

    public Pawn(int row, int col) {
        this.row = row;
        this.col = col;
        this.hasMoved = false;
    }

    @Override
    protected void move(int row, int col) {
        this.row = row;
        this.col = col;
        this.hasMoved = true;
    }
}
