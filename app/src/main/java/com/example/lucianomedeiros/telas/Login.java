package com.example.lucianomedeiros.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    Button botaoLogin = (Button) findViewById(R.id.botaoLogin);

    botaoLogin.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            setContentView(R.layout.activity_criar_conta);
        }

    });



}
    public void ChamaTela(View v) {
        setContentView(R.layout.activity_criar_conta);
    }
}