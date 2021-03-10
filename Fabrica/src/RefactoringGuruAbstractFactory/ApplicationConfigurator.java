package RefactoringGuruAbstractFactory;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        String config = "Win";

        GUIFactory factory;

        if (config.equals("Win"))
            factory = new WinFactory();
        else if (config.equals("Mac"))
            factory = new MacFactory();
        else
            throw new Exception("Error! Unknown operating system");

        Application application = new Application(factory);
    }
}
