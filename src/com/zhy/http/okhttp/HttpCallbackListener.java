package com.zhy.http.okhttp;

public interface HttpCallbackListener {
	void onFinish(String response);
	void onError(Exception e);
}
