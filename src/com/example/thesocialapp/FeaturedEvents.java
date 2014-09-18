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
import android.widget.ImageView;
import android.widget.PopupWindow;

public class FeaturedEvents extends Fragment  {
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.activity_calanderof_events, container, false);
		//main button
		ImageView imagebutton = (ImageView) view.findViewById(R.id.imagebutton);
		//Button in popup, buttonception
		ImageView popupbutton = (ImageView) view.findViewById(R.id.nextpage);
		imagebutton.setOnClickListener(
				new OnClickListener() {
					public void onClick(View v){
						LayoutInflater layoutInflater = (LayoutInflater)getActivity().getLayoutInflater();
						View view = layoutInflater.inflate(R.layout.event_popup, null);
						final View view1 = layoutInflater.inflate(R.layout.getsocial_popup, null);
						final PopupWindow popupWindow = new PopupWindow(view, 850, 1200);
						final PopupWindow popupWindow1 = new PopupWindow(view1, 850, 1200);
						popupWindow.showAsDropDown(view, 10, 10);
						ImageView dismiss = (ImageView)view.findViewById(R.id.nextpage);
						ImageView dismiss1 = (ImageView)view.findViewById(R.id.dismissSocial);
						dismiss.setOnClickListener(
								new View.OnClickListener() {
									public void onClick(View v) {
										popupWindow.dismiss();
										popupWindow1.showAsDropDown(view1, 10, 10);
									}
								});
						/*dismiss1.setOnClickListener(
new View.OnClickListener() {
public void onClick(View v) {
popupWindow1.dismiss();
}
});*/
					}
				}
				);
		//TextView textview = (TextView) view.findViewById(R.id.tabtextview);
		//textview.setText("hello");
		return view;
	}

		public class FeaturedEvents1 extends ActionBarActivity {
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_featured_events);
		}

		//@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.featured_events, menu);
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
}