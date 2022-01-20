package singleton;

public class MySingleton {
    private static MySingleton mySingleton;
    private MySingleton() {}

    public static synchronized MySingleton getSingleton() {
        if(mySingleton == null) {
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }
}

/* public */ class NewSingleton {
    private static NewSingleton newSingleton;
    NewSingleton(){}

    public static synchronized NewSingleton getSingleton() {
        if(newSingleton == null) {
            newSingleton = new NewSingleton();
        } return newSingleton;
    }
}
