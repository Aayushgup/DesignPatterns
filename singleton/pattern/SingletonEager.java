package singleton.pattern;

class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        System.out.println("instance creating");
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
