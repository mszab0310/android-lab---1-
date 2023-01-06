package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSubmit(View view) {
        TextView name = findViewById(R.id.nameHolder);
        TextView lastName = findViewById(R.id.lastNameHolder);
        TextView cnp = findViewById(R.id.cnpHolder);
        EditText nameInp = findViewById(R.id.nameInputBox);
        EditText lastNameInp = findViewById(R.id.lastNameInput);
        EditText cnpInp = findViewById(R.id.cnpInput);
        name.setText(nameInp.getText().toString());
        lastName.setText(lastNameInp.getText().toString());
        cnp.setText(cnpInp.getText().toString());
    }

    public void showToastButton(View view){
        Context context = getApplicationContext();
        CharSequence toastMessage = "This is your toast";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,toastMessage,duration);
        toast.setGravity(Gravity.TOP, 0,0);
        toast.show();
    }
}