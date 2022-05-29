package observer.pattern;

public class Youtube {
    public static void main(String[] args) {
        Channel goCode =new Channel();

        Subscriber s1=new Subscriber("Aayush");
        Subscriber s2=new Subscriber("Akash");
        Subscriber s3=new Subscriber("Harsh");
        Subscriber s4=new Subscriber("Praveen");

        s1.subscribeChannel(goCode);
        s2.subscribeChannel(goCode);
        s3.subscribeChannel(goCode);
        s4.subscribeChannel(goCode);

        goCode.subscribe(s1);
        goCode.subscribe(s2);
        goCode.subscribe(s3);
        goCode.subscribe(s4);

        //goCode.unSubscribe(s2);

        goCode.upload("C++ tutorial for Beginners");

    }
}
