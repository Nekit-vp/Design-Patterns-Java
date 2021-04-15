package MyExample;

import MyExample.proxy.CommandExecutorProxy;
import MyExample.services.CommandExecutor;

public class ProxyApp {

    public static void main(String[] args)
    {
        CommandExecutor commandExecutor = new CommandExecutorProxy("Heril", "hedza");
        try
        {
            commandExecutor.runCommand("ls -ltr");
            commandExecutor.runCommand(" rm -rf abc.pdf");
        }
        catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

}
