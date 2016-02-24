package com.example.mother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        
        Button patana1 = (Button)findViewById(R.id.pata1);
        Button patana2 = (Button)findViewById(R.id.pata2);
    	Button patana3 = (Button)findViewById(R.id.pata3);
    	Button patana4 = (Button)findViewById(R.id.pata4);
    	Button patana5 = (Button)findViewById(R.id.pata5);
    	Button patana6 = (Button)findViewById(R.id.pata6);
    	Button patana7 = (Button)findViewById(R.id.pata7);
    	
        patana1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana1.class);
				startActivity(i);
			}
        	});
        
        patana2.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana2.class);
				startActivity(i);
			}
        	});
        
        patana3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana3.class);
				startActivity(i);
			}
        	});
        
        patana4.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Patana4.class);
				startActivity(i);
			}
        	});
    }
}
