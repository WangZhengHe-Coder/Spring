import com.wangzhenghe.POJO.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello);

        System.out.println("=================");

        hello.show();
    }
}
