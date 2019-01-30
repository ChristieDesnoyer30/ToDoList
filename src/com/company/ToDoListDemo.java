package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ToDoListDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userChoice;
        boolean addMore = true;

        ToDoList toDoList = new ToDoList();

        System.out.println( "\"Welcome to the Fyre Fest Task Manager. \nThe event is in less than 14 days away, there is still much to do. " +
                "\nThis app has three lists to help get things squared away.");

        do {
            System.out.println("\nPress 1 to access the list that keeps task that have to do with our festivals attendees, lodging, food etc. " +
                    "\nPress 2 to access the list that keeps tracks of tasks for our musical acts and influencers" +
                    "\nPress 3 to access the list that keeps record of tasks for the organizers and workers." +
                    "\nPress 4 to update items in a list. " +
                    "\nPress 5 to see all lists. \nPress 6 to exit."
            );


            System.out.println("What would you like to do?");

            userChoice = scan.nextInt();

            switch (userChoice) {

                case 1:

                    System.out.println("Okay, let's add to the Attendees list. ");

                    ToDoListItem td = toDoList.getTaskInformation();

                    toDoList.addToAttendees(td);

                    toDoList.printList(userChoice);

                    break;


                case 2:

                    System.out.println("Okay, let's add to the Talent list. ");

                    ToDoListItem td2 = toDoList.getTaskInformation();

                    toDoList.addToTalent(td2);

                    toDoList.printList(userChoice);

                    break;

                case 3:

                    System.out.println("Okay, let's add to the Worker's list. ");

                    ToDoListItem td3 = toDoList.getTaskInformation();

                    toDoList.addToWorkers(td3);

                    toDoList.printList(userChoice);

                    break;

                case 4:
                    System.out.println("Which list would you like to update? \n 1 for Attendees. \n 2. for Talent. \n 3. for Workers ");
                    int choice = scan.nextInt();
                    toDoList.printList(choice);
                    toDoList.updateListItems(choice);



                    break;

                case 5:

                    toDoList.printAllLists();
                    break;

                case 6:
                    addMore = false;
                    break;

                default:
                    System.out.println("Not an option.");

            }

//            System.out.println("Would you like to add to another list? Type yes to continue. ");
//
//            scan.nextLine();
//
//            String yesNo = scan.nextLine();
//
//            if(yesNo.equalsIgnoreCase("yes")){
//
//                addMore = true;
//
//            } else{
//
//                addMore = false;
//            }

        } while (addMore);


//        System.out.println("Here are your lists:");
//        toDoList.printAllLists();
//

    }


}

