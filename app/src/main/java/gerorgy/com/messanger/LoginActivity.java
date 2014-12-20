package gerorgy.com.messanger;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class LoginActivity extends ActionBarActivity {


    protected TextView mSignupTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mSignupTextView = (TextView)findViewById(R.id.signUpTextField);
        mSignupTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SingupActivity.class);
                startActivity(intent);
            }
        });
    }
}
