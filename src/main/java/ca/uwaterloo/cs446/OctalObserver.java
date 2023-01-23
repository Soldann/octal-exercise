package ca.uwaterloo.cs446;

import java.lang.String;

public class OctalObserver{
    String octValue;
    Subject sub;
    
    void OctalObserver(Subject sub){
        this.sub = sub;
        sub.attach(this);
    }

    void update(){
        octValue = Integer.toOctalString(sub.getState);
    }

    String getValue(){
        return octValue;
    }
}