package com.example.thesocialapp;



import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;

public class CalanderofEvents extends Fragment implements OnClickListener {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
			Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.activity_calanderof_events, container, false);
		ImageButton imagebutton = (ImageButton) view.findViewById(R.id.imagebutton);
        imagebutton.setOnClickListener(
        		new OnClickListener() {
        		public void onClick(View v){
        			LayoutInflater layoutInflater = (LayoutInflater)getActivity().getLayoutInflater();
        			View view = layoutInflater.inflate(R.layout.event_popup, null);
        			final PopupWindow popupWindow = new PopupWindow(view, 750, 1200);
        			popupWindow.showAsDropDown(view, 10, 10);

        			Button dismiss = (Button)view.findViewById(R.id.button1);
        			dismiss.setOnClickListener(
        					new View.OnClickListener() {
        						public void onClick(View v) {
        							popupWindow.dismiss();
        						}
        		});
        		}
        		}
        		);
		//TextView textview = (TextView) view.findViewById(R.id.tabtextview);
		//textview.setText("hello");
       
		return view;
	}
	public class CalanderofEvents1 extends Activity {

		
		public void onCreate(Bundle savedInstanceState1) {
			super.onCreate(savedInstanceState1);
			setContentView(R.layout.activity_calanderof_events);

			String[] events = getResources().getStringArray(R.array.friday_event_list);
			Integer[] icons = {
					R.drawable.my_calendar,
					R.drawable.calendar_of_events,
					R.drawable.featured_events,
					R.drawable.my_calendar
			};

			CustomList adapter = new CustomList(this, events, icons);
			/*ListView list = (ListView)findViewById(R.id.list);
			list.setAdapter(adapter);

			list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
					LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					view = layoutInflater.inflate(R.layout.event_popup, null);
					final PopupWindow popupWindow = new PopupWindow(view, 750, 1200);
					popupWindow.showAsDropDown(view, 10, 10);

					Button dismiss = (Button)view.findViewById(R.id.button1);
					dismiss.setOnClickListener(
							new View.OnClickListener() {
								public void onClick(View v) {
									popupWindow.dismiss();
								}


							});
				}
			});*/
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.calanderof_events, menu);
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
/* This is laurens XML for this page.  Use if there is time to fix.
 * <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:orientation="vertical" >

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content" >
        

    </LinearLayout>

    <Button
        android:id="@+id/button4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/interests"
         />

    <ListView
        android:id="@+id/list"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" >
    </ListView>

</LinearLayout>
*/
