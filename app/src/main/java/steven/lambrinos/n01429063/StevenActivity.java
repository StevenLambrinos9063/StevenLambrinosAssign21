/*
Steven Lambrinos n01429063
Assignment 2
 */
package steven.lambrinos.n01429063;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class StevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.helpmenu:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
                startActivity(browserIntent);
                break;
            case R.id.Rent:
                Intent dialIntent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:90569671111"));
                startActivity(dialIntent);

                break;
            case R.id.home:
                View parentLayout =
                        findViewById(android.R.id.content);
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent = new Intent(getApplicationContext(), StevenActivity.class);
                                        startActivity(intent);
                                    } };
            default:
                break;
        };
        return false;
    }

}




//
//public class SplashScreenActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splashscreen);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //This method will be executed once the timer is over
//                //Start your main activirt
//                Intent i = new Intent(SplashScreenActivity.this, StevenActivity.class);
//                startActivity(i);
//                finish();
//            }
//        }, 3000);
//    }
//}
//

//Button btn = (Button) findViewById(R.id.button);
//
//btn.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:0123456789"));
//        startActivity(intent);
//
//    }});
