package com.chumma;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SpecsSTARDELTA extends Activity {
	private String contactorstar;
	private String contactorline;
	private String contactordelta;
	private String overloadrelaytype;
	private String overloadrelayrange;
	private String fuse;
	private String switchdisconnectorfuse;

	/*
	 * contactor overloadrelaytype overloadrelayrange fuse
	 * switchdisconnectorfuse mccbtype mccbrange
	 * 
	 * contactorstar contactorline contactordelta overloadrelaytype
	 * overloadrelayrange fuse switchdisconnectorfuse
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.specsstardelta);

		if (MotorSpecsActivity.rating.equals("1")) {
			contactorstar = "MNX 9";
			contactorline = "MNX 9";
			contactordelta = "MNX 9";
			overloadrelaytype = "MN 2";
			overloadrelayrange = "0.9-1.5";
			fuse = "4";
			switchdisconnectorfuse = "--";

		} else if (MotorSpecsActivity.rating.equals("1.5")) {
			contactorstar = "MNX 9";
			contactorline = "MNX 9";
			contactordelta = "MNX 9";
			overloadrelaytype = "MN 2";
			overloadrelayrange = "1.4-2.3";
			fuse = "6";
			switchdisconnectorfuse = "FN 32/FNX 32";

		} else if (MotorSpecsActivity.rating.equals("20")) {
			contactorstar = "MNX 12";
			contactorline = "MNX 25";
			contactordelta = "MNX 25";
			overloadrelaytype = "MN 2";
			overloadrelayrange = "14-23";
			fuse = "40";
			switchdisconnectorfuse = "FN 63/FNX 63";

		} else if (MotorSpecsActivity.rating.equals("35")) {
			contactorstar = "MNX 25";
			contactorline = "MNX 32";
			contactordelta = "MNX 32";
			overloadrelaytype = "MN 2";
			overloadrelayrange = "20-33";
			fuse = "63";
			switchdisconnectorfuse = "FN 100/FNX 100";

		}

		TextView tv;
		tv = (TextView) findViewById(R.id.text12_);
		tv.setText(MotorSpecsActivity.rating);
		tv = (TextView) findViewById(R.id.text22_);
		tv.setText(contactorstar);
		tv = (TextView) findViewById(R.id.text32_);
		tv.setText(contactorline);
		tv = (TextView) findViewById(R.id.text42_);
		tv.setText(contactordelta);
		tv = (TextView) findViewById(R.id.text52_);
		tv.setText(overloadrelaytype);
		tv = (TextView) findViewById(R.id.text62_);
		tv.setText(overloadrelayrange);
		tv = (TextView) findViewById(R.id.text72_);
		tv.setText(fuse);
		tv = (TextView) findViewById(R.id.text82_);
		tv.setText(switchdisconnectorfuse);

	}

}
