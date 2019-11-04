import com.ylw.mybatis.entity.User;
import com.ylw.mybatis.mapper.UserMapper;
import com.ylw.mybatis.sql.SqlSession;
import org.junit.Test;

import java.sql.SQLException;

public class MyBatisTest {


    @Test
    public void test() throws SQLException {
        UserMapper userMapper = SqlSession.getMapper(UserMapper.class);
        User selectUser = userMapper.selectUser("Dumas", "26");
        System.out.println("结果:" + selectUser.getNAME() + "," + selectUser.getAge());

    }


}
