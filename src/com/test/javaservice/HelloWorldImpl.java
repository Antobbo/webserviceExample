//https://www.javatpoint.com/jax-ws-example-document-style
//also check https://java-samples.com/showtutorial.php?tutorialid=1732 and https://java-samples.com/showtutorial.php?tutorialid=1733 for explanation
//url http://localhost:7779/ws/hello?wsdl
package com.test.javaservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.test.javaservice.IHelloWorld")  
public class HelloWorldImpl  implements IHelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		 return "Hello World JAX-WS " + name;
	}

}
