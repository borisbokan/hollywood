package com.borcha.hollywood.pomocne;

import java.util.Random;



/**
 * Created by borcha on 28.05.17..
 */

public class myRandom {


       public static int getMyRandomNum(int _broj){

           Random rand = new Random();
           int  n = rand.nextInt(_broj)+1;
           return n;
       }


}
