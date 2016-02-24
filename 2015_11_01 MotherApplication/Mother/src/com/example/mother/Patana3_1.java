package com.example.mother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Patana3_1 extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patana3_1);
       
        ImageButton back = (ImageButton)findViewById(R.id.back3_1);
        
        back.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana3.class);
				startActivity(i);
			}
        	});
        
    }
}
