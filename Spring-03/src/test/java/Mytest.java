import com.wangzhenghe.POJO.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = context.getBean("user", User.class);

//        System.out.println(user);

        user.getCat().shout();
        user.getDog().shout();
        System.out.println(user.getStr());

    }
}
