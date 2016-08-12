/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberholderdisplay;

import numberholder.NumberHolder;

public class NumberHolderDisplay {
    public static void main(String[] args) {
	NumberHolder aNumberHolder = new NumberHolder();
	aNumberHolder.anInt = 1;
	aNumberHolder.aFloat = 2.3f;
	System.out.println(aNumberHolder.anInt);
	System.out.println(aNumberHolder.aFloat);
    }
}
