package pl.naniewicz.wrocloveplacesbase.ui.main;

import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import pl.naniewicz.wrocloveplacesbase.R;

public class MainActivity extends AppCompatActivity {

    //todo bind views

    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////todo bind butter knife
        setupToolbar();
        setupNavigationListener();
        setupViewPager();
        //todo setup tabLayout with view pager
    }

    @Override
    protected void onPostCreate(final Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        //todo sync drawerToggle
    }

    private void setupToolbar() {
        //todo setup toolbar
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            Toast.makeText(this, R.string.menu_settings, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupViewPager() {
        //todo setup view pager
    }

    private void setupNavigationListener() {
        //todo setupDrawer
    }

    //todo implement butterknife onClick

}