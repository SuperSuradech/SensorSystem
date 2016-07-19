package rmutt.sorawith.suradech.sensorsystemdesign;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class SwitchActivity extends AppCompatActivity {

     //Explicit
    private ToggleButton firsToggleButton,secToggleButton,thirdToggleButton, forToggleButton;
    private boolean statusABoolean = true;
    private String firstURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

         //Bind Widget
        firsToggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        secToggleButton = (ToggleButton) findViewById(R.id.toggleButton2);
        thirdToggleButton = (ToggleButton) findViewById(R.id.toggleButton3);
        forToggleButton = (ToggleButton) findViewById(R.id.toggleButton4);

          firsToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                  if (b){
                      firstURL = "http://192.168.1.2/ledon";
                  }else{
                      firstURL = "http://192.168.1.2/ledoff";
                  }

                  Log.d("SensorV1", "boolean ==>" + b);
                  Log.d("SensorV1", "URL ==>" + firstURL);

                  Intent intent = new Intent(Intent.ACTION_VIEW);
                  intent.setData(Uri.parse(firstURL));
                  startActivity(intent);
              } // onCheck
          });
    } //Main Method


} // Main class
