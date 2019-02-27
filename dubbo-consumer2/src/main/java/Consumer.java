import com.lianyanjie.dubboapi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: lyj
 * @since: 2019/2/27
 */
public class Consumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer2 start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer2");
        System.out.println(demoService.getPermissions(1L));
    }
}
