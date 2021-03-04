package com.example.macarons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcButton = (Button) findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextAlbusuri = (EditText) findViewById(R.id.editTextAlbusuri);
                TextView migdaleTextView2 = (TextView) findViewById(R.id.migdaleTextView2);
                TextView zaharPudraTextView2 = (TextView) findViewById(R.id.zaharPudraTextView2);
                TextView zaharTosTextView2 = (TextView) findViewById(R.id.zaharTosTextView2);
                TextView apaTextView2 = (TextView) findViewById(R.id.apaTextView2);

                int albusuri = Integer.parseInt(editTextAlbusuri.getText().toString());
                int migdale = Math.round(albusuri*1.363F);
                int pudra = Math.round(albusuri*1.363F);
                int tos = Math.round(albusuri*1.363F);
                int apa = Math.round(albusuri*0.341F);

                migdaleTextView2.setText(migdale + "");
                zaharPudraTextView2.setText(pudra + "");
                zaharTosTextView2.setText(tos + "");
                apaTextView2.setText(apa + "");
            }
        });
    }
}
