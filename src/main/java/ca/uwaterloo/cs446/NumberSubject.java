package ca.uwaterloo.cs446;

public class NumberSubject implements Subject {
    int state;

    void NumberSubject(int state){
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