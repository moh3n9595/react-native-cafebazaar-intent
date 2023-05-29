package com.moh3n95.bazaarIntents;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

import android.content.Intent;
import android.net.Uri;
import android.content.Context;

public class RNCafebazaarIntentModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private static final String PACKAGE = "com.farsitel.bazaar";
  private static final String PACKAGE_MYKET = "ir.mservices.market";

  public RNCafebazaarIntentModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCafebazaarIntent";
  }

  @ReactMethod
   public void rateMyket(String packageName, Promise promise) {
     try {
          String url= "myket://comment?id=" + packageName;
          Intent intent = new Intent();
          intent.setAction(Intent.ACTION_VIEW);
          intent.setData(Uri.parse(url));
          startActivity(intent);
       promise.resolve(true);
     }
     catch (Exception e) {
       promise.reject(e.getMessage());
     }
   }


  @ReactMethod
  public void rate(String packageName, Promise promise) {
    try {
      Intent intent = new Intent(Intent.ACTION_EDIT);
      intent.setData(Uri.parse("bazaar://details?id=" + packageName));
      statBazaarActivity(intent);
      promise.resolve(true);
    }
    catch (Exception e) {
      promise.reject(e.getMessage());
    }
  }

  @ReactMethod
  public void view(String packageName, Promise promise) {
    try {
      Intent intent = new Intent(Intent.ACTION_VIEW);
      intent.setData(Uri.parse("bazaar://details?id=" + packageName));
      statBazaarActivity(intent);
      promise.resolve(true);
    }
    catch (Exception e) {
      promise.reject(e.getMessage());
    }
  }

  @ReactMethod
  public void login(Promise promise) {
    try {
      Intent intent = new Intent(Intent.ACTION_VIEW);
      intent.setData(Uri.parse("bazaar://login"));
      statBazaarActivity(intent);
      promise.resolve(true);
    }
    catch (Exception e) {
      promise.reject(e.getMessage());
    }
  }

  @ReactMethod
  public void developerCollection(String DEVELOPER_ID, Promise promise) {
    try {
      Intent intent = new Intent(Intent.ACTION_VIEW);
      intent.setData(Uri.parse("bazaar://collection?slug=by_author&aid=" + DEVELOPER_ID));
      statBazaarActivity(intent);
      promise.resolve(true);
    }
    catch (Exception e) {
      promise.reject(e.getMessage());
    }
  }

  private void statBazaarActivity(Intent intent) {
    intent.setPackage(PACKAGE);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    this.reactContext.startActivity(intent);
  }
}
