/**
 * Created by tanaphon on 25/4/2560.
 */
public class MyMessageDITest {
    public static void main(String[] args) {
        String msg = "hello";
        String email = "ble@ble.com";
        String phone = "0822";

        MessageServiceInjector injector = null;
        Consumer app = null;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, email);

        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, phone);
    }
}
