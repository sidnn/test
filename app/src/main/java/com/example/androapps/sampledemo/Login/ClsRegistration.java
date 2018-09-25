package com.example.androapps.sampledemo.Login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androapps.sampledemo.DashBoard.ClsDashBoardMain;
import com.example.androapps.sampledemo.R;
import com.example.androapps.sampledemo.StartFragment.StartFragment;

public class ClsRegistration extends Fragment {
    Button registerbtn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.registration, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new StartFragment(getFragmentManager(), R.id.main_container, new ClsDashBoardMain(), true, savedInstanceState);
            }
        });
    }
}
