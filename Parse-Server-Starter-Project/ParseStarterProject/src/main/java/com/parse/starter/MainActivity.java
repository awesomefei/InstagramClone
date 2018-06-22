/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;


public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {




    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);





    //check login or not
    //ParseUser.logOut();
     /* if(ParseUser.getCurrentUser()!= null){
      Log.i("currentUser", "User logged in " + ParseUser.getCurrentUser().getUsername());
    }else {
      Log.i("currentUser", "User nor logged in");
    }



    //check the user's name and password
    ParseUser.logInInBackground("reobpercival", "123", new LogInCallback() {
      @Override
      public void done(ParseUser user, ParseException e) {
       if(user != null){
         Log.i("Login", "Successfull");
       }else{
         Log.i("Login", "Successfull" + e.toString());
       }
      }
    });



//set a new user
    ParseUser user = new ParseUser();
    user.setUsername("reobpercival");
    user.setPassword("myPass");

    user.signUpInBackground(new SignUpCallback() {
      @Override
      public void done(ParseException e) {
       if(e == null){
         Log.i("sign up ", "Success");
       }else{
         Log.i("sign up ", "Failed");
       }
      }
    });





//how to create an class
//Score is the name of the class
    ParseObject score = new ParseObject("Score");
    score.put("username", "rob");
    score.put("score", 86);
    score.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if(e == null){
          Log.i("SaveInBackground", "Successful");
        }else{
          Log.i("SaveInBackground", "Failed.Error:" + e.toString());

        }
      }
    });

//read data
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
    query.getInBackground("C9Bhdbw0Z6", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if(e == null && object != null){
          Log.i("ObjectValue", object.getString("username"));
          Log.i("ObjectValue", Integer.toString(object.getInt("score")));
        }
      }
    });

//update
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
    query.getInBackground("C9Bhdbw0Z6", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if(e == null && object != null){
          object.put("score", 200);
          object.saveInBackground();
          Log.i("ObjectValue", object.getString("username"));
          Log.i("ObjectValue", Integer.toString(object.getInt("score")));
        }
      }
    });

//find the exact data
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
    query.whereEqualTo("username", "Tommy");
    query.setLimit(1);

    query.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e) {
        if(e == null){
          Log.i("findInBackground", "retrieved " + objects.size() + " objects");
          if(objects.size() > 0){
            for(ParseObject object : objects){
              Log.i("findInBackground", object.getString("username"));
            }
          }
        }
      }
    });

    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
    query.whereGreaterThan("score", 200);
    query.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e) {
        if(e == null && objects != null){
          for(ParseObject object : objects){
            object.put("score", object.getInt("score") + 50);
            object.saveInBackground();
          }
        }
      }
    });
*/

    ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}