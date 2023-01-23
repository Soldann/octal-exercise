package ca.uwaterloo.cs446;

import java.util.ArrayList;

public interface Subject(){
    ArrayList<Observer> observers;

    void attach(Observer ob){
        observers.add(ob);
    }
    void sendNotice(){
        for (Observer ob : observers){
            ob.sendNotice();
        }
    }
    void getState();
    void setState(int state);
}