package br.com.charlesedu.chess.pieces;

import br.com.charlesedu.boardgame.Board;
import br.com.charlesedu.chess.ChessPiece;
import br.com.charlesedu.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
