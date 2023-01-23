package ca.uwaterloo.cs446;

import java.lang.String;

public class OctalObserver implements Observer{
    String octValue;
    Subject sub;
    
    OctalObserver(Subject sub){
        this.sub = sub;
        this.sub.attach(this);
    }

    public void update(){
        octValue = Integer.toOctalString(sub.getState());
    }

    public String getValue(){
        return octValue;
    }
}