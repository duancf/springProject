import com.duan.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people);
        people.getCat().Action();
        people.getDog().Action();
    }
}
