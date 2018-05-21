package com.harman.skillserver.googleintent;

import com.harman.alexa.AlexaManager;
import com.harman.skillserver.googleintent.GoolgleResponse.GoogleResponseBuilder;
import com.harman.skillserver.model.google_intent_model.GoogleRemindParametersModel;

public class GoogleRemindmeIntentHandler extends BaseGoogleIntentHandler<GoogleRemindParametersModel> {

	@Override
	public String generateResponse(String requestJson) {
		try {
			return new AlexaManager().setReminderFromGoogleAssistant(getModel(requestJson, GoogleRemindParametersModel.class));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new GoogleResponseBuilder().setFulfillmentText(GoogleIntentConstant.ERROR_IN_SETTING_REMINDER_RESPONSE)
				.build();
	}

}
