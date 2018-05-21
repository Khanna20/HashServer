package com.harman.skillserver.model.google_intent_model;

public class GoogleRemindParametersModel {

	private String action_type;
	private String text_msg;
	private String where_to_pick;
	private String when_to_pick;
	private String given_name;

	public String getAction_type() {
		return action_type;
	}

	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}

	public String getText_msg() {
		return text_msg;
	}

	public void setText_msg(String text_msg) {
		this.text_msg = text_msg;
	}

	public String getWhere_to_pick() {
		return where_to_pick;
	}

	public void setWhere_to_pick(String where_to_pick) {
		this.where_to_pick = where_to_pick;
	}

	public String getWhen_to_pick() {
		return when_to_pick;
	}

	public void setWhen_to_pick(String when_to_pick) {
		this.when_to_pick = when_to_pick;
	}

	public String getGiven_name() {
		return given_name;
	}

	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}

	@Override
	public String toString() {
		return "GoogleRemindParametersModel [action_type=" + action_type + ", text_msg=" + text_msg + ", where_to_pick="
				+ where_to_pick + ", when_to_pick=" + when_to_pick + ", given_name=" + given_name + "]";
	}

}
