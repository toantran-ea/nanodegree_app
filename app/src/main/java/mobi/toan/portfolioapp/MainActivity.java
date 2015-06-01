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

    private Button mButtonSportifyStreamer;
    private Button mButtonScoresApp;
    private Button mButtonLibraryApp;
    private Button mButtonBuildItBigger;
    private Button mButtonBaconReader;
    private Button mButtonCapstoneOwnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }

    private void initUI() {
        setContentView(R.layout.activity_main);
        mButtonSportifyStreamer = (Button) findViewById(R.id.button_sportify_streamer_app);
        mButtonScoresApp = (Button) findViewById(R.id.button_scores_app);
        mButtonBaconReader = (Button) findViewById(R.id.button_bacon_reader);
        mButtonBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        mButtonCapstoneOwnApp = (Button) findViewById(R.id.button_capstone_my_own_app);
        mButtonLibraryApp = (Button) findViewById(R.id.button_library_app);

        mButtonSportifyStreamer.setOnClickListener(mOnButtonClickListener);
        mButtonScoresApp.setOnClickListener(mOnButtonClickListener);
        mButtonBaconReader.setOnClickListener(mOnButtonClickListener);
        mButtonBuildItBigger.setOnClickListener(mOnButtonClickListener);
        mButtonCapstoneOwnApp.setOnClickListener(mOnButtonClickListener);
        mButtonLibraryApp.setOnClickListener(mOnButtonClickListener);
    }

    private View.OnClickListener mOnButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_sportify_streamer_app:
                    showMessage("Opening Sportify Stream app");
                    break;
                case R.id.button_scores_app:
                    showMessage("Opening Score app");
                    break;
                case R.id.button_library_app:
                    showMessage("Opening Library app");
                    break;
                case R.id.button_build_it_bigger:
                    showMessage("Why not build it bigger!");
                    break;
                case R.id.button_bacon_reader:
                    showMessage("Opening Bacon Reader app");
                    break;
                case R.id.button_capstone_my_own_app:
                    showMessage("Opening Capstone my own app");
                    break;
                default:
                    break;
            }
        }
    };

    private void showMessage(String message ) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
