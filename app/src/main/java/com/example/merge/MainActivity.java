package com.example.merge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_SHORT).show();
      
        
    }
    
    void testBranch() {
        Log.d("test","測試分支功能");
    }
}
