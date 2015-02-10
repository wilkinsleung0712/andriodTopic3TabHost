package mad.topic3.tab.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.util.Log;

import com.example.topic3_test.R;

public class FragmentTabWidgetActivity extends FragmentActivity{
	private String LOG_CAT = this.getClass().getName();
	
	public void onCreate(Bundle savedInstanceState){
		Log.i(LOG_CAT, "onCreate() in FragmentTabWidgetActivity");
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.fragment_tab);
		
		Resources res=this.getResources();
		FragmentTabHost tabHost = (FragmentTabHost) this.findViewById(android.R.id.tabhost);
		//need to check what it does
		tabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
		tabHost.addTab(
				tabHost.newTabSpec("artists")
				.setIndicator("Artists", res.getDrawable(R.drawable.ic_tab_artists)),
				ArtistsFragment.class, null);
		  tabHost.addTab(
		            tabHost.newTabSpec("albums").setIndicator("Albums",
		                  res.getDrawable(R.drawable.ic_tab_albums)),
		            AlbumsFragment.class, null);

		      tabHost.addTab(
		            tabHost.newTabSpec("songs").setIndicator("Songs",
		                  res.getDrawable(R.drawable.ic_tab_songs)),
		            SongsFragment.class, null);

		      tabHost.setCurrentTab(1);
	}
}
