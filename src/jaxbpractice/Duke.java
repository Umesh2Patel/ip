package jaxbpractice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Duke {
	
	private String language;
	private int age;
	
	
	public Duke() {
		
	}


	public Duke(String language, int age) {
		this.language = language;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Duke [language=" + language + ", age=" + age + "]";
	}
	
	
	

}
