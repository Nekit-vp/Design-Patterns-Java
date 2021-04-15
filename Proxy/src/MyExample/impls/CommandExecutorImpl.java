package MyExample.impls;


import MyExample.services.CommandExecutor;

/**
 * Concrete implementation of command executor.
 */
public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String command) throws Exception
    {
        Runtime.getRuntime().exec(command);
        System.out.println("'" + command + "' command executed.");
    }

}
