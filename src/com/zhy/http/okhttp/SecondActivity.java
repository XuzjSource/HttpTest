package com.zhy.http.okhttp;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.httptest.R;
import com.zhy.http.okhttp.callback.StringCallback;

public class SecondActivity extends Activity {
	Button button2;
	Button button3;
	TextView testview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		testview = (TextView) findViewById(R.id.textview2);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {/*
				// TODO Auto-generated method stub
				//创建okHttpClient对象
				OkHttpClient mOkHttpClient = new OkHttpClient();
				//创建一个Request
				final Request request = new Request.Builder()
				                .url("https://github.com/hongyangAndroid")
				                .build();
				Call call = mOkHttpClient.newCall(request); 
				//请求加入调度
				call.enqueue(new Callback()
				        {
							@Override
							public void onFailure(Request arg0, IOException arg1) {
							}
							@Override
							public void onResponse(Response response)
									throws IOException {
								System.out.println(response.body().string());
							}
				        });       
			*/}
		});
		
		button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				OkHttpUtils.get().url("http://www.weather.com.cn/data/list3/city.xml")
				.build()
				.execute(new StringCallback() {

					@Override
					public void onError(Call arg0, Exception arg1) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onResponse(String arg0) {
						// TODO Auto-generated method stubo
						System.out.println(arg0);
						testview.setText(arg0);
					}
				});
			}
		});
	}
}
