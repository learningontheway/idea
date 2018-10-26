package custemei;

import java.util.Objects;

public class custemei {
    int a;
    int age;

    public custemei(int a, int age) {
        this.a = a;
        this.age = age;
    }

    @Override
    public String toString() {
        return "custemei{" +
                "a=" + a +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        custemei custemei = (custemei) o;
        return a == custemei.a &&
                age == custemei.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, age);
    }

    public int getA() {
        return a;
    }

    public int getAge() {
        return age;
    }
}
}
