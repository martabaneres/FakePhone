package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FakePhoneActivity extends AppCompatActivity {

    TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);
        number = (TextView) findViewById(R.id.TextView);

        number.setText("");
    }


    public void clicat(View v) {
        Button boto = (Button) v;
        String text = boto.getText().toString();
        String num = number.getText().toString();
        number.setText(num + text);
    }

    public void truca(View v) {
        Button trucar = (Button) v;
        String missatge = String.format("Trucant a %s", number.getText().toString());
        Toast.makeText(this,missatge, Toast.LENGTH_LONG).show();
    }

    public void esborra(View v) {
        Button esborrar = (Button) v;
        String num = number.getText().toString();
        num = num.substring(0, (num.length() -1));
        number.setText(num);
    }

}
