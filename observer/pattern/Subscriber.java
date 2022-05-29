package observer.pattern;

public class Subscriber {
    private String name;
    private Channel channel=new Channel();

    public Subscriber(String name)
    {
        this.name=name;
    }
    public void update(String msg)
    {
        System.out.println("Hey "+name+"!!: new Video uploaded by "+channel+" |> title : "+msg);
    }
    public void subscribeChannel(Channel ch)
    {
        channel=ch;
    }

}
