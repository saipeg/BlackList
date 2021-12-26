package generics;

import java.util.Date;

public class StorageUser {
    public static void main(String[] args) {
        NotGenericStorage notGenericStorage = new NotGenericStorage("String");
        NotGenericStorage notGenericStorage1 = new NotGenericStorage(2);
        final NotGenericStorage notGenericStorage2 = new NotGenericStorage(new Date());

        final Object value = notGenericStorage.getObject();
        if (value instanceof String) {
            System.out.println(((String) value).toUpperCase());
        }

        GenericStorage<String> genericStorage = new GenericStorage<>("String");
        GenericStorage<Integer> genericStorage1 = new GenericStorage<>(2);
//      GenericStorage<String> genericStorage1 = new GenericStorage<>(2); don't compile;


    }
}
