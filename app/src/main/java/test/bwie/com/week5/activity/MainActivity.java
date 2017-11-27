package test.bwie.com.week5.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.hjm.bottomtabbar.BottomTabBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.bwie.com.week5.R;
import test.bwie.com.week5.fragment.Fragment1;
import test.bwie.com.week5.fragment.Fragment2;
import test.bwie.com.week5.fragment.Fragment3;
import test.bwie.com.week5.fragment.Fragment4;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_button)
    BottomTabBar mMainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        mMainButton.init(getSupportFragmentManager())
                .setImgSize(50,50)
                .setFontSize(8)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.RED,Color.BLACK)
                .addTabItem("精选",R.mipmap.found_select,R.mipmap.found, Fragment1.class)
                .addTabItem("专题",R.mipmap.special_select,R.mipmap.special, Fragment2.class)
                .addTabItem("发现",R.mipmap.fancy_select,R.mipmap.fancy, Fragment3.class)
                .addTabItem("我的",R.mipmap.my_select,R.mipmap.my,Fragment4.class)
                .isShowDivider(false);
    }
}
