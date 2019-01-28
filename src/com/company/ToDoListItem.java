package com.company;

public class ToDoListItem {
    private String description;
    private String complete;

    public ToDoListItem() {
    }

    public ToDoListItem(String description, String complete) {
        this.description = description;
        this.complete = complete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }




    @Override
    public String toString() {
        return "Description :'" + description + '\'' +
                ", complete? :" + complete;
    }
}
