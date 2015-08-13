/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew
 */
public class Player {
    
    public Player(TeamSide side){
        
        team = side;
    }
    
    public TeamSide getTeam(){
        return team;    
    }
    
    TeamSide team;
}
