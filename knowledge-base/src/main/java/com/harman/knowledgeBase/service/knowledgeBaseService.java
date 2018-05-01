
package com.harman.knowledgeBase.service;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.harman.knowledgeBase.models.Message;

public class knowledgeBaseService {

	

	private KieContainer kieContainer;

	public knowledgeBaseService() {
		KieServices kieServices = KieServices.Factory.get();
		this.kieContainer = kieServices.getKieClasspathContainer();
		
	}

	public void execute() throws Exception {
		// load up the knowledge base
		KieSession kSession = this.kieContainer.newKieSession("ksession-rules");
		try {   	    
			// fire all rules  
	         Message message = new Message();
	         message.setMessage("Hello World");
	         message.setStatus(Message.HELLO);
	         kSession.insert(message);
	         kSession.fireAllRules();
	     } catch (Throwable t) {
	         t.printStackTrace();
	     }

	}
	
}
