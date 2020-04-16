package com.moh3n95.bazaarIntents;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.content.Intent;
import android.net.Uri;
import android.content.Context;

public class RNCafebazaarIntent extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeCafebazaarIntentModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCafebazaarIntent";
  }

  @ReactMethod
  public void rate(String PACKAGE_NAME) {  
    Intent intent = new Intent(Intent.ACTION_EDIT); 
    intent.setData(Uri.parse("bazaar://details?id=" + PACKAGE_NAME)); 
    statBazaarActivity(intent);
  }

  @ReactMethod
  public void view(String PACKAGE_NAME) {  
    Intent intent = new Intent(Intent.ACTION_VIEW); 
    intent.setData(Uri.parse("bazaar://details?id=" + PACKAGE_NAME)); 
    statBazaarActivity(intent);
  }

  @ReactMethod
  public void login() {  
    Intent intent = new Intent(Intent.ACTION_VIEW); 
    intent.setData(Uri.parse("bazaar://login"));
    statBazaarActivity(intent); 
  }

  @ReactMethod
  public void developerCollection(String DEVELOPER_ID) {  
    Intent intent = new Intent(Intent.ACTION_VIEW); 
    intent.setData(Uri.parse("bazaar://collection?slug=by_author&aid=" + DEVELOPER_ID)); 
    statBazaarActivity(intent);
  }

  private void statBazaarActivity(Intent intent) {
    intent.setPackage("com.farsitel.bazaar"); 
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    Context context = getReactApplicationContext();
    context.startActivity(intent); 
  }

}