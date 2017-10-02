package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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



}
