package com.e.jogopapeltesouraepedra;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void papelSelecionado(View view){

        this.usuarioSelecionado("papel");
    }

    public void pedraSelecionado(View view){

        this.usuarioSelecionado("pedra");
    }
    public void tesouraSelecionado(View view){

        this.usuarioSelecionado("tesoura");//tomar cuidado tesouraSelecionado e uma função relacionado a imagem tesoura,então em usuario retornar tesoura

         }

    public void usuarioSelecionado(String usuarioSelecionado){
        ImageView  automatico = findViewById(R.id.appSelecionou);
        String[]   array = {"papel","pedra","tesoura"};
        int numero = new Random().nextInt(3);
        String opcaoApp = array[numero];
        switch (opcaoApp){
            case  "papel":
                   automatico.setImageResource(R.drawable.papel);
                   break;
            case  "pedra":
                   automatico.setImageResource(R.drawable.pedra);
                   break;
            case   "tesoura":
                   automatico.setImageResource(R.drawable.tesoura);
                   break;
        }
           if      (opcaoApp == "papel" && usuarioSelecionado == "pedra"|| opcaoApp == "tesoura" && usuarioSelecionado == "papel"|| opcaoApp == "pedra" && usuarioSelecionado == "tesoura") {
                   TextView texto = findViewById(R.id.resultado);
                   texto.setText("Você perdeu:(");

           }else if (usuarioSelecionado == "papel" && opcaoApp == "pedra" || usuarioSelecionado == "tesoura" && opcaoApp == "papel" || usuarioSelecionado == "pedra" && opcaoApp == "tesoura") {
                    TextView texto1 = findViewById(R.id.resultado);
                    texto1.setText("Você ganhou(:");
           } else {
                TextView texto2 = findViewById(R.id.resultado);
                texto2.setText("Empatamos!!!");
            }


    }
}



