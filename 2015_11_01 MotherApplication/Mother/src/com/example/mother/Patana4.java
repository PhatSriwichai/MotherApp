package com.example.mother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Patana4 extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patana4);
        
        Button but1 = (Button)findViewById(R.id.pata4_1);
        Button but2 = (Button)findViewById(R.id.pata4_2);
        ImageButton back = (ImageButton)findViewById(R.id.back4);
        
        but1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana4_1.class);
				startActivity(i);
			}
        	});
        
        but2.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana4_2.class);
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
