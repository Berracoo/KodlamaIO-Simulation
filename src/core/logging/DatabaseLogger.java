package core.logging;

public class DatabaseLogger implements ILoggers{
    @Override
    public void log(String data) {
        System.out.println( data + "logged to database");
    }
}
