package com.example.hongv.loginfacebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView= (TextView) findViewById(R.id.textView);
        txtView.setText(Html.fromHtml("<u>Sign up for facebook</u>"));

    }
}
