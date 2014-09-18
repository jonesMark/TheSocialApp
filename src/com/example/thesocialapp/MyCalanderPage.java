/*
 * names: Mark, Chris, Lauren
 * date: 9/19/14
 * 
 * This is the third tab. It is the favorites calendar.
 */

package com.example.thesocialapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class MyCalanderPage extends Fragment implements OnClickListener {
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
			Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.activity_my_calander_page, container, false);
		
		ImageView imagebutton = (ImageView) view.findViewById(R.id.imageviewmyCal);
		//this sets the image view to open a popup to the second half of the event page
		imagebutton.setOnClickListener(
				new OnClickListener() {
					public void onClick(View v){
						LayoutInflater layoutInflater = (LayoutInflater)getActivity().getLayoutInflater();
						View view = layoutInflater.inflate(R.layout.getsocial_popup, null);
						final PopupWindow popupWindow = new PopupWindow(view, 850, 1200);
						popupWindow.showAsDropDown(view, 10, 10);
						ImageView dismiss = (ImageView)view.findViewById(R.id.dismissSocial);
						dismiss.setOnClickListener(
								new View.OnClickListener() {
									public void onClick(View v) {
										popupWindow.dismiss();										
									}
								});
					}
				}
				);

		return view;
	}

	public class MyCalanderPage1 extends ActionBarActivity {
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_my_calander_page);



		}


		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.my_calander_page, menu);
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
}