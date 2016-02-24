package com.example.mother;

import java.io.*;
import java.net.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MomActivity extends Activity {
	//Button patana1 = (Button)findViewById(R.id.pata1);
	private EditText 	username;
	private EditText 	password;
	private Button 		login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        Intent i = new Intent(getApplicationContext(), MainMenu.class);
		startActivity(i);
        /*username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);
        
        login.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
			try{
        	//InetAddress ipHost = new InetAddress.getLocalHost();
			InetAddress addr = InetAddress.getByName("10.0.2.2");
		    int port = 9992;
			SocketAddress ipHost = new InetSocketAddress(addr,port);
        	Socket toServer = new Socket(addr,port);
        	//toServer.connect(ipHost);
        	PrintWriter output = new PrintWriter(toServer.getOutputStream(),true);
	        	BufferedReader input = new BufferedReader(
	        								new InputStreamReader(
	        								toServer.getInputStream()));
	        
	        //textView.setText("create complete"); 
        	toServer.close();
        
				}catch(UnknownHostException e){
					System.out.println(e);
				} catch (IOException e) {
					System.out.println(e);
				}
				
			}
			
        });*/
        
    }    
}
