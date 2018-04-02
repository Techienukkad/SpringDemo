import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.techienukkad.spring.beans.Product;

public class Main {

	public static void main(String[] args) {
	
		@SuppressWarnings("deprecation")
		BeanFactory Factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Product product = (Product)Factory.getBean("product");
		product.confirm();
		
		/*//Creating Object using application Context
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Product p = (Product)context.getBean("product");*/
		
	}

}
