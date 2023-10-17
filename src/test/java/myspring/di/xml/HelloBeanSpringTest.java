package myspring.di.xml;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class HelloBeanSpringTest {
	
	@Autowired
	Hello hello;
	
	@Autowired
	@Qualifier("helloC")
	Hello hello2;
	
	@Resource(name = "helloC")
	Hello hello3;
	
	@Autowired
	@Qualifier("strPrinter")
	Printer printer;
	

	@Test
	public void helloC() {
		assertEquals("Hello 생성자", hello2.sayHello());
		assertEquals("Hello 생성자", hello3.sayHello());
	}
	
	@Test //@Disabled
	public void hello() {
		assertEquals("Hello 스프링", hello.sayHello());
		hello.print();
		assertEquals("Hello 스프링", printer.toString());
	}
	
}
