/**
 * Created by tanaphon on 25/4/2560.
 */
public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String phone) {
        System.out.println("Send SMS to: " + phone + ", context: " + msg);
    }
}
