package com.designpattern.factorymethod.pseudocode;

import java.awt.*;

public abstract class Dialog {
    public abstract Button createButton();
    public void render(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
