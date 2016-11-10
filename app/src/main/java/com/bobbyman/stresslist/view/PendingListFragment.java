package com.bobbyman.stresslist.view;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bobbyman.stresslist.R;
import com.bobbyman.stresslist.adapter.PendingsAdapter;
import com.bobbyman.stresslist.models.Pending;

/**
 * A placeholder fragment containing a simple view.
 */
public class PendingListFragment extends Fragment {

    private PendingsAdapter pendingsAdapter;

    public PendingListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pending_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = (RecyclerView) view;

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        pendingsAdapter = new PendingsAdapter();

        recyclerView.setAdapter(pendingsAdapter);
    }

    public void addPending(Pending pending){
        pendingsAdapter.add(pending);

    }


}
