package singleton;

public class MySingleton {
    private static MySingleton mySingleton;
    private MySingleton() {}

    public static MySingleton getSingleton() {
        if(mySingleton == null) {
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }
}
