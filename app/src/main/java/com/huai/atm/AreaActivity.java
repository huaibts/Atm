package com.huai.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class AreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        ListView area = (ListView) findViewById(R.id.area);
        String[] area1 = new String[]{"新莊區","永和區","板橋區"};
    }
}
