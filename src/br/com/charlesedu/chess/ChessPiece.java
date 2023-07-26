package br.com.charlesedu.chess;

import br.com.charlesedu.boardgame.Board;
import br.com.charlesedu.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
