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
public class JShape extends TetrisBlock{
    public JShape(){
        super(new int[][]{ {0,1},
                           {0,1},
                           {1,1}});
    } 
}
