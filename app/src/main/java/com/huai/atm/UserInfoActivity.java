package com.huai.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {
    private static final String TAG = UserInfoActivity.class.getSimpleName();
    private EditText edNickname;
    private EditText edPhone;
    private Spinner ages;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        edNickname = (EditText) findViewById(R.id.ed_nickname);
        edPhone = (EditText) findViewById(R.id.ed_phone);
        String nickname = getSharedPreferences("userinfo", MODE_PRIVATE)
                .getString("NICKNAME", "");
        String phone = getSharedPreferences("userinfo", MODE_PRIVATE)
                .getString("PHONE", "");
        edNickname.setText(nickname);
        edPhone.setText(phone);
        ages = (Spinner) findViewById(R.id.ages);
       // ArrayList<String> data = new ArrayList<>();
       // for (int i = 15; i<=40; i++){
       //     data.add(i+"");
       // }
       /* ArrayAdapter adapter = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1,data);*/
       ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
               R.array.ages, android.R.layout.simple_list_item_1);
        ages.setAdapter(adapter);
    }
    public void ok(View view){
        Log.d(TAG, "ok: "+ages.getSelectedItem().toString());
        int age = Integer.parseInt(ages.getSelectedItem().toString());
        String nickname = edNickname.getText().toString();
        String phone = edPhone.getText().toString();
        getIntent().putExtra("EXTRA_NICKNAME", nickname);
        getIntent().putExtra("EXTRA_PHONE", phone);
        setResult(RESULT_OK, getIntent());
        finish();

    }
    public void addr(View view){
        //Intent intent = new Intent(this,AddrActivity.class);
        Intent intent = new Intent(this,CityActivity.class);
        startActivity(intent);
    }
}
