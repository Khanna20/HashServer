package com.harman.skillserver.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harman.alexa.GoogleIntentParser;
import com.harman.skillserver.googleintent.GooglehandlerIntentFactory;

@RestController
@RequestMapping("/Hash")
public class GoogleIntentController {
	@RequestMapping(value = "/googleCloud", method = RequestMethod.POST)
	public @ResponseBody String handleIntent(@RequestBody String requestBody) {
		System.out.println("---------------Received Post Request----------------- \n" + requestBody);
		String action = new GoogleIntentParser().parseGoogleIntent(requestBody);
		return GooglehandlerIntentFactory.getResponse(action, requestBody);
	}
}
