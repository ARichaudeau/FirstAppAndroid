package com.example.formation10.firstappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewScreen;
    private String operateur;
    private double chiffre1;
    private double resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewScreen = findViewById(R.id.textView_screen);

        Log.d("formation", "Création de MainActivity");
    }

    /**
     * Méthode qui affiche la saisie utilisateur sur l'écran
     * @param v
     */
    public void onDigitClicked(View v) {
        Button btn = (Button) v;

        Log.d("formation", btn.getText().toString());

        if (textViewScreen.getText().equals("0")) {
            textViewScreen.setText(btn.getText());
        } else {
            textViewScreen.setText(textViewScreen.getText() + btn.getText().toString());
        }
    }

    /**
     * Méthode qui stocke la saisie utilisateur et l'opérateur, puis affiche 0 à l'écran
     * @param v
     */
    public void onDigitOpClicked(View v) {
         Button btnOp = (Button)v;
         chiffre1 = Double.parseDouble(textViewScreen.getText().toString());
         operateur = btnOp.getText().toString();
         textViewScreen.setText("0");
        }

    /**
     * Méthode qui fait les calculs en fonction des opérateurs
     * @param v
     */
     public void onCalculClicked(View v)   {
        switch (operateur) {
            case "+" :
                resultat = chiffre1 + Double.parseDouble(textViewScreen.getText().toString());
                break;
            case "-" :
                resultat = chiffre1 - Double.parseDouble(textViewScreen.getText().toString());
                break;
            case "*" :
                resultat = chiffre1 * Double.parseDouble(textViewScreen.getText().toString());
                break;
            case "/" :
                resultat = chiffre1 / Double.parseDouble(textViewScreen.getText().toString());
                break;
                }
         textViewScreen.setText(String.valueOf(resultat));
         }

    /**
     * Méthode qui supprime les infos de l'écran quand on clique sur C
      * @param v
     */
     public void onDigitDeleteClicked(View v){
         textViewScreen.setText("0");
     }
}
