package kb50.companyxuser;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Details extends Fragment{


	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {
	        // Inflate the layout for this fragment
	        View v = inflater.inflate(R.layout.details, container, false);

	        return v;
	    }
	
/*	public void onClick(View v) {
		switch(v.getId()){
		case R.id.tel:
			Intent i = new Intent(Intent.ACTION_CALL);
			i.setData(Uri.parse("tel: " + number));
			startActivity(i);
			break;
		case R.id.address:
			Intent j = new Intent(Intent.ACTION_VIEW);
			j.setData(Uri.parse("geo:0,0?q=" + streetname + "%20" + streetnumber + "%2C%20" + city));
			startActivity(j);
			break;
		}
	}
*/
}
