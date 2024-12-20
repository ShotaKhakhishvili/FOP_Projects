import java.util.Comparator;

public class Penguin {
    private int height;
    private int age;

    public static Comparator<Penguin> comparator = (p1,p2) -> (int) Math.signum(p1.age - p2.age);

    public Penguin(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public Penguin(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode(){
        return 7 * height + 49 * age;
    }
}
