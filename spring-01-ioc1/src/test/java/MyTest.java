
import com.duan.service.UserService;
import com.duan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

public class MyTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaoMysql());
//        userService.GetUser();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl user = (UserServiceImpl) context.getBean("Dao");
        user.GetUser();
    }
}
