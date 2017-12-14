package com.huai.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {
    private EditText edNickname;
    private EditText edPhone;
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
    }
    public void ok(View view){
        String nickname = edNickname.getText().toString();
        String phone = edPhone.getText().toString();
        if ("jack".equals(nickname) && "0912345678".equals(phone)) {
            getIntent().putExtra("EXTRA_NICKNAME", nickname);
            getIntent().putExtra("EXTRA_PHONE", phone);
            setResult(RESULT_OK, getIntent());
            finish();
        }
    }
}
