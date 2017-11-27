package test.bwie.com.week5.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.bwie.com.week5.R;


/**
 * Created by dy on 2017/11/23.
 */

public class Fragment5 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        SharedPreferences preferences = getActivity().getSharedPreferences("Show", Context.MODE_PRIVATE);
        String dataid = preferences.getString("dataid", null);

        return view;
    }
}
