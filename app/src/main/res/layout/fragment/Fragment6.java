package test.bwie.com.duyan1508b20171123.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.bwie.com.duyan1508b20171123.R;
import test.bwie.com.duyan1508b20171123.bean.Fragment6Bean;
import test.bwie.com.duyan1508b20171123.presenter.Fragemnt6Presenter;
import test.bwie.com.duyan1508b20171123.view.Fragment6View;

/**
 * Created by dy on 2017/11/23.
 */

public class Fragment6 extends Fragment implements Fragment6View{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment6, container, false);
        Fragemnt6Presenter presenter = new Fragemnt6Presenter(this);
        presenter.Fragemnt6("840ddae38ed346a197a76b46b448067e");
        return view;
    }

    @Override
    public void Fragemnt6V(Fragment6Bean fragment6Bean) {
        Log.i("TAG",fragment6Bean.getCode());
    }
}
