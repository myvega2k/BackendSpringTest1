package myspring.di.annot;

import org.springframework.stereotype.Component;

@Component("consolePrinter")
public class ConsolePrinter implements Printer {
	public ConsolePrinter() {
		System.out.println(this.getClass().getName() + " 생성자 호출됨!!");
	}
	
	public void print(String message) {
		System.out.println(message);
	}
}
