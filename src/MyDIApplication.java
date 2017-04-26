/**
 * Created by tanaphon on 25/4/2560.
 */
public class MyDIApplication implements Consumer {

    private MessageService service;

    public MyDIApplication(MessageService svc) {
        this.service = svc;
    }

    @Override
    public void processMessage(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
