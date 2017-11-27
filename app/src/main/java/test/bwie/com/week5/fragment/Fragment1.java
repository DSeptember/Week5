package test.bwie.com.week5.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;
import test.bwie.com.week5.R;
import test.bwie.com.week5.activity.ShowEvent;
import test.bwie.com.week5.adapter.MovieAdapter;
import test.bwie.com.week5.app.BannerLoger;
import test.bwie.com.week5.bean.MovieBean;
import test.bwie.com.week5.presenter.MoviePresenter;
import test.bwie.com.week5.view.MovieView;


/**
 * Created by dy on 2017/11/23.
 */

public class Fragment1 extends Fragment implements MovieView {

    private Banner banner;
    private List<String> list=new ArrayList<>();
    private RecyclerView rc;
    private MoviePresenter presenter;
    private String cid;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        banner = view.findViewById(R.id.banner);
        rc = view.findViewById(R.id.fragment1_rc);
        rc.setLayoutManager(new LinearLayoutManager(getActivity()));
        presenter = new MoviePresenter(this);
        presenter.MovieP();
        return view;
    }

    @Override
    public void MovieV(MovieBean movie_first) {
        List<MovieBean.RetBean.ListBean.ChildListBean> childList = movie_first.getRet().getList().get(3).getChildList();

        for (int i=0;i<childList.size();i++){
            list.add(movie_first.getRet().getList().get(3).getChildList().get(i).getPic());
        }
        banner.setImageLoader(new BannerLoger());
        banner.setImages(list);
        banner.start();
        MovieAdapter adapter = new MovieAdapter(getActivity(), childList);
        rc.setAdapter(adapter);
        adapter.setOnItemDelClick(new MovieAdapter.OnItemDelClick() {
            @Override
            public void deleteItem(String position) {
                cid=position;
            }
        });
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().post(new ShowEvent(cid));
    }
}
