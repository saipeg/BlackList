package singleton;

public class MySingleton {
    private static MySingleton mySingleton;
    private MySingleton() {}

    public static synchronized MySingleton getSingleton() {
        System.out.println("Singleton was created");
        if(mySingleton == null) {
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }

}


