package myspring.di.xml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import myspring.di.xml.ConsolePrinter;
import myspring.di.xml.Hello;
import myspring.di.xml.Printer;
import myspring.di.xml.StringPrinter;

@Configuration
public class XmlHelloConfig {

	/* 
	 * <bean id="strPrinter" class="myspring.di.xml.StringPrinter" />
	 */
	@Bean
	public Printer strPrinter() {
		return new StringPrinter();
	}
	
	@Bean
	public Printer conPrinter() {
		return new ConsolePrinter();
	}
	
	@Bean
	public Hello hello() {
		Hello hello = new Hello();
		hello.setName("Java컨피그");
		hello.setPrinter(strPrinter());
		return hello;
	}
	
}
