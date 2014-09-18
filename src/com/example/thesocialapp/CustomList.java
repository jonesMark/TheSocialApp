package com.example.thesocialapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{
	
	private final Activity context;
	private final String[] events;
	private final Integer[] icons;
	public CustomList(Activity context, String[] events, Integer[] icons) {
		super(context, R.layout.single_list_event_layout, events);
		this.context = context;
		this.events=events;
		this.icons = icons;
	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.single_list_event_layout, null, true);
		TextView txtTitle = (TextView) rowView.findViewById(R.id.textView1);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
		txtTitle.setText(events[position]);
		imageView.setImageResource(icons[position]);
		return rowView;
	}

}
