package core.logging;

public class MailLogger implements ILoggers{
    @Override
    public void log(String data) {
        System.out.println( data +" logged to mail");
    }
}
