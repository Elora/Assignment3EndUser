package kb50.companyxuser;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.button1:
			Intent a = new Intent(this, Company.class);
    		startActivity(a);
    		break;
		case R.id.button2:
			Intent b = new Intent(this, Offices.class);
    		startActivity(b);
    		break;
		case R.id.button3:
			Intent c = new Intent(this, Details.class);
    		startActivity(c);
    		break;

		default:
			break;
		}
	}
	
	
}
