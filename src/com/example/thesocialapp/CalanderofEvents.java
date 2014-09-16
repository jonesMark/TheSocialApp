package com.example.thesocialapp;



import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;

public class CalanderofEvents extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calanderof_events);

		String[] events = getResources().getStringArray(R.array.friday_event_list);
		Integer[] icons = {
				R.drawable.my_calendar,
				R.drawable.calendar_of_events,
				R.drawable.featured_events,
				R.drawable.my_calendar
		};
		
		CustomList adapter = new CustomList(this, events, icons);
		ListView list = (ListView)findViewById(R.id.list);
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
		});
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
