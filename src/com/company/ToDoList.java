package com.company;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<ToDoListItem> fyreFestAttendees = new ArrayList<>();
    private ArrayList<ToDoListItem> fyreFestTalent = new ArrayList<>();
    private ArrayList<ToDoListItem> fyreFestWorkers = new ArrayList<>();


    public void addToAttendees(ToDoListItem item) {

        fyreFestAttendees.add(item);

    }

    public void addToTalen(ToDoListItem item) {

        fyreFestTalent.add(item);

    }

    public void addToWorkers(ToDoListItem item) {

        fyreFestWorkers.add(item);

    }


    public void printList(int userChoice) {

        int count = 1;

        if (userChoice == 1) {
            for (ToDoListItem items : fyreFestAttendees) {

                System.out.print(count + ". ");

                System.out.println(items);

                count++;
            }
        } else if (userChoice == 2) {

            for (ToDoListItem items : fyreFestTalent) {

                System.out.print(count + ". ");

                System.out.println(items);

                count++;

            }
        } else if (userChoice == 3) {

            for (ToDoListItem items : fyreFestWorkers) {

                System.out.print(count + ". ");

                System.out.println(items);

                count++;
            }

        }


    }

}
