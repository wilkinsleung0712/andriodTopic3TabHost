package mad.topic3.layout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import com.example.topic3_test.R;

public class LayoutTestActivity extends Activity{
	private String LOG_CAT = this.getClass().getName();
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//change this to test other layout in res/layout (e.g. linear etc.)
		//this.setContentView(R.layout.);
		this.setContentView(R.layout.echo);
		Log.i(LOG_CAT, "onCreate()");
		View okbutton = this.findViewById(R.id.okButton);
		View cancelbutton = this.findViewById(R.id.cancelButton);
		final EditText echoEntry = (EditText) this.findViewById(R.id.entry);
		final TextView echoLabel = (TextView) this.findViewById(R.id.echoLabel);
		okbutton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				echoLabel.setText(echoEntry.getText());
			}
			
		});
		
		cancelbutton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				echoLabel.setText("");
				echoEntry.setText("");
				echoEntry.setFocusable(true);
			}
			
		});
		
	}
}
