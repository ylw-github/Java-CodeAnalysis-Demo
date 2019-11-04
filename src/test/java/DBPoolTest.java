import com.ylw.aop.spring.UserService;
import com.ylw.aop.spring.UserService2;
import com.ylw.aop.spring.UserService3;
import com.ylw.db_pool.ConnectionPoolManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;

public class DBPoolTest {



    @Test
    public void test() {
        ThreadConnection dBThread = new ThreadConnection();
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(dBThread, "用户线程" + i);
            thread.start();
        }
    }

    class ThreadConnection implements Runnable {

        public void run() {
            for (int i = 0; i < 10; i++) {
                Connection connection = ConnectionPoolManager.getConnection();
                System.out.println(Thread.currentThread().getName() + ",connection:" + connection);
                ConnectionPoolManager.releaseConnection(connection);
            }
        }

    }

}
