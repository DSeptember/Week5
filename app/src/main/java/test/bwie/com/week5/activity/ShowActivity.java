package test.bwie.com.week5.activity;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;
import de.greenrobot.event.Subscribe;
import test.bwie.com.week5.R;
import test.bwie.com.week5.bean.ShowBean;
import test.bwie.com.week5.fragment.Fragment5;
import test.bwie.com.week5.fragment.Fragment6;
import test.bwie.com.week5.presenter.ShowPresenter;
import test.bwie.com.week5.view.ShowView;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.widget.media.AndroidMediaController;
import tv.danmaku.ijk.media.widget.media.IjkVideoView;

public class ShowActivity extends AppCompatActivity implements ShowView{

    private String id;
    private IjkVideoView videoView;
    private PagerSlidingTabStrip pst;
    private ViewPager vp;
    private List<String> adlist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Log.i("TAG","AAA");
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        pst = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        vp = (ViewPager) findViewById(R.id.vp);
        adlist.add("简介");
        adlist.add("评论");
        vp.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        pst.setViewPager(vp);
        EventBus.getDefault().register(this);

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
    @Subscribe
    public void getDate(ShowEvent show){
        id = show.getDataId();
        SharedPreferences sharedPreferences = getSharedPreferences("Show", MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("dataid",id);
        edit.commit();
        ShowPresenter showPresenter = new ShowPresenter(this);
        showPresenter.ShowP(id);
    }

    @Override
    public void ShowV(ShowBean showBean) {
        IjkMediaPlayer.loadLibrariesOnce(null);
        IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        videoView = (IjkVideoView) findViewById(R.id.ijkPlayer);
        AndroidMediaController controller = new AndroidMediaController(this, false);
        videoView.setMediaController(controller);
        String url = showBean.getRet().getHDURL();
       // String url = "http://movie.vods1.cnlive.com/3/vod/2017/0619/3_620539e5053a479487b47b25b6d00e3e/ff8080815bf6b453015cc1023dd9295d_1500.m3u8";
        videoView.setVideoURI(Uri.parse(url));
    }
    //适配器
    class MyPagerAdapter extends FragmentPagerAdapter {


        public MyPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String name = adlist.get(position);
            return name;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment=null;
            switch (position){
                case 0:
                    fragment = new Fragment5();
                    break;

                case 1:
                    fragment = new Fragment6();
                    break;

            }
            return fragment;
        }

        @Override
        public int getCount() {
            return adlist.size();
        }
    }
}
