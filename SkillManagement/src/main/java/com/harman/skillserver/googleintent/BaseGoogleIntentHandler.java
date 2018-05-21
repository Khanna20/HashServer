package com.harman.skillserver.googleintent;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.json.JSONObject;

import com.google.gson.Gson;

public abstract class BaseGoogleIntentHandler<T> {

	protected abstract String generateResponse(String requestJson);

	protected T getModel(String requestJson, Class<T> dataClass) {
		JSONObject req = new JSONObject(requestJson);
		QueryResultModel<T> model = new Gson().fromJson(req.getJSONObject("queryResult").toString(),
				getType(QueryResultModel.class, dataClass));
		return model.getParameters();
	}

	private Type getType(final Class<?> rawClass, final Class<?> parameterClass) {
		return new ParameterizedType() {
			@Override
			public Type[] getActualTypeArguments() {
				return new Type[] { parameterClass };
			}

			@Override
			public Type getRawType() {
				return rawClass;
			}

			@Override
			public Type getOwnerType() {
				return null;
			}
		};
	}
}
