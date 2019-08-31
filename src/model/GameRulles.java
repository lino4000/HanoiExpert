/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lino4000
 */
public class GameRulles {
    private final List<List<Integer>> pillars;
    private final List<Integer> peaces;
    
    private Integer gameStep;


    public GameRulles() {
        this.gameStep = 0;
        this.pillars = new ArrayList<>();
        this.peaces = new ArrayList<>();
        
    }
    
    public void start(){
        
    }
    
    public void move(Integer from, Integer to){
        if(this.canMove(from,to)){
            this.pillars.get(to).add(
                    this.pillars.get(from).get(this.pillars.get(from).size() -1 )
            );
            this.pillars.get(from).remove(this.pillars.get(from).size() -1 );
        }
        this.getPillars();
    }
    
    //checking if the piece to move from a pillar is smaller than the highest piece of the pillar target
    private Boolean canMove(Integer from, Integer to){
        // Legibility
        List<Integer> pillarFrom = this.pillars.get(from);
        List<Integer> pillarTo = this.pillars.get(to);
        
        return ( pillarFrom.get(pillarFrom.size() -1) < pillarTo.get(pillarTo.size() -1) );
    }
    
    public List<List<Integer>> getPillars(){
        return this.pillars;
    }
}
