package br.com.charlesedu.chess.pieces;

import br.com.charlesedu.boardgame.Board;
import br.com.charlesedu.chess.ChessPiece;
import br.com.charlesedu.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] posibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        return mat;
    }
}
