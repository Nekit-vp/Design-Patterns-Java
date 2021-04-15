package MyExample.proxy;


import MyExample.impls.CommandExecutorImpl;
import MyExample.services.CommandExecutor;

/**
 * Proxy Responsible For Controlling Command Executor.
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String password)
    {
        if ("Heril".equals(user) && "hedza06".equals(password)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String command) throws Exception
    {
        if (isAdmin) {
            executor.runCommand(command);
        }
        else
        {
            if (command.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            }
            executor.runCommand(command);
        }
    }
}
