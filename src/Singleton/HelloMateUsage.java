package Singleton;

public class HelloMateUsage {
    public static void main(String[] args) {
        HelloMate hello = HelloMate.INSTANCE;

        hello.sayHello("Mateusz");
    }
}
