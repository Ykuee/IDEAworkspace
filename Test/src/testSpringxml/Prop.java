package testSpringxml;

/**
 * Created by Ykue on 2017/7/24.
 */
public class Prop {
    private String age;


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Prop{" +
                "age='" + age + '\'' +
                '}';
    }
}
