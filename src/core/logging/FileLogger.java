package core.logging;

public class FileLogger implements ILoggers{
    @Override
    public void log(String data) {
        System.out.println(data + " logged to File.");
    }
}
