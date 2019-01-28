package com.company;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<ToDoListItem> fyreFestAttendees = new ArrayList<>();
    private ArrayList<ToDoListItem> fyreFestTalent = new ArrayList<>();
    private ArrayList<ToDoListItem> fyreFestWorkers = new ArrayList<>();


    public void addToAttendees(ToDoListItem item){

        fyreFestAttendees.add(item);

    }


    public void printAttendeesList(){

        int count = 1;

        for(ToDoListItem items: fyreFestAttendees){

            System.out.print(count + ". ");

           System.out.println(items);

            count++;
        }
    }



}
