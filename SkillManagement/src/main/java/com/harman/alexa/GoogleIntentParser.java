package com.harman.alexa;

import org.json.JSONObject;

public class GoogleIntentParser {

	public String parseGoogleIntent(String json) {
		try {
			JSONObject requestJson = new JSONObject(json);
			JSONObject response;
			JSONObject queryResult = requestJson.has("queryResult") ? requestJson.getJSONObject("queryResult") : null;
			if (queryResult != null) {
				// String queryText = requestJson.has("queryText") ?
				// requestJson.getString("queryText") : "";
				return queryResult.has("action") ? queryResult.getString("action") : "";
//				response = handleAction(action, queryResult.getJSONObject("parameters"));
//				System.out.println("Response:: ---------------- " + response);
//				if (response == null || response.length() == 0) {
//					response = new JSONObject(
//							"{\"fulfillmentText\": \"There is some problem with the intent handler\"}");
//				}
//				return response.toString();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "";
		//		JSONObject status = new JSONObject();
//		status.put("code", "400");
//		status.put("errorType", "Bad request");
//		return status.toString();
	}

//	private JSONObject handleAction(String action, JSONObject jsonObject) {
//		// TODO Auto-generated method stub
//		switch (action) {
//		case "input.remindme":
//			try {
//				GoogleRemindParametersModel model = parseRemindIntent(jsonObject);
//				JSONObject response = new AlexaManager().setReminderFromGoogleAssistant(model);
//				return response;
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//			return new JSONObject("{\"fulfillmentText\":\" Please try again\"");
//
//		case "input.conversation":
//
//			try {
//				GooglePickUpParametersModel model = new Gson().fromJson(jsonObject.toString(),
//						GooglePickUpParametersModel.class);
//				System.out.println("Request Pick up" + model);
//				JSONObject response = new AlexaManager().updateShoppingList(model);
//				return response;
//			} catch (Exception e) {
//
//			}
//
//		default:
//			return new JSONObject("{\"fulfillmentText\":\" Please try again\"");
//		}
//	}
//
//	private GoogleRemindParametersModel parseRemindIntent(JSONObject parameter) {
//		try {
//			if (parameter != null) {
//				GoogleRemindParametersModel parameters = new GoogleRemindParametersModel();
//				String action_type = parameter.has("action_type") ? parameter.getString("action_type") : "";
//				String text_msg = parameter.has("text_msg") ? parameter.getString("text_msg") : "";
//				String where_to_pick = parameter.has("where_to_pick") ? parameter.getString("where_to_pick") : "";
//				String when_to_pick = parameter.has("when_to_pick") ? parameter.getString("when_to_pick") : "";
//				String given_name = parameter.has("given-name") ? parameter.getString("given-name") : "";
//				parameters.setAction_type(action_type);
//				parameters.setText_msg(text_msg);
//				parameters.setWhere_to_pick(where_to_pick);
//				parameters.setWhen_to_pick(when_to_pick);
//				parameters.setGiven_name(given_name);
//				System.out.println("Parameter received from google::::: " + parameters);
//				return parameters;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

}
