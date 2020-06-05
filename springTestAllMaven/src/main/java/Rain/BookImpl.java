package Rain;

import org.springframework.stereotype.Component;

/**
 * @author masai
 * @date 2020/6/5
 */
@Component
public class BookImpl implements Book{
	public String buyBook(String name, String book){
		System.out.println("hello, world");
		return "success";
	}
}
