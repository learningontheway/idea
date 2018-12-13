package reflct;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class reflect {

@Test
        public void test1() throws Exception {
     Class clazz = person.class;
     person p = (person) clazz.newInstance();
     Field f1 = clazz.getField("name");
     f1.set(p, "力宏");
     Field f2 = clazz.getDeclaredField("age");

     //通过反射调用时需要注意，如果是私有类型时，应该加上f2.setAccessible(true);
     f2.setAccessible(true);


     f2.set(p, 15);

     Method m1 = clazz.getMethod("show");
     m1.invoke(p);
     Method m2 = clazz.getMethod("display", String.class);
     m2.invoke(p, "china");
     System.out.println(p);
}


     @Test
     public void test2() throws Exception {
     person p = new person();
     Class clazz = p.getClass();
     Field f1 = clazz.getDeclaredField("age");
     f1.setAccessible(true);
     f1.set(p, 17);
     Field f2 = clazz.getDeclaredField("name");
     f2.setAccessible(true);
     f2.set(p, "小明");
     System.out.println(p);
}

}
