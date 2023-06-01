package org.singleton;

import lombok.Getter;
import lombok.Setter;

public class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private String message;
    private ClassSingleton(String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public static ClassSingleton getINSTANCE() {
        if(INSTANCE==null)
            INSTANCE = new ClassSingleton("only instance");
        return INSTANCE;
    }
}
