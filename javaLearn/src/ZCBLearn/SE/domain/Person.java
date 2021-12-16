package ZCBLearn.SE.domain;

public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public String firstName;
    public String LastName;
    private int a;
    private int b;
    public int c;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat...");
    }

    public void eat(String str){
        System.out.println("eat..."+str);
    }
}
