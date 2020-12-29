package com.example.combiyago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    Button SigUp;
    Button SignIn;
    Intent intent;
    String u = "vishnu";
     String p = "vishnu";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        SigUp = (Button) findViewById(R.id.button);
        SignIn = (Button) findViewById(R.id.button2);
        String username = editText.getText().toString();
        String password = editText2.getText().toString();
      intent  = new Intent(this, HomeActivity.class);
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editText.getText().toString();
                String password = editText2.getText().toString();

if(username.isEmpty()|| password.isEmpty()){

    Toast.makeText(getApplicationContext(),"Please Enter Correct Details", Toast.LENGTH_LONG).show();
}
               if(password.equals(u) && username.equals(p)){
                   Toast.makeText(getApplicationContext(),"Great !", Toast.LENGTH_LONG).show();
                   startActivity(intent);


               }
                 else {
                   Toast.makeText(getApplicationContext(),"Please check your password and username !", Toast.LENGTH_LONG).show();
               }

               }


        });


    }



}
