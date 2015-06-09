package com.example.yshahak.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener, View.OnTouchListener{

    private Button appBtn1, appBtn2, appBtn3, appBtn4, appBtn5, appBtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appBtn1 = (Button) findViewById(R.id.btn_app1);
        appBtn2 = (Button) findViewById(R.id.btn_app2);
        appBtn3 = (Button) findViewById(R.id.btn_app3);
        appBtn4 = (Button) findViewById(R.id.btn_app4);
        appBtn5 = (Button) findViewById(R.id.btn_app5);
        appBtn6 = (Button) findViewById(R.id.btn_app6);

        appBtn1.setOnClickListener(this);
        appBtn1.setOnTouchListener(this);
        appBtn2.setOnClickListener(this);
        appBtn2.setOnTouchListener(this);
        appBtn3.setOnClickListener(this);
        appBtn3.setOnTouchListener(this);
        appBtn4.setOnClickListener(this);
        appBtn4.setOnTouchListener(this);
        appBtn5.setOnClickListener(this);
        appBtn5.setOnTouchListener(this);
        appBtn6.setOnClickListener(this);
        appBtn6.setOnTouchListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btn_app1:

                break;
            case R.id.btn_app2:

                break;
            case R.id.btn_app3:

                break;
            case R.id.btn_app4:

                break;
            case R.id.btn_app5:

                break;
            case R.id.btn_app6:

                break;
        }
        makeToast((Button) v);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int id = v.getId();
        switch (id){
            case R.id.btn_app1:

                break;
            case R.id.btn_app2:

                break;
            case R.id.btn_app3:

                break;
            case R.id.btn_app4:

                break;
            case R.id.btn_app5:

                break;
            case R.id.btn_app6:

                break;
        }
        return false;
    }

    private void makeToast(Button view){
        String appName =getResources().getString(R.string.tost_prefix) + " " +  view.getText();
        Toast.makeText(this, appName, Toast.LENGTH_SHORT).show();
    }
}
