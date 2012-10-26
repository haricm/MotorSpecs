package com.chumma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SelectRatingDOL extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selectrating);

		Spinner spinner = (Spinner) findViewById(R.id.spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.rating_dol, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(new MyOnItemSelectedListener());

		Button buttongo = (Button) findViewById(R.id.buttongo);
		buttongo.setOnClickListener(goButtonListener);
	}

	private View.OnClickListener goButtonListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(SelectRatingDOL.this, SpecsDOL.class);
			startActivity(intent);
		}

	};

	public class MyOnItemSelectedListener implements OnItemSelectedListener {

		public void onItemSelected(AdapterView<?> parent, View view, int pos,
				long id) {
			MotorSpecsActivity.rating = parent.getItemAtPosition(pos)
					.toString();
		}

		public void onNothingSelected(AdapterView<?> parent) {
		}
	}

}
