package pl.naniewicz.wrocloveplacesbase.ui.form;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import pl.naniewicz.wrocloveplacesbase.R;

public class FormActivity extends AppCompatActivity {

    //todo Bind views

    public static void start(Context context) {
        Intent starter = new Intent(context, FormActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);
        setupToolbar();
    }

    private void setupToolbar() {
        //todo setup toolbar
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_form, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_login_help) {
            HelpDialogFragment.newInstance().show(getFragmentManager(), HelpDialogFragment.TAG);
        }
        return super.onOptionsItemSelected(item);
    }

    //todo implement butterknife onClick calling check form

    private void checkForm() {
        //todo implement form check
    }

    public boolean isEmailValid(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public boolean isPasswordValid(String password) {
        return !password.isEmpty();
    }

    public void setEmailValidationError(boolean state) {
        //todo set email validation error

    }

    public void setPasswordValidationError(boolean state) {
        //todo set email validation error
    }
}
