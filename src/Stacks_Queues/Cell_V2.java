/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stacks_Queues;


public class Cell_V2 {
    int row, col;
    char value;
    boolean blocked=false;
    boolean visited=false;
    Cell_V2 previous=null;
    
    Cell_V2(int row, int col, char value){
        this.row=row;
        this.col=col;
        this.value=value;
    }
    public void setBlock(){
        this.blocked=true;
    }
    public boolean canBeVisisted(){
        return !blocked && !visited;
    }

    @Override
    public String toString() {
        return "(" + row + "," + col + "," + value + ")";
    }
    
}
