package com.Grajales.Thinking_Pad;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    static void menu(){
        System.out.println("Please choose an option: \n(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.");
    }


    static void action(int choice){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        if(choice == 0){
            System.out.println("Goodbye!");
            System.exit(0);
        }else if(choice == 1){
            for (String tasks: list){
                System.out.println(tasks);
            }
            String input = scanner.nextLine();
            list.add(input);

        }else if(choice == 2){
            System.out.println(list);

        }else if(choice == 3){
            System.out.println(list);
        }else if(choice == 4){
            for (String tasks: list){
                System.out.println(tasks);
            }
        }
    }

    static int number(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
    public static void main(String[] args) {
        while(true) {
            menu();
            action(number());
        }
    }

}
