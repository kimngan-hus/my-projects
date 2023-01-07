package com.designpattern.factorymethod.pseudocode;

public class WindowDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
