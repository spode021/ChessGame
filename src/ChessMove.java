/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew
 */
public class ChessMove {
    
    /**
     * 
     * @param board game board to reference and make changes to
     */
    public ChessMove(ChessBoard board){
        
        chessBoard = board;
        
    }
    
    public void doMove(ChessPiece piece, int finalX, int finalY){
        if (piece.getType() == Type.PAWN)
            movePawn(piece, finalX, finalY, chessBoard);
        else if(piece.getType() == Type.ROOK)
            moveRook(piece, finalX, finalY, chessBoard);
        else if(piece.getType() == Type.KNIGHT)
            moveKnight(piece, finalX, finalY, chessBoard);
        else if(piece.getType() == Type.BISHOP)
            moveBishop(piece, finalX, finalY, chessBoard);
        else if(piece.getType() == Type.QUEEN)
            moveQueen(piece, finalX, finalY, chessBoard);
        else if(piece.getType() == Type.KING)
            moveKing(piece, finalX, finalY, chessBoard);
        
    }
    /**
     * 
     * @param chessPiece piece to reference
     * @param endX ending xPos
     * @param endY ending yPos
     * @param chessBoard game board to update
     */
    public void movePawn(ChessPiece chessPiece, int endX, int endY, ChessBoard chessBoard){
        if(endX == chessPiece.getXPos() && endY == chessPiece.getYPos() + 2 && chessPiece.getStartState() == true){
            chessPiece.setXPos(endX);
            chessPiece.setYPos(endY);
        
            chessPiece.setStartState(false);
        }
        else if(endX == chessPiece.getXPos() && endY == chessPiece.getYPos() + 1){
            chessPiece.setXPos(endX);
            chessPiece.setYPos(endY);
        }
        else if(endX == chessPiece.getXPos() + 1 && endY == chessPiece.getYPos() + 1 && chessBoard.getPiece(endY, endY) != null){
            
            chessBoard.removePiece(chessBoard.getPiece(endY, endY));
            chessPiece.setXPos(endX);
            chessPiece.setYPos(endY);
        }
    
        
    }
    /**
     * 
     * @param chessPiece piece being moved
     * @param endX x destination
     * @param endY y destination
     * @param chessBoard game board to update
     */
    public void moveRook(ChessPiece chessPiece, int endX, int endY, ChessBoard chessBoard){
        
    }
    
    /**
     * 
     * @param chessPiece piece being moved
     * @param endX x destination
     * @param endY y destination
     * @param chessBoard game board to update
     */
    public void moveKnight(ChessPiece chessPiece, int endX, int endY, ChessBoard chessBoard){
        
    }
    
    /**
     * 
     * @param chessPiece piece being moved
     * @param endX x destination
     * @param endY y destination
     * @param chessBoard game board to update
     */
    public void moveBishop(ChessPiece chessPiece, int endX, int endY, ChessBoard chessBoard){
        
    }
    
    /**
     * 
     * @param chessPiece piece being moved
     * @param endX x destination
     * @param endY y destination
     * @param chessBoard game board to update
     */
    public void moveQueen(ChessPiece chessPiece, int endX, int endY, ChessBoard chessBoard){
        
    }
    
    /**
     * 
     * @param chessPiece piece being moved
     * @param endX x destination
     * @param endY y destination
     * @param chessBoard game board to update
     */
    public void moveKing(ChessPiece chessPiece, int endX, int endY, ChessBoard chessBoard){
        
    }
    //variables
    ChessBoard chessBoard;
    
}
