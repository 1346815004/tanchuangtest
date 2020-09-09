package com.example.tanchuangtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dianji(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        final View viewDialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_test, null, false);
        builder.setTitle("自定义对话框1")
                .setView(viewDialog)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        EditText editTextUserId = viewDialog.findViewById(R.id.tanchuan1);
                        EditText editTextUserPassword = viewDialog.findViewById(R.id.tanchuan2);

                        if (editTextUserId.getText().toString().equals("abc") && editTextUserPassword.getText().toString().equals("123")) {
                            Toast.makeText(MainActivity.this, "成功", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(MainActivity.this, "UserId：" + editTextUserId.getText().toString()
                                    + "UserPassword：" + "失败" + editTextUserPassword.getText().toString(), Toast.LENGTH_LONG).show();
                        }
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                         }
                         });
                         builder.create().show();
    }
}

//        builder.setMessage("这是一个普通的对话框").setTitle("对话框");
//        builder.show();

