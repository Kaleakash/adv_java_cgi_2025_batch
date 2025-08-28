package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController   // @Controller + @ResponseBody
public class DifferentFormatMessageController {

	// http://localhost:8080/hi
	
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public String sayHi() {
		return "Welcome to Spring boot rest api";
	}
	// http://localhost:8080/plain
	@RequestMapping(value = "plain",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText() {
		return "<h1>Welcome to Spring boot rest api with plain text h1>";
	}
	
	// http://localhost:8080/html
		@RequestMapping(value = "html",
				method = RequestMethod.GET,
				produces = MediaType.TEXT_HTML_VALUE)
		public String sayHtml() {
			return "<h1>Welcome to Spring boot rest api with html text</h1>";
		}
		
		// http://localhost:8080/xml
				@RequestMapping(value = "xml",
						method = RequestMethod.GET,
						produces = MediaType.TEXT_XML_VALUE)
				public String sayXml() {
					return "<abc>Welcome to Spring boot rest api with xml text</abc>";
				}
}
