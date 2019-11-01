import com.ylw.aop.spring.UserService;
import com.ylw.aop.spring.UserService2;
import com.ylw.aop.spring.UserService3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TransactionTest {

    @Autowired
    UserService userService;

    @Autowired
    UserService2 userService2;

    @Autowired
    UserService3 userService3;


    @Test
    public void test(){
        userService.add();
    }

    @Test
    public void test1(){
        userService2.add();
    }

    @Test
    public void test2(){
        userService3.add();
    }

}
