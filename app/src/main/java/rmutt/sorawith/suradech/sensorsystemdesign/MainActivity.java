package rmutt.sorawith.suradech.sensorsystemdesign;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     // Explicit
    private ImageView switchImageView,carParkImageView,
        checkTempImageView,voltImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          // Bind widgetImage
        switchImageView = (ImageView) findViewById(R.id.imageView2);
        carParkImageView = (ImageView) findViewById(R.id.imageView3);
        checkTempImageView = (ImageView) findViewById(R.id.imageView4);
        voltImageView = (ImageView) findViewById(R.id.imageView5);
          //Image Controller
        switchImageView.setOnClickListener(this);
        carParkImageView.setOnClickListener(this);
        checkTempImageView.setOnClickListener(this);
        voltImageView.setOnClickListener(this);

    }  // Main Method

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView2:
                //startActivity(new Intent(MainActivity.this,SwitchActivity.class));

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://192.168.1.5"));
                startActivity(intent);

                break;
            case R.id.imageView3:
                //startActivity(new Intent(MainActivity.this,CarParkActivity.class));
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://192.168.1.12"));
                startActivity(intent1);

                break;
            case R.id.imageView4:
                startActivity(new Intent(MainActivity.this,TempActivity.class));
                break;
            case R.id.imageView5:
                startActivity(new Intent(MainActivity.this,VoltActivity.class));
                break;
        }

    }  // on Click
} // Main class
