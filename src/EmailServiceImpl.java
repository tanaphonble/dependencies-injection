/**
 * Created by tanaphon on 25/4/2560.
 */
public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Send to: " + rec + ", context: " + msg);
    }
}
