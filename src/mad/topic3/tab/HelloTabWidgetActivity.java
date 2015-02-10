package mad.topic3.tab;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

import com.example.topic3_test.R;

@SuppressWarnings("deprecation")
public class HelloTabWidgetActivity extends TabActivity {
	private String LOG_CAT = this.getClass().getName();
	
	public void onCreate(Bundle savedInstanceState){
		Log.i(LOG_CAT, "onCreate() in HelloTabWidgetActivity");
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.tab);
		Resources res = this.getResources();//Resource object to get Drawables
		TabHost tabHost = this.getTabHost();//The activity TabHost
		TabHost.TabSpec spec; // Reusable TabSpec for each tab
		Intent intent;//Reusable Intent for each tab
		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, ArtistsActivity.class);
		 // Initialize a TabSpec for each tab and add it to the TabHost
		spec = tabHost
				.newTabSpec("artists")
				.setIndicator("Artists", res.getDrawable(R.drawable.ic_launcher))
				.setContent(intent);
		tabHost.addTab(spec);
		//Do the same thing for other tabs
		intent = new Intent().setClass(this, AlbumsActivity.class);
		spec = tabHost
				.newTabSpec("albums")
				.setIndicator("Albums", res.getDrawable(R.drawable.ic_tab_albums))
				.setContent(intent);
		tabHost.addTab(spec);
		//Do the same thing for other tabs
		intent = new Intent().setClass(this, SongActivity.class);
		spec = tabHost
				.newTabSpec("songs")
				.setIndicator("Songs", res.getDrawable(R.drawable.ic_tab_songs))
				.setContent(intent);
		tabHost.addTab(spec);
		
		tabHost.setCurrentTab(1);		
		
				
	}
}
