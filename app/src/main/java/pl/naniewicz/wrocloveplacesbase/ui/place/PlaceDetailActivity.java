package pl.naniewicz.wrocloveplacesbase.ui.place;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import pl.naniewicz.wrocloveplacesbase.R;
import pl.naniewicz.wrocloveplacesbase.model.Place;

public class PlaceDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PLACE = "EXTRA_PLACE";

    //todo bind views

    private Place mPlace;

    public static void start(Context context, Place place) {
        Intent starter = new Intent(context, PlaceDetailActivity.class);
        starter.putExtra(EXTRA_PLACE, place);
        context.startActivity(starter);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);
        ButterKnife.bind(this);
        getPlaceFromIntent();
        setupToolbar();
        setContent();
    }

    private void getPlaceFromIntent() {
        Intent intent = getIntent();
        if (intent != null) {
            mPlace = intent.getParcelableExtra(EXTRA_PLACE);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_place_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_delete:
                Toast.makeText(this, R.string.menu_delete, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_share:
                Toast.makeText(this, R.string.menu_share, Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //todo implement fab click action

    private void setupToolbar() {
        //todo setup toolbar
    }

    private void setContent() {
        //todo set activity content
    }
}
