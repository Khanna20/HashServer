package com.harman.skillserver.googleintent;

import com.harman.alexa.AlexaManager;
import com.harman.skillserver.googleintent.GoolgleResponse.GoogleResponseBuilder;
import com.harman.skillserver.model.google_intent_model.GooglePickUpParametersModel;

public class GoogleShoppingListIntentHandler extends BaseGoogleIntentHandler<GooglePickUpParametersModel> {

	@Override
	public String generateResponse(String requestJson) {
		try {
			return new AlexaManager().updateShoppingList(getModel(requestJson, GooglePickUpParametersModel.class));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return new GoogleResponseBuilder().setFulfillmentText(GoogleIntentConstant.ERROR_IN_UPDATING_SHOPPING_LIST_RESPONSE)
				.build();
	}

}
