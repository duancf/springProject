import com.duan.service.UserService;
import com.duan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        //动态代理代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        //userService.add();
        userService.delete();
    }
}
