/*package com.android.shahryar.srijanchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}*/
package com.android.shahryar.srijanchat;

// import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
// import android.os.Bundle;
        import android.os.Handler;


public class SplashActivity extends Activity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashfile);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this, SrijanChat.class);
                startActivity(intent);
                finish();
            }
        },4000);

    }
}