import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class test{
    protected int a = 3;
    test(int a){

    }
    test(){

    }
}

class test1 extends test{
    int a = 4;
    test1(){
        super(3);
    }


}

interface equ{
    void asd();
}

class ball extends Exception{
    @Override
    public String getLocalizedMessage() {
        return Arrays.toString(getStackTrace()) + ": wait! they don't love you like I love you.";
    }
}

class bomb extends Exception{
    @Override
    public String getLocalizedMessage() {
        return Arrays.toString(getStackTrace()) + ": wait! they don't love you like I love you.";
    }
}

interface inter{
    void fun();
    void fun1();

    default void printer(){
        System.out.println("asd");
    }
}

public class Main extends test1 implements inter{
    static Supplier<String> supp;

    void testing(){
        String stri = "new";
        supp = () -> stri;
    }

    public static void main(String[] args) {
        Main a = new Main();
        float b = 0.3f;
        int c = 3;
        float d = b + c;
        a.fun();

        a.testing();

        Consumer<String> cons = (str) -> System.out.println(str.length());
        Predicate<Integer> pred = (i) -> i > 4;

        System.out.println(pred.test(3));
        cons.accept("abc");
        System.out.println(supp.get());
    }

    @Override
    public void fun() {

    }

    @Override
    public void fun1() {

    }
}