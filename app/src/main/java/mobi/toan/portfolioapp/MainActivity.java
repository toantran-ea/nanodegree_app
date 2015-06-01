package mobi.toan.portfolioapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    private Toast mCurrentToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View button) {
        switch (button.getId()) {
            case R.id.button_sportify_streamer_app:
                showMessage(getString(R.string.sportify_message));
                break;
            case R.id.button_scores_app:
                showMessage(getString(R.string.score_app_message));
                break;
            case R.id.button_library_app:
                showMessage(getString(R.string.library_app_message));
                break;
            case R.id.button_build_it_bigger:
                showMessage(getString(R.string.build_it_bigger_message));
                break;
            case R.id.button_bacon_reader:
                showMessage(getString(R.string.bacon_reader_message));
                break;
            case R.id.button_capstone_my_own_app:
                showMessage(getString(R.string.capstone_app_message));
                break;
            default:
                break;
        }
    }

    private void showMessage(String message) {
        if (mCurrentToast != null) {
            mCurrentToast.cancel();
        }
        mCurrentToast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        mCurrentToast.show();
    }
}
