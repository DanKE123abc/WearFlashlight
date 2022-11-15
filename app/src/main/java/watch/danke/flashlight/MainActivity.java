package watch.danke.flashlight;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Open(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,FlashlightActivity.class);
        startActivity(intent);
    }
    public void About(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,AboutActivity.class);
        startActivity(intent);
    }
}