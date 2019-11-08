package com.test.client;
import java.net.MalformedURLException;
import java.net.URL;  
import javax.xml.namespace.QName;  
import javax.xml.ws.Service;  
import com.test.javaservice.IHelloWorld;;

public class HelloWorldClient {

	public static void main(String[] args) {
		 URL url = null;
		try {
			url = new URL("http://localhost:7779/ws/hello?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		   
	        //1st argument service URI, refer to wsdl document above  
	    //2nd argument is service name, refer to wsdl document above  
	        QName qname = new QName("http://javaservice.test.com/", "HelloWorldImplService");  
	        Service service = Service.create(url, qname);  
	        IHelloWorld hello = service.getPort(IHelloWorld.class);  
	        System.out.println(hello.getHelloWorldAsString("javatpoint document"));  

	}

}
