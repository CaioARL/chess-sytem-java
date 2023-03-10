package application;

import java.util.Scanner;

import javax.sound.sampled.TargetDataLine;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.println("Targeet: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
		
	}

}