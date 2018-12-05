package reflct;

public class person {
    public String name;
    private int age;
//创建类时尽量构造一个空参的构造器
   public   person() {
    }

    public person(String name) {
        this.name = name;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() throws Exception {
        System.out.println("我是一个人");
    }

    public void display(String nation) {
        System.out.println("我的国籍是：" + nation);
    }

    public int compareTo(Object o) {
        return 0;
    }

    private String info() {
        return "今天北京天气不错！";
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
