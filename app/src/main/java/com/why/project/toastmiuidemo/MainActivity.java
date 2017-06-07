package com.why.project.toastmiuidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.why.project.toastmiuidemo.views.ToastMiui;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ToastMiui toastMiui = ToastMiui.MakeText(this,"仿MIUI的带有动画的Toast",ToastMiui.LENGTH_LONG);
		/*toastMiui.setText(getResources().getString(R.string.app_name));
		toastMiui.setGravity(Gravity.CENTER,0,0);*/
		toastMiui.show();

	}
}
