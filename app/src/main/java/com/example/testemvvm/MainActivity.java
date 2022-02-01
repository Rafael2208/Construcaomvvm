package com.example.testemvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mTextHello = findViewById(R.id.text_hello);

        MainViewModel vm = new ViewModelProvider(this).get(MainViewModel.class);
        vm.hello.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                mTextHello.setText(s);
            }
        });
    }
}