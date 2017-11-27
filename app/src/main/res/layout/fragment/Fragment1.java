package test.bwie.com.duyan1508b20171123.fragment;

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

import test.bwie.com.duyan1508b20171123.R;
import test.bwie.com.duyan1508b20171123.bean.Movie_first;
import test.bwie.com.duyan1508b20171123.presenter.MoviePresenter;
import test.bwie.com.duyan1508b20171123.view.MovieView;

/**
 * Created by dy on 2017/11/23.
 */

public class Fragment1 extends Fragment implements MovieView{

    private Banner banner;
    private List<String> list=new ArrayList<>();
    private RecyclerView rc;
    private MoviePresenter presenter;

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
    public void MovieV(Movie_first movie_first) {

           List<Movie_first.RetBean.ListBean.ChildListBean> childList = movie_first.getRet().getList().get(0).getChildList();

          /* for (int i=0;i<childList.size();i++){
               list.add(movie_first.getRet().getList().get(2).getChildList().get(i).getPic());
           }*/
          /* banner.setImageLoader(new BannerLoger());
           banner.setImages(list);
           banner.start();*/
        //MovieAdapter adapter = new MovieAdapter(getActivity(), childList);
        //rc.setAdapter(adapter);
       }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }
}
