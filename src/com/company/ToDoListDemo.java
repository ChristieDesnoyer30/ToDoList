package com.company;
import java.util.Scanner;


public class ToDoListDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userChoice;
        boolean addMore;
        ToDoListItem toDoItem = new ToDoListItem();
        ToDoList toDoList = new ToDoList();



        System.out.println("Welcome to the Fyre Fest Task Manager. \nThe event is in less than 14 days away," +
                "there is still much to do. \nThis app has three lists to help get things squared away. " +
                "\nPress 1 to access the list that hold items that have to do with our festivals attendees. " +
                "\nPress 2 to access the list that keeps tracks of tasks for our musical acts and influencers" +
                "\nPress 3 to access the list that keeps record of tasks for the organizers and workers."
          );

        System.out.println("What list would you like to add too?");

        userChoice = scan.nextInt();

        switch(userChoice){

            case 1:

                System.out.println("Enter the description of the task");

                scan.nextLine();

                String taskDescription = scan.nextLine();

                System.out.println("Enter the status of the task. (ToDo, In Progress, or Done). ");

                String taskComplete = scan.nextLine();

                toDoItem.setDescription(taskDescription);

                toDoItem.setComplete(taskComplete);

                toDoList.addToAttendees(toDoItem);

                toDoList.printAttendeesList();

        }



    }
}
