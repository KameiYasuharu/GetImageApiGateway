package com.example.apigateway.dto;

/**
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 */

public class GetImageResponse {

	private byte[] imageData;

	private String imageName;

	private String mimeType;

	/**
	 * imageDataプロパティの値を取得します。	
	 */
	public byte[] getImageData() {
		return imageData;
	}

	/**
	 * imageDataプロパティの値を設定します。
	 * 
	 */
	public void setImageData(byte[] value) {
		this.imageData = value;
	}

	/**
	 * imageNameプロパティの値を取得します。	
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * imageNameプロパティの値を設定します。
	 * 	
	 */
	public void setImageName(String value) {
		this.imageName = value;
	}

	/**
	 * mimeTypeプロパティの値を取得します。
	 * 	
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * mimeTypeプロパティの値を設定します。	
	 */
	public void setMimeType(String value) {
		this.mimeType = value;
	}

}
