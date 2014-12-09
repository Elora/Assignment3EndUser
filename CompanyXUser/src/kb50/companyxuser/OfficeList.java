package kb50.companyxuser;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class OfficeList extends ListActivity {

	List<Office> officeList;
	Integer[] offices; 
	
	public void stringToArr() {

		officeList = getAllOffices();
		offices = new Integer[officeList.size()];
		for (int i = 0; i < officeList.size(); i++) {

			offices[i] = getAllOffices().get(i).getTelNum();

		}

	}

	public List<Office> getAllOffices() {
		List<Office> offices = new ArrayList<Office>();

		Cursor cursor = getContentResolver()
				.query(Uri
						.parse("content://com.example.appcontentprovider.CompanyProvider/office"),
						null, null, null, null);

		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			Office office = new Office();

			office.setId(cursor.getInt(0));
			office.setTelNum(cursor.getInt(1));

			offices.add(office);
			cursor.moveToNext();
		}

		cursor.close();
		return offices;

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); // ---no need to call this---
		Office o = new Office();
		o.setTelNum(9874);
		
		
		ContentValues officeValues = new ContentValues();
		officeValues.put("telNum", o.getTelNum());
		
		getContentResolver().insert(Uri.parse("content://com.example.appcontentprovider.CompanyProvider/office"), officeValues);
		stringToArr();// //setContentView(R.layout.main);
		setListAdapter(new ArrayAdapter<Integer>(this,
				android.R.layout.simple_list_item_1, offices));
	}

	@Override
	public void onListItemClick(ListView parent, View v, int position, long id) {
		Toast.makeText(this, "You have selected " + offices[position],
				Toast.LENGTH_SHORT).show();
	}

}
