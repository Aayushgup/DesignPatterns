package singleton.pattern;

public class SingletonDriver {

    public static void main(String[] args) {
        SingletonSynchronized instance = SingletonSynchronized.getInstance();
        System.out.println(instance);

        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();

        System.out.println(instance1);
    }
}

// For Eager and Lazy Singleton
//public class SingletonDriver {
//
//    public static void main(String[] args) {
//       SingletonEager instance= SingletonEager.getInstance();
//
//       System.out.println(instance);
//
//        SingletonEager instance1= SingletonEager.getInstance();
//
//        System.out.println(instance1);
//    }
//}