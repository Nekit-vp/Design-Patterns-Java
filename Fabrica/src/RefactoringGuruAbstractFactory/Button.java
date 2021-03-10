package RefactoringGuruAbstractFactory;

public interface Button {
    void paint();
}

class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Отрисовать кнопку в стиле Windows");
    }
}

class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println(" Отрисовать кнопку в стиле macOS");
    }
}

