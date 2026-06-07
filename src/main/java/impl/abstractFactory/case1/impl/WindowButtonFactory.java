package impl.abstractFactory.case1.impl;

import impl.abstractFactory.case1.ButtonFactory;
import impl.abstractFactory.case1.modals.Button;
import impl.abstractFactory.case1.modals.WinButton;

public class WindowButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
