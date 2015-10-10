package br.com.claudio.training.trainingaplication.utilities.components;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.widget.Toast;

/**
 * Created by cjunior on 09/10/15.
 */
public class MyTabListener implements ActionBar.TabListener {
    private Context context;
    private int index;
    public MyTabListener(Context context, int tabId) {
        this.context = context;
        this.index = tabId;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
        Toast.makeText(context,"Selecionou a tab: "+ index, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }
}
