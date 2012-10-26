package com.chumma;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SpecsDOL extends Activity {
	private String contactor;
	private String overloadrelaytype;
	private String overloadrelayrange;
	private String fuse;
	private String switchdisconnectorfuse;
	private String mccbtype;
	private String mccbrange;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.specsdol);

		if (MotorSpecsActivity.rating.equals("0.125")) {
			contactor = "MNX 9";
			overloadrelaytype = "MN 2";
			overloadrelayrange = "0.3-0.5";
			fuse = "2";
			switchdisconnectorfuse = "FN 32/FNX 32";
			mccbtype = "DM 16";
			mccbrange = "0.63";

		} else if (MotorSpecsActivity.rating.equals("0.16")) {
			contactor = "MNX 9";
			overloadrelaytype = "MN 2";
			overloadrelayrange = "0.3-0.5";
			fuse = "2";
			switchdisconnectorfuse = "FN 32/FNX 32";
			mccbtype = "DM 16";
			mccbrange = "0.63";

		} else if (MotorSpecsActivity.rating.equals("0.2")) {
			contactor = "MNX 9";
			overloadrelaytype = "MN 2";
			overloadrelayrange = "0.45-0.75";
			fuse = "2";
			switchdisconnectorfuse = "FN 32/FNX 32";
			mccbtype = "DM 16";
			mccbrange = "1";

		} else if (MotorSpecsActivity.rating.equals("0.25")) {
			contactor = "MNX 9";
			overloadrelaytype = "MN 2";
			overloadrelayrange = "0.6-1.0";
			fuse = "4";
			switchdisconnectorfuse = "FN 32/FNX 32";
			mccbtype = "DM 16";
			mccbrange = "1";

		}

		TextView tv;
		tv = (TextView) findViewById(R.id.text12);
		tv.setText(MotorSpecsActivity.rating);
		tv = (TextView) findViewById(R.id.text22);
		tv.setText(contactor);
		tv = (TextView) findViewById(R.id.text32);
		tv.setText(overloadrelaytype);
		tv = (TextView) findViewById(R.id.text42);
		tv.setText(overloadrelayrange);
		tv = (TextView) findViewById(R.id.text52);
		tv.setText(fuse);
		tv = (TextView) findViewById(R.id.text62);
		tv.setText(switchdisconnectorfuse);
		tv = (TextView) findViewById(R.id.text72);
		tv.setText(mccbtype);
		tv = (TextView) findViewById(R.id.text82);
		tv.setText(mccbrange);

	}

}
