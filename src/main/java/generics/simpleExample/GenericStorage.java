package generics.simpleExample;

public class GenericStorage<T> {

    T value;

    public GenericStorage(T value) {

        this.value = value;
    }

    public T getValue() {
        return value;
    }


}
