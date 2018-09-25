package com.example.androapps.sampledemo.DashBoard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.androapps.sampledemo.Adapter.AdapterDashBoard;
import com.example.androapps.sampledemo.Constant.DashBoard;
import com.example.androapps.sampledemo.Constant.DashBoardConstant;
import com.example.androapps.sampledemo.MainActivity;
import com.example.androapps.sampledemo.R;

import java.util.ArrayList;

public class ClsDashBoardMain extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    AdapterDashBoard adapterDashBoard;
    DashBoardConstant dashBoard;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.main_dashboard, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        dashBoard = ((MainActivity)getActivity()).getDashBoard();
    }

    private void initView() {
        recyclerView = getActivity().findViewById(R.id.recView);
        linearLayoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapterDashBoard = new AdapterDashBoard(dashBoard.DashBoardItems(), getActivity().getApplicationContext());
        recyclerView.setAdapter(adapterDashBoard);
        adapterDashBoard.notifyDataSetChanged();


    }
}
