package ca.uwaterloo.cs446;

import java.util.ArrayList;

public class NumberSubject extends Subject {
    int state;

    NumberSubject(int state){
        this.state = state;
    }

    int getState(){
        return this.state;
    }

    void setState(int state){
        this.state = state;
        this.sendNotice();
    }

}