import com.wangzhenghe.mapper.UserMapper;
import com.wangzhenghe.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Mybatis.xml");
        UserMapper mapper = context.getBean("UserMapper01", UserMapper.class);
        List<User> user = mapper.getAllUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Mybatis.xml");
        UserMapper mapper = context.getBean("UserMapper01", UserMapper.class);
        List<User> user = mapper.getAllUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
    }
}
