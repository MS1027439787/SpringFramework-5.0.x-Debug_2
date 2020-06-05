package Rain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\program\\spring-framework-5.0.x\\springTestAllMaven\\src\\main\\resources\\spring.xml");
		Book book = (Book)applicationContext.getBean("book");
		book.buyBook("a", "spring is coming");
    }
}
