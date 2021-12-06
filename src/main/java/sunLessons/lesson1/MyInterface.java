package sunLessons.lesson1;

@FunctionalInterface
public interface MyInterface {
    void run();
    default void jump() {
        System.out.println("jump");
    }

}
