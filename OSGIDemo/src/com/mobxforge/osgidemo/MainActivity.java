package com.mobxforge.osgidemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void call(View v){
    	View textfield = v.findViewById(R.id.editText1);
    	if(textfield instanceof EditText){
    		EditText et = (EditText) textfield;
    		et.getText().clear();
    		et.getText().append("calling....");
    	}
    	
    }
    
    
}
