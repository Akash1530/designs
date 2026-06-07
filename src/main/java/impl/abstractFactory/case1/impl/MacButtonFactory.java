package impl.abstractFactory.case1.impl;

import impl.abstractFactory.case1.ButtonFactory;
import impl.abstractFactory.case1.modals.Button;
import impl.abstractFactory.case1.modals.MacButton;

public class MacButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
