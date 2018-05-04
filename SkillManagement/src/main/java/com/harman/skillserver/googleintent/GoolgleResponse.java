package com.harman.skillserver.googleintent;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.lang.NonNull;

public class GoolgleResponse {

	private String fulfillmentText;
	private List<FulfillmentMessages> fulfillmentMessageList;

	private GoolgleResponse(String fulfillmentText, List<FulfillmentMessages> fulfillmentMessageList) {
		this.fulfillmentText = fulfillmentText;
		this.fulfillmentMessageList = fulfillmentMessageList;
	}

	public static class GoogleResponseBuilder {

		private String fulfillmentText;
		private List<FulfillmentMessages> fulfillmentMessageList;

		public GoogleResponseBuilder setFulfillmentText(String text) {
			this.fulfillmentText = text;
			return this;
		}

		public GoogleResponseBuilder addFulfillmentMessages(@NonNull FulfillmentMessages message) {

			if (fulfillmentMessageList == null) {
				fulfillmentMessageList = new ArrayList<>();
			}
			if (message != null) {
				fulfillmentMessageList.add(message);
			}

			return this;
		}

		public String build() {
			if (fulfillmentText == null || fulfillmentText.isEmpty()) {
				fulfillmentText = "Please try again...";
			}

			return new GoolgleResponse(fulfillmentText, fulfillmentMessageList).toString();
		}

	}

	@Override
	public String toString() {
		JSONObject response = new JSONObject();
		response.put("fulfillmentText", fulfillmentText);
		if (fulfillmentMessageList != null && fulfillmentMessageList.isEmpty()) {
			response.put("fulfillmentMessages", fulfillmentMessageList);
		}
		return response.toString();
	}

}
