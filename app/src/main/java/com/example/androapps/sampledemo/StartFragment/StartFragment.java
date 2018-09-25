package com.example.androapps.sampledemo.StartFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class StartFragment {
    public StartFragment(FragmentManager manager, int container, Fragment fragment, boolean backStack, Bundle b) {
        Fragment currFrg = manager.findFragmentById(container);
        boolean frg_popuped = manager.popBackStackImmediate(fragment.getClass().getName(), 0);

        if (currFrg != null && currFrg.getClass().getName().equalsIgnoreCase(fragment.getClass().getName())){
            return;
        }

        FragmentTransaction frg_Transaction = manager.beginTransaction();
        if (!frg_popuped){
            if (b != null)
                fragment.setArguments(b);

            frg_Transaction.replace(container, fragment);

            if (backStack)
                frg_Transaction.addToBackStack(fragment.getClass().getName());

            frg_Transaction.commit();
        }
    }
}
