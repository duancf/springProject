import com.duan.config.DuanConfig;
import com.duan.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuanConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
