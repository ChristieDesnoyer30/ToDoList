package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private ArrayList<ToDoListItem> fyreFestAttendees = new ArrayList<>();
    private ArrayList<ToDoListItem> fyreFestTalent = new ArrayList<>();
    private ArrayList<ToDoListItem> fyreFestWorkers = new ArrayList<>();


    public void addToAttendees(ToDoListItem item) {

        fyreFestAttendees.add(item);

    }

    public void addToTalent(ToDoListItem item) {

        fyreFestTalent.add(item);

    }

    public void addToWorkers(ToDoListItem item) {

        fyreFestWorkers.add(item);

    }


    public void printList(int userChoice) {

        int count = 1;

        if (userChoice == 1) {
            System.out.println("Fyre Fest Attendees- To Do List: ");
            for (ToDoListItem items : fyreFestAttendees) {

                System.out.print(count + ". ");

                items.printTask();

                count++;
            }

        } else if (userChoice == 2) {
            System.out.println("Fyre Fest Talent- To Do List: ");
            for (ToDoListItem items : fyreFestTalent) {


                System.out.print(count + ". ");

                items.printTask();

                count++;

            }

        } else if (userChoice == 3) {

            System.out.println("Fyre Fest Workers- To Do List: ");

            for (ToDoListItem items : fyreFestWorkers) {

                System.out.print(count + ". ");

                items.printTask();

                count++;
            }

        }


    }

    public ToDoListItem getTaskInformation() {

        ToDoListItem td = new ToDoListItem();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the description of the task");

        String taskDescription = scan.nextLine();

        System.out.println("Enter the status of the task. (ToDo, In Progress, or Done). ");

        String taskComplete = scan.nextLine();

        td.setDescription(taskDescription);

        td.setComplete(taskComplete);


        return td;
    }

    public void updateListItems(int userChoice) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What item would you like to update? ");

        int listItem = scan.nextInt();


        listItem -= 1;

        if (userChoice == 1) {
            System.out.println("What is the status of the task? ");
            scan.nextLine();
            String taskComplete = scan.nextLine();

            fyreFestAttendees.get(listItem).setComplete(taskComplete);

        } else if (userChoice == 2) {
            System.out.println("What is the status of the task? ");

            String taskComplete = scan.nextLine();

            fyreFestTalent.get(listItem).setComplete(taskComplete);

        } else {
            System.out.println("What is the status of the task? ");

            String taskComplete = scan.nextLine();

            fyreFestWorkers.get(listItem).setComplete(taskComplete);

        }

    }

    public void printAllLists() {

        printList(1);

        printList(2);

        printList(3);


    }


}
