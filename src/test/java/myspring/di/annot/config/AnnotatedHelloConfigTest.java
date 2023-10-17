package myspring.di.annot.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import myspring.di.annot.Hello;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AnnotatedHelloConfig.class, 
	loader = AnnotationConfigContextLoader.class)
//AnnotationConfigContextLoader.class는 
//AnnotationConfigApplicationContext 라는 Spring Bean Container를 로딩 해주는 Loader 클래스이다. 
public class AnnotatedHelloConfigTest {
	@Autowired
	Hello hello;
	
	@Test
	public void hello() {
		System.out.println(hello.sayHello());
	}
}
