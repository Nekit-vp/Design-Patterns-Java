package RefactoringGuruAbstractFactory;

public interface CheckBox {
    void paint();
}

class WinCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Отрисовать чекбокс в стиле Windows");
    }
}

class MaxCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Отрисовать чекбокс в стиле macOS");
    }
}
