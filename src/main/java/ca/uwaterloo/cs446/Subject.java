package ca.uwaterloo.cs446;

import java.util.ArrayList; 

public abstract class Subject{
    ArrayList<Observer> observers;

    Subject(){
        this.observers = new ArrayList<Observer>();
    }

    void attach(Observer ob){
        observers.add(ob);
    }
    void sendNotice(){
        for (Observer ob : observers){
            ob.update();
        }
    }
    abstract int getState();
    abstract void setState(int state);
}