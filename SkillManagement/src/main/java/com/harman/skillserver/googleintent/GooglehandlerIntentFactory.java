package com.harman.skillserver.googleintent;

public class GooglehandlerIntentFactory {

	public static String getResponse(String action, String requestJson) {
		try {
			if (action != null && !action.isEmpty()) {
				switch (action) {
				case GoogleIntentConstant.REMIND_ME_ACTION:
					return new GoogleRemindmeIntentHandler().generateResponse(requestJson);
				case GoogleIntentConstant.UPDATE_SHOPPING_LIST_ACTION:
					return new GoogleShoppingListIntentHandler().generateResponse(requestJson);
				default:
					break;
				}
			} else {
				return new GoogleErrorStatus("400", "Bad request. Action is not mentioned.").toString();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new GoogleErrorStatus("400", "Bad request. JSON malformed.").toString();
		}
		return new GoogleErrorStatus("400", "Bad request").toString();
	}
}
