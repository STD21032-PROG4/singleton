package org.singleton;

import lombok.Getter;
import lombok.Setter;

public enum ClassUniqueInstance {
    INSTANCE(1);
    private int click;
    ClassUniqueInstance(int click){
        this.click=click;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click){
        this.click=click;
    }
    public ClassUniqueInstance getInstance(){
        return INSTANCE;
    }
}
