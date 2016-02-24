package com.example.mother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Patana3 extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patana3);
        
        Button but1 = (Button)findViewById(R.id.pata3_1);
        Button but2 = (Button)findViewById(R.id.pata3_2);
        Button but3 = (Button)findViewById(R.id.pata3_3);
        ImageButton back = (ImageButton)findViewById(R.id.back3);
        
        but1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana3_1.class);
				startActivity(i);
			}
        	});
        
        but2.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana3_2.class);
				startActivity(i);
			}
        	});
        
        but3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana3_3.class);
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
