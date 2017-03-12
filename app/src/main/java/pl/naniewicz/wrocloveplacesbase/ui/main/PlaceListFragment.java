package pl.naniewicz.wrocloveplacesbase.ui.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.naniewicz.wrocloveplacesbase.R;
import pl.naniewicz.wrocloveplacesbase.model.Place;

public class PlaceListFragment extends Fragment {

    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    public static PlaceListFragment newInstance() {
        return new PlaceListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_places_list, container, false);
        ButterKnife.bind(this, view);
        setupSwipeToRefresh();
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView() {
        //todo add adapter
    }

    private void setupSwipeToRefresh() {
        //todo setup swipe to refresh
    }

    private void refresh() {
        //todo handle refresh
        new DummyBackgroundTask(this).execute();
    }

    public void onRefreshComplete(List<Place> places) {
        //todo handle refresh complete
    }
}
