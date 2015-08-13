
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
public class ChessBoard {
    
    //public methods
    
    /**
     * Empty constructor
     */
        
    public ChessBoard(){
        
    }
    
    /**
     * 
     * @return maximum x position value
     */
    public int getXMax(){
        return xMax;
    }
    /**
     * 
     * @return maximum y position value
     */
    public int getYMax(){
        return yMax;
    }
    
    /**
     * 
     * @param piece chess piece to add to pieceList
     */
    public void addPiece(ChessPiece piece){
        
        pieceList.add(piece);
        
    }
    //variables

    /**
     * 
     * @param piece piece to remove
     */
    public void removePiece(ChessPiece piece){
        
        pieceList.remove(piece);
    }
    
    /**
     * Gets piece being searched for at specific location
     * @param x x position searching for piece in
     * @param y y position searching for piece in
     * @return piece that has been found or null if not found
     */
    public ChessPiece getPiece(int x, int y){
     
        ChessPiece piece = null;
        
        for(int k = 0; k < pieceList.size(); k++){
                  
            if(pieceList.get(k).getXPos() == x && pieceList.get(k).getYPos() == y){  
                piece = pieceList.get(k);
                break;
           }  
      }
        return piece;
    }
    
    /**
     * Checks if piece is at specific location
     * @param x x location
     * @param y y location
     * @return if piece was found at location
     */
    public boolean hasPiece(int x, int y){
        
        boolean found = false;
        
        for(int k = 0; k < pieceList.size(); k++){
                  
            if(pieceList.get(k).getXPos() == x && pieceList.get(k).getYPos() == y){  
                found = true;
                break;
            }
        }
           return found;     
    }
    
    /**
     * prints board state
     */
    public void printBoard(){
        
        /*
                Starting state
        
                =======================
               |wr|wb|wk|wQ|wK|wk|wb|wr|
               |wp|wp|wp|wp|wp|wp|wp|wp|
               |  |  |  |  |  |  |  |  |
               |  |  |  |  |  |  |  |  |
               |  |  |  |  |  |  |  |  |
               |  |  |  |  |  |  |  |  |
               |bp|bp|bp|bp|bp|bp|bp|bp|
               |br|bb|bk|bQ|bK|bk|bb|br|
                =======================
        
        */
        
        System.out.print(" =======================\n");
        
        for(int i = 1; i <= 8; i++){
            System.out.print("|");
           
            for(int j = 1; j <= 8; j++){
                boolean found = false;
                for(int k = 0; k < pieceList.size(); k++){
                    
                    
                    if(pieceList.get(k).getXPos() == i && pieceList.get(k).getYPos() == j){  
                        System.out.print(pieceList.get(k).getIcon());
                        found = true;
                    }
                }
                if (found == false)
                    System.out.print("  ");
                System.out.print("|");
            }
            System.out.print("\n");
    
        }
        System.out.print(" =======================\n");
    }
    //Variables
    
    //place to store all pieces and their info
    private final ArrayList<ChessPiece> pieceList = new ArrayList<>();
   
    //maximum x position
    private static int xMax = 10;
    
    //maximum y position
    private static int yMax = 10;
}
