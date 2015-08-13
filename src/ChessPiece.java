/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew
 */
public class ChessPiece {
    
    //methods
    
    /**
     *
     * 
     * @param xPosition
     * @param yPosition
     * @param chessPieceName
     * @param chessType
     * @param chessTeamSide
     */
        
    public ChessPiece(int xPosition, int yPosition, String chessPieceName, 
            Type chessType, TeamSide chessTeamSide, String chessIcon){
        
        xPos = xPosition;
        
        yPos = yPosition;
        
        name = chessPieceName;
        
        type = chessType;
        
        team = chessTeamSide;
        
        icon = chessIcon;
        
        startState = true;
            
                
    }
    
    /**
     *
     * @return
     */
    public Integer getXPos(){
        return xPos;
    }
    
    /**
     *
     * @param x
     */
    public void setXPos(int x){
        xPos = x;
    }
    
    /**
     *
     * @return position of y axis
     */
    public Integer getYPos(){
        return yPos;
    }
    
    /**
     *
     * @param y y position
     */
    public void setYPos(int y){
        yPos = y;
    }
    
    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }
    
    /**
     *
     * @param pieceName
     */
    public void setName(String pieceName){
        name =  pieceName;
    }
    
    /**
     *
     * @return
     */
    public Type getType(){
        return type;
    }
    
    /**
     *
     * @param pieceType
     */
    public void setType(Type pieceType){
        type = pieceType;
    }
    
    /**
     *
     * @return
     */
    public TeamSide getTeamSide(){
        return team;
    }
    
    /**
     *
     * @param teamSide
     */
    public void setTeamSide(TeamSide teamSide){
        team = teamSide;
    }
    
    public String getIcon(){
        return icon;
    }
    
    public void setIcon(String str){
        icon = str;
    }
    
    public boolean getStartState(){
        return startState;
    }
    
    public void setStartState(boolean state){
        startState = state;
    }
    //variables
    
    private Integer xPos;
    
    private Integer yPos;
    
    private String name;
    
    private Type type;
    
    private TeamSide team;
    
    private String icon;
    
    private boolean startState;
}
