package br.com.charlesedu.app;

import br.com.charlesedu.boardgame.Piece;

public class UI {
    public static void printBoard(Piece[][] pieces) {
        for (int row = 0; row < pieces.length; row++) {
            System.out.print((8 - row) + " ");

            for (int column = 0; column < pieces.length; column++) {
                printPiece(pieces[row][column]);
            }

            System.out.println();
        }

        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(Piece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }

        System.out.print(" ");
    }
}
