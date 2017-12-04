import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by jon75 on 2017/11/11.
 */
public class SpringTestImpl extends SpringTest {
	@Autowired
	DataSource ds ;

	@Test
	public void loadTest() {
		System.out.printf("Spring装载测试");
	}

	@Test
	public void testO1DataSource() throws SQLException {
        System.out.println(ds);

	}

	/**
	 * 测试JPA是否正常
	 */
	@Test
	public void testJpa() {
	}

	/**
	 * 测试MyBatis是否正常
	 */
	@Test
	public void testMB() {
	}

}
