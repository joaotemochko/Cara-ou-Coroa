package com.app.caraoucoroa;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

//Mechendo na primeira activity, servindo como "tela de carregamento"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adicionando CountDownTimer, para a tela de carregamento aparecer por determinado tempo
        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                //Chamando a outra activity depois de terminar o contador
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
            }

        }.start();


    }
}
