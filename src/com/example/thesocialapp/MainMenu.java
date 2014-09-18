/*
 * names: Mark, Chris, Lauren
 * date: 9/19/14
 * 
 * This is the home page which contains the tabs. It is the control center of our app. It's a good page.
 */

package com.example.thesocialapp;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainMenu extends ActionBarActivity {

		ActionBar.Tab tab1, tab2, tab3;
		Fragment fragmentTab1 = new FeaturedEvents();
		Fragment fragmentTab2 = new CalanderofEvents();
		Fragment fragmentTab3 = new MyCalanderPage();
		@Override
		protected void onCreate (Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main_menu);

			ActionBar actionBar = getActionBar();
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

			tab1 = actionBar.newTab().setIcon(R.drawable.homeedited);
			tab2 = actionBar.newTab().setIcon(R.drawable.calendaredited);
			tab3 = actionBar.newTab().setIcon(R.drawable.favoritesedited);

			tab1.setTabListener(new MyTabListener(fragmentTab1));
			tab2.setTabListener(new MyTabListener(fragmentTab2));
			tab3.setTabListener(new MyTabListener(fragmentTab3));

			actionBar.addTab(tab1);
			actionBar.addTab(tab2);
			actionBar.addTab(tab3);
		}
		/*@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main_menu);
		}
		 */
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main_menu, menu);
			return true;
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// Handle action bar item clicks here. The action bar will
			// automatically handle clicks on the Home/Up button, so long
			// as you specify a parent activity in AndroidManifest.xml.
			int id = item.getItemId();
			if (id == R.id.action_settings) {
				return true;
			}
			return super.onOptionsItemSelected(item);
		}
	}

