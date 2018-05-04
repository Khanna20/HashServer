package com.harman.skillserver.googleintent;

import com.google.gson.annotations.SerializedName;

public class QueryResultModel<T> {
	@SerializedName("queryText")
	String queryText;

	@SerializedName("parameters")
	T parameters;

	public T getParameters() {
		return parameters;
	}
}
