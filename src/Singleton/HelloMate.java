package Singleton;

public class HelloMate {
    public static final HelloMate INSTANCE = new HelloMate();
    private HelloMate(){

    }
    public void sayHello(String name){
        System.out.println("Hello! " + name);
    }
}
