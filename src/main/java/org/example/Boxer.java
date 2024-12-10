package org.example;

public class Boxer {
    String nickname;
    int age;
    double weight;

    public void toPunch()  {
        System.out.println("Накатить оппоненту с правой руки в ухо");
    } ;

    @Override
    public String toString() {
        return "Boxer{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
