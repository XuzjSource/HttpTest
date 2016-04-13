package com.zhy.http.okhttp;

import com.example.httptest.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button button;
	TextView textview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button = (Button) findViewById(R.id.button);
		textview = (TextView) findViewById(R.id.textview);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				startActivity(intent);
				/*String address = "http://www.baidu.com";
				HttpUtil.sendHttpRequest(address, new HttpCallbackListener() {

					@Override
					public void onFinish(String response) {
						// TODO Auto-generated method stub
						//textview.setText(response);
						Message msg= new Message();
						msg.obj = response;
						handler.sendMessage(msg);
						System.out.println(response);
					}

					@Override
					public void onError(Exception e) {
						// TODO Auto-generated method stub

					}
				});*/
				// System.out.println(response);
			}
		});
	}

	//handler传递数据
		Handler handler = new Handler(){
			@Override
			public void handleMessage(Message msg) {
				// TODO Auto-generated method stub
				String m = (String) msg.obj;
				textview.setText(m);
			}
			
		};
}
