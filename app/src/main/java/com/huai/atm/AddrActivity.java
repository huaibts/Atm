package com.huai.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;

public class AddrActivity extends AppCompatActivity {

    private Spinner spCity;
    private Spinner spArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        spCity = (Spinner) findViewById(R.id.sp_city);
        spArea = (Spinner) findViewById(R.id.sp_area);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, new String[]{"11","22","33"});
        spCity.setAdapter(adapter);
        spCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String[] data = null;
                switch(position){
                    case 0:
                        data = new String[]{"1","2","3"};
                        break;
                    case 1:
                        data = new String[]{"4","5","6"};
                        break;
                    case 2:
                        data = new String[]{"7","8","9"};
                        break;
                }
                ArrayAdapter adapter1 = new ArrayAdapter(
                        AddrActivity.this, android.R.layout.simple_list_item_1,
                        data);
                spArea.setAdapter(adapter1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
