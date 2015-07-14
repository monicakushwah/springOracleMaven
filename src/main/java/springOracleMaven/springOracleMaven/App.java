package springOracleMaven.springOracleMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("C:\\Users\\monica\\Documents\\workspace-sts-3.7.0.RELEASE\\springOracleMaven\\src\\main\\java\\springOracleMaven\\springOracleMaven\\spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		MyDAO dao = context.getBean("myDAO", MyDAO.class);
		System.out.println("connection made");
		dao.createTriangleTable();

		System.out.println("------success-----");
	}
}
