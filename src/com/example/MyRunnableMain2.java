package com.example.util2;

import com.example.MyRunnable;
import com.example.RunnableExecute;

public class MyRunnableMain2 {
    public static void main(String[] args){



        RunnableExecute runnableExecute = new RunnableExecute();

        System.out.println("00000000000000000000");
        runnableExecute.execute(() -> {
                System.out.println("heello");

            }
        );
        System.out.println("00000000000000000000");


    }
}
