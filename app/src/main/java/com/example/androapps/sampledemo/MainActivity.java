package com.example.androapps.sampledemo;

import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.androapps.sampledemo.Constant.DashBoard;
import com.example.androapps.sampledemo.Constant.DashBoardConstant;
import com.example.androapps.sampledemo.Login.ClsLogin;
import com.example.androapps.sampledemo.StartFragment.StartFragment;

public class MainActivity extends AppCompatActivity {

    DashBoardConstant dashBoard;


    public DashBoardConstant getDashBoard() {
        return dashBoard;
    }

    public void setDashBoard(DashBoardConstant dashBoard) {
        this.dashBoard = dashBoard;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dashBoard = new DashBoardConstant();
        setDashBoard(dashBoard);

        new StartFragment(getSupportFragmentManager(), R.id.main_container, new ClsLogin(), true, savedInstanceState);
    }

    boolean doubleClickToBack = false;

    @Override
    public void onBackPressed() {
        int countFrg = getSupportFragmentManager().getBackStackEntryCount();

        if (countFrg>1){
            FragmentManager manager = getSupportFragmentManager();
            String frgTAG = manager.getBackStackEntryAt(manager.getBackStackEntryCount() - 1).getName();
//            manager.popBackStack();

            for (int i= 2; i<countFrg; i++){

                if (frgTAG == null){
                    frgTAG = manager.getBackStackEntryAt(manager.getBackStackEntryCount() -1).getName();
                    manager.popBackStack();
                }

            }
            manager.popBackStack();

        }else{
            if (doubleClickToBack){
                super.onBackPressed();

            }

            this.doubleClickToBack = true;
            Toast.makeText(this, "Presses Back Again to Exit!", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleClickToBack = false;
                }
            }, 1000);

        }
    }
}
