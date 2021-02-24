import com.wangzhenghe.Dao.UserDaoImpl;
import com.wangzhenghe.Service.UserService;
import com.wangzhenghe.Service.UserServiceImpl;
import com.wangzhenghe.Service.UserServiceImpl1;
import org.junit.Test;

public class Mytest {
    @Test
    public void test(){

        UserService service = new UserServiceImpl();
        service.getUser();
    }

    @Test
    public void test01(){
        UserService service = new UserServiceImpl1(new UserDaoImpl());
        service.getUser();
    }
}
