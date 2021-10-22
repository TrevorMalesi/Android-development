package com.malesi.showname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button showButton;
    private TextView nameText;
    private EditText enterName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the elemets by id
        showButton=findViewById(R.id.button);
        nameText=findViewById(R.id.textView2);
        enterName=findViewById(R.id.editText);
        showButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name=enterName.getText().toString();
                if (name.isEmpty()){

                }else {
                    nameText.setText("Hello there " + name);
                }
            }
        });
    }

}