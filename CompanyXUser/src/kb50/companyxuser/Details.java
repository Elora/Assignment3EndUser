package kb50.companyxuser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Details extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details);
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
