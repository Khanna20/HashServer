package com.harman.skillserver.googleintent;

import org.json.JSONObject;

public class GoogleErrorStatus {
	String code;
	String errorType;

	public GoogleErrorStatus(String code, String errorType) {
		this.code = code;
		this.errorType = errorType;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		JSONObject status = new JSONObject();
		code = (code == null || code.isEmpty()) ? "500" : code;
		errorType = (errorType == null || errorType.isEmpty()) ? "Internal Server Error" : errorType;
		status.put("code", code);
		status.put("errorType", errorType);
		return status.toString();
	}
}