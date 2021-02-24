import com.wangzhenghe.dao.UserMapper;

import com.wangzhenghe.pojo.User;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

import java.util.List;


public class Mytest {

    @Test
    public void test02()throws IOException{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

        UserMapper mapper = context.getBean("usermapperImpl", UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
    }
}