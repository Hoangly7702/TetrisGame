/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetrisBlocks;

import tetris.TetrisBlock;

/**
 *
 * @author Administrator
 */
public class TShape extends TetrisBlock{
    public TShape(){
        super(new int[][]{ {1,0},
                           {1,1},
                           {1,0}});
    } 
}