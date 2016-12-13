package app.runaking.whereltc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AuthenticationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
    } // Main method
    public void  clickSignUpMain(View view) {
        startActivity(new Intent(AuthenticationActivity.this, SignUpActivity.class));
    }
}   //Main class
