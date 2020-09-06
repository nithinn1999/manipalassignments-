package shapemain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.manipal.spring_assignment.line;
import com.manipal.spring_assignment.triangle;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\spring.xml");

		line l1 = (line) context.getBean("line");
		System.out.println(l1);

		
		  triangle t1= (triangle) context.getBean("triangle"); System.out.println(t1);
		 

	}

}
