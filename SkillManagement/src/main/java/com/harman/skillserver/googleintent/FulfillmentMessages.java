package com.harman.skillserver.googleintent;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FulfillmentMessages {

	@SerializedName("card")
	@Expose
	private Card card;

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public static class Card {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("subtitle")
		@Expose
		private String subtitle;
		@SerializedName("imageUri")
		@Expose
		private String imageUri;
		@SerializedName("buttons")
		@Expose
		private List<Button> buttons = null;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

		public String getImageUri() {
			return imageUri;
		}

		public void setImageUri(String imageUri) {
			this.imageUri = imageUri;
		}

		public List<Button> getButtons() {
			return buttons;
		}

		public void setButtons(List<Button> buttons) {
			this.buttons = buttons;
		}

	}

	public static class Button {

		@SerializedName("text")
		@Expose
		private String text;
		@SerializedName("postback")
		@Expose
		private String postback;

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getPostback() {
			return postback;
		}

		public void setPostback(String postback) {
			this.postback = postback;
		}

	}
}