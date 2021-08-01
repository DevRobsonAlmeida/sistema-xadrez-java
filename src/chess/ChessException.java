/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import board.BoardException;

/**
 *
 * @author 99030499
 */
public class ChessException extends BoardException{
    private static final long serialVerserionUID = 1L;
    
    public ChessException(String msg){
        super(msg);
    }
}
