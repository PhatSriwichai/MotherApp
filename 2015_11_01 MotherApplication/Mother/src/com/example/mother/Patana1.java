package com.example.mother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Patana1 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patana1);
        
        Button but1 = (Button)findViewById(R.id.pata1_1);
        Button but2 = (Button)findViewById(R.id.pata1_2);
        Button but3 = (Button)findViewById(R.id.pata1_3);
        ImageButton back = (ImageButton)findViewById(R.id.back);
        
        but1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana1_1.class);
				startActivity(i);
			}
        	});
        
        but2.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana1_2.class);
				startActivity(i);
			}
        	});
        
        but3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana1_3.class);
				startActivity(i);
			}
        	});
        
        back.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), MomActivity.class);
				startActivity(i);
			}
        	});
        
    }
}
