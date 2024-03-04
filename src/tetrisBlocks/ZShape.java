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
public class ZShape extends TetrisBlock{
    public ZShape(){
        super(new int[][]{ {0,1},
                           {1,1},
                           {1,0}});
    } 
}