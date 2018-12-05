package Hello;

public class helloword {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void hello(){
        System.out.println("hello "+name);
    }

    @Override
    public String toString() {
        return "helloword{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
