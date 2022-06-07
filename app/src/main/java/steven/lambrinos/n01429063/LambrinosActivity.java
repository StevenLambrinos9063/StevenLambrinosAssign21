/*
Steven Lambrinos n01429063
Assignment 2
 */
package steven.lambrinos.n01429063;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class LambrinosActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lambrinos);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    // todo: goto back activity from here
                    finish();
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
    }