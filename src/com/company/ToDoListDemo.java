package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ToDoListDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userChoice;
        boolean addMore;

        ToDoList toDoList = new ToDoList();


        System.out.println("Welcome to the Fyre Fest Task Manager. \nThe event is in less than 14 days away," +
                "there is still much to do. \nThis app has three lists to help get things squared away. " +
                "\nPress 1 to access the list that keeps task that have to do with our festivals attendees, lodging, food etc. " +
                "\nPress 2 to access the list that keeps tracks of tasks for our musical acts and influencers" +
                "\nPress 3 to access the list that keeps record of tasks for the organizers and workers."
        );


        do {
        System.out.println("What list would you like to add to?");

        userChoice = scan.nextInt();

            switch (userChoice) {

                case 1:

                    ToDoListItem td = toDoList.getTaskInformation();

                    toDoList.addToAttendees(td);

                    toDoList.printList(userChoice);

                    break;


                case 2:


                    ToDoListItem td2 = toDoList.getTaskInformation();

                    toDoList.addToTalent(td2);

                    toDoList.printList(userChoice);

                    break;

                case 3:


                    ToDoListItem td3 = toDoList.getTaskInformation();

                    toDoList.addToWorkers(td3);

                    toDoList.printList(userChoice);

                    break;

                default:
                    System.out.println("Not an option.");

            }

            System.out.println("Would you like to add to another list?");

            scan.nextLine();

            String yesNo = scan.nextLine();

            if(yesNo.equalsIgnoreCase("yes")){

                addMore = true;

            } else{

                addMore = false;
            }

        }while (addMore);


        System.out.println("Thank you for using the program. ");
    }





    }

