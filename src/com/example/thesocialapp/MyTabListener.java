/*
 * names: Mark, Chris, Lauren
 * date: 9/19/14
 * 
 * This is the control center for our tabs. It picks up tab events adds currently clicked tabs to the
 * tab container.
 */

package com.example.thesocialapp;

import android.app.ActionBar.Tab;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;

public class MyTabListener implements ActionBar.TabListener {
	Fragment fragment;
	
	public MyTabListener(Fragment fragmentTab1) {
		this.fragment = fragmentTab1;
	}
	
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
		ft.replace(R.id.fragment_container, fragment);
	}
	
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		ft.remove(fragment);
	}
	
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// nothing done here
	}
}
