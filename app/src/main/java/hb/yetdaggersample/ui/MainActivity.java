package hb.yetdaggersample.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import javax.inject.Inject;

import hb.yetdaggersample.R;
import hb.yetdaggersample.UsefulHelper;
import hb.yetdaggersample.UserBiz;
import hb.yetdaggersample.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Inject
    UsefulHelper _usefulHelper;

    @Inject
    UserBiz _userBiz;

    public MainActivity() {

    }

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    mTextMessage.setText(_usefulHelper.SayHelloTo("Home"));
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(_userBiz.getUserNameById(123456));
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
