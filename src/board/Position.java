/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

/**
 *
 * @author 99030499
 */
public class Position {

    private int row;
    private int column;

    public Position() {
    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }

}
