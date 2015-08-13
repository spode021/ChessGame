
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew
 */
public class ChessGame {
    
    //methods
    
    //constructor

    /**
     * creates assets for the chess game
     * 
     */
        public ChessGame(){
        
        
        //black chess pieces
        
            //black pawns
        ChessPiece pawnBlack1 =  new ChessPiece(7, 1, "pawnBlack1", Type.PAWN, TeamSide.BLACK, blackPawnIcon);
        ChessPiece pawnBlack2 =  new ChessPiece(7, 2, "pawnBlack2", Type.PAWN, TeamSide.BLACK, blackPawnIcon);
        ChessPiece pawnBlack3 =  new ChessPiece(7, 3, "pawnBlack3", Type.PAWN, TeamSide.BLACK, blackPawnIcon);
        ChessPiece pawnBlack4 =  new ChessPiece(7, 4, "pawnBlack4", Type.PAWN, TeamSide.BLACK, blackPawnIcon);
        ChessPiece pawnBlack5 =  new ChessPiece(7, 5, "pawnBlack5", Type.PAWN, TeamSide.BLACK, blackPawnIcon);
        ChessPiece pawnBlack6 =  new ChessPiece(7, 6, "pawnBlack6", Type.PAWN, TeamSide.BLACK, blackPawnIcon);
        ChessPiece pawnBlack7 =  new ChessPiece(7, 7, "pawnBlack7", Type.PAWN, TeamSide.BLACK, blackPawnIcon);
        ChessPiece pawnBlack8 =  new ChessPiece(7, 8, "pawnBlack8", Type.PAWN, TeamSide.BLACK, blackPawnIcon);
        
            //black rooks
        ChessPiece rookBlack1 =  new ChessPiece(8, 1, "rookBlack1", Type.ROOK, TeamSide.BLACK, blackRookIcon);
        ChessPiece rookBlack2 =  new ChessPiece(8, 8, "rookBlack2", Type.ROOK, TeamSide.BLACK, blackRookIcon);
        
            //black knights
        ChessPiece knightBlack1 =  new ChessPiece(8, 2, "knightBlack1", Type.KNIGHT, TeamSide.BLACK, blackKnightIcon);
        ChessPiece knightBlack2 =  new ChessPiece(8, 7, "knightBlack2", Type.KNIGHT, TeamSide.BLACK, blackKnightIcon);
    
            //black bishops
        
        ChessPiece bishopBlack1 =  new ChessPiece(8, 3, "bishipBlack1", Type.BISHOP, TeamSide.BLACK, blackBishopIcon);
        ChessPiece bishopBlack2 =  new ChessPiece(8, 6, "bishipBlack2", Type.BISHOP, TeamSide.BLACK, blackBishopIcon);
        
            //black king
        ChessPiece kingBlack =  new ChessPiece(8, 4, "kingBlack", Type.KING, TeamSide.BLACK, blackKingIcon);
    
            //black queen
        ChessPiece queenBlack =  new ChessPiece(8, 5, "queenBlack", Type.QUEEN, TeamSide.BLACK, blackQueenIcon);
    
    
        //white chess pieces
        
            //white pawns
        ChessPiece pawnWhite1 =  new ChessPiece(2, 1, "pawnWhite1", Type.PAWN, TeamSide.WHITE, whitePawnIcon);
        ChessPiece pawnWhite2 =  new ChessPiece(2, 2, "pawnWhite2", Type.PAWN, TeamSide.WHITE, whitePawnIcon);
        ChessPiece pawnWhite3 =  new ChessPiece(2, 3, "pawnWhite3", Type.PAWN, TeamSide.WHITE, whitePawnIcon);
        ChessPiece pawnWhite4 =  new ChessPiece(2, 4, "pawnWhite4", Type.PAWN, TeamSide.WHITE, whitePawnIcon);
        ChessPiece pawnWhite5 =  new ChessPiece(2, 5, "pawnWhite5", Type.PAWN, TeamSide.WHITE, whitePawnIcon);
        ChessPiece pawnWhite6 =  new ChessPiece(2, 6, "pawnWhite6", Type.PAWN, TeamSide.WHITE, whitePawnIcon);
        ChessPiece pawnWhite7 =  new ChessPiece(2, 7, "pawnWhite7", Type.PAWN, TeamSide.WHITE, whitePawnIcon);
        ChessPiece pawnWhite8 =  new ChessPiece(2, 8, "pawnWhite8", Type.PAWN, TeamSide.WHITE, whitePawnIcon);
        
            //white rooks
        ChessPiece rookWhite1 =  new ChessPiece(1, 1, "rookWhite1", Type.ROOK, TeamSide.WHITE, whiteRookIcon);
        ChessPiece rookWhite2 =  new ChessPiece(1, 8, "rookWhite2", Type.ROOK, TeamSide.WHITE, whiteRookIcon);
        
            //white knights
        ChessPiece knightWhite1 =  new ChessPiece(1, 2, "knightWhite1", Type.KNIGHT, TeamSide.WHITE, whiteKnightIcon);
        ChessPiece knightWhite2 =  new ChessPiece(1, 7, "knightWhite2", Type.KNIGHT, TeamSide.WHITE, whiteKnightIcon);
    
            //white bishops
        
        ChessPiece bishopWhite1 =  new ChessPiece(1, 3, "bishipWhite1", Type.BISHOP, TeamSide.WHITE, whiteBishopIcon);
        ChessPiece bishopWhite2 =  new ChessPiece(1, 6, "bishipWhite2", Type.BISHOP, TeamSide.WHITE, whiteBishopIcon);
        
            //white king
        ChessPiece kingWhite =  new ChessPiece(1, 4, "kingWhite", Type.KING, TeamSide.WHITE, whiteKingIcon);
    
            //white queen
        ChessPiece queenWhite =  new ChessPiece(1, 5, "queenWhite", Type.QUEEN, TeamSide.WHITE, whiteQueenIcon);
    
        //add black pieces to pieceList
        
        
        pieceList.add(rookBlack1);
        pieceList.add(bishopBlack1);
        pieceList.add(knightBlack1);
        
        pieceList.add(queenBlack);
        pieceList.add(kingBlack);
        
        pieceList.add(knightBlack2);
        pieceList.add(bishopBlack2);
        pieceList.add(rookBlack2);
        
        
        
        
        
        pieceList.add(pawnBlack1);
        pieceList.add(pawnBlack2);
        pieceList.add(pawnBlack3);
        pieceList.add(pawnBlack4);
        pieceList.add(pawnBlack5);
        pieceList.add(pawnBlack6);
        pieceList.add(pawnBlack7);
        pieceList.add(pawnBlack8);
        
        //add white pieces to pieceList
        
        pieceList.add(rookWhite1);
        pieceList.add(bishopWhite1);
        pieceList.add(knightWhite1);
        
        pieceList.add(queenWhite);
        pieceList.add(kingWhite);
        
        pieceList.add(knightWhite2);
        pieceList.add(bishopWhite2);
        pieceList.add(rookWhite2);
       
        pieceList.add(pawnWhite1);
        pieceList.add(pawnWhite2);
        pieceList.add(pawnWhite3);
        pieceList.add(pawnWhite4);
        pieceList.add(pawnWhite5);
        pieceList.add(pawnWhite6);
        pieceList.add(pawnWhite7);
        pieceList.add(pawnWhite8);
    }

