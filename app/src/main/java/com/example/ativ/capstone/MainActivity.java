package com.example.ativ.capstone;



import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myListener1(View v) {
        Intent intent = new Intent(getApplicationContext(), play.class);
        startActivity(intent);
        Toast.makeText(this, "보행자 안전 장치 작동중", Toast.LENGTH_LONG).show();

    }

    public void myListener2(View v) {
        Intent intent = new Intent(getApplicationContext(), explain.class);
        startActivity(intent);
    }

    public void myListener3(View v) {
        Intent intent = new Intent(getApplicationContext(), listviewActivity.class);
        startActivity(intent);
    }

}
