package com.terryyamg.analyticstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCrash = (Button) findViewById(R.id.btCrash);
        assert btCrash != null;
        btCrash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String name = null;
                    if (name.equals("test")){

                    }
                }catch (Exception e){
                    MyApplication.getInstance().trackException(e); //紀錄在Google Analytics裡
                    Log.i("NullPointerException",e+"");
                }
                //註解掉try catch會直接crash，也會紀錄在Google Analytics裡面
            }
        });
    }
}
