package RefactoringGuruAbstractFactory;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}

class WinFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}

class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MaxCheckBox();
    }
}
