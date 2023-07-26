package br.com.charlesedu.app;

import br.com.charlesedu.chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}
