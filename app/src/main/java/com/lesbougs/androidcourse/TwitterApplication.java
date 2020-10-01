package com.lesbougs.androidcourse;

import android.app.Application;
import android.content.Context;

public class TwitterApplication extends Application {

	private static Context sContext;

	public void onCreate(){
		super.onCreate();

		// Keep a reference to the application context
		sContext = getApplicationContext();
	}

	// Used to access Context anywhere within the app
	public static Context getContext() {
		return sContext;
	}
}
