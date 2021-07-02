package in.demo.d1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// 1. create Spring container
		ApplicationContext ac = new ClassPathXmlApplicationContext("myconfig.xml");

		// 2. read object (get bean) from container
		Object ob = ac.getBean("pob");

		// 3. downcast
		// Product p = (Product)ob;
		System.out.println("Ajinkya");
		// 4. print data
		System.out.println(ob);
		System.out.println("Hello");
	}
}