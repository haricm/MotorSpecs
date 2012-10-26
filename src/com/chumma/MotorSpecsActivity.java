package com.chumma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MotorSpecsActivity extends Activity {
	/** Called when the activity is first created. */
	static String rating;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		rating = null;

		Button buttondol = (Button) findViewById(R.id.buttondol);
		buttondol.setOnClickListener(dolButtonListener);
		Button buttonstardelta = (Button) findViewById(R.id.buttonstardelta);
		buttonstardelta.setOnClickListener(starDeltaButtonListener);
	}

	private View.OnClickListener dolButtonListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(MotorSpecsActivity.this,
					SelectRatingDOL.class);
			startActivity(intent);
		}

	};
	private View.OnClickListener starDeltaButtonListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(MotorSpecsActivity.this,
					SelectRatingSTAR_DELTA.class);
			startActivity(intent);
		}

	};

}