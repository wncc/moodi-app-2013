package com.wncc.android;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import com.customlistview.R;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends Activity {

	ListView lv;
	List<ListViewItem> items;
	CustomListViewAdapter adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv = (ListView) findViewById(R.id.listView);
		items = new ArrayList<MainActivity.ListViewItem>();
		items.add(new ListViewItem() {
			{

				Title = "map";

			}
		});
		items.add(new ListViewItem() {
			{

				Title = "events";

			}
		});
		items.add(new ListViewItem() {
			{

				Title = "Schedule";

			}
		});
		items.add(new ListViewItem() {
			{

				Title = "contact us";

			}
		});
		items.add(new ListViewItem() {
			{

				Title = "registration";

			}
		});
		items.add(new ListViewItem() {
			{

				Title = "settings";

			}
		});
		items.add(new ListViewItem() {
			{

				Title = "results";

			}
		});
		adapter = new CustomListViewAdapter(this, items);
		lv.setAdapter(adapter);
		
		SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setFadeDegree(0.35f);
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        menu.setMenu(R.layout.menu);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	class ListViewItem {

		public String Title;

	}

}