    /**
     * starts the game
     * 
     */
    public void start(){
        ChessBoard chessBoard = new ChessBoard();
        
        Player player1 = new Player(TeamSide.BLACK);
        Player player2 = new Player(TeamSide.WHITE);
        
        for(int i = 0; i < pieceList.size(); i++){
            chessBoard.addPiece(pieceList.get(i));
        
        }
        
        readIntro();
        
        chessBoard.printBoard();
        
           
            
    }
    
    public void readIntro(){
        System.out.print(intro);
    }
    //variables
    
    private final ArrayList<ChessPiece> whitePieceList = new ArrayList<>();
    private final ArrayList<ChessPiece> pieceList = new ArrayList<>();
    private final ArrayList<ChessPiece> blackPieceList = new ArrayList<>();
   
    //White Icons
    
    private final String whiteRookIcon = "wr";
    private final String whiteBishopIcon = "wb";
    private final String whiteKnightIcon = "wk";
    private final String whiteQueenIcon = "wQ";
    private final String whiteKingIcon = "wK";
    private final String whitePawnIcon = "wp";
    
    //Black Icons
    
    private final String blackRookIcon = "br";
    private final String blackBishopIcon = "bb";
    private final String blackKnightIcon = "bk";
    private final String blackQueenIcon = "bQ";
    private final String blackKingIcon = "bK";
    private final String blackPawnIcon = "bp";
    
    //intro
    
    private String intro = "Welcome to the game of chess! Here you can play\n"
            + "chess with another friend. You will take turns selecting\n"
            + "what pieces you would like to move. Good luck and have fun!\n\n";
}
