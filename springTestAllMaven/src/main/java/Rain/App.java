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
		contextLoad();
    }

	/**
	 * 1、容器加载测试
	 */
	public static void contextLoad(){
		System.out.println( "1、开始容器加载以及获取bean测试" );
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\program\\spring-framework-5.0.x\\springTestAllMaven\\src\\main\\resources\\spring.xml");
		Book book = (Book)applicationContext.getBean("book");
		book.buyBook("a", "spring is coming");
	}
}
