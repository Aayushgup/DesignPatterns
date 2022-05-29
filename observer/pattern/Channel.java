package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
   private List<Subscriber> subs=new ArrayList<>();
   private String title;
   public void subscribe(Subscriber s)
   {
       subs.add(s);
   }
    public void unSubscribe(Subscriber s)
    {
        subs.remove(s);
    }

    public void notifySubscriber(String msg)
    {
       for(Subscriber s:subs)
       {
           s.update(msg);
       }
    }
    public void upload(String title)
    {
        this.title=title;
        notifySubscriber(title);
    }
    public String toString()
    {
        return "goCode";
    }


}
