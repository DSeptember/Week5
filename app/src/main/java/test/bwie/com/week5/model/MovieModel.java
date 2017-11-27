package test.bwie.com.week5.model;

import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import test.bwie.com.week5.OnFinishListener;
import test.bwie.com.week5.bean.BaseBean;
import test.bwie.com.week5.bean.MovieBean;
import test.bwie.com.week5.net.Api;
import test.bwie.com.week5.net.ApiServiec;
import test.bwie.com.week5.net.RetrofitUtils;

/**
 * Created by dy on 2017/11/23.
 */

public class MovieModel implements MovieModellnt{

    @Override
    public void MovieM(final OnFinishListener onFinishListener) {
        ApiServiec apiService = RetrofitUtils.getInstance().getApiService(Api.path, ApiServiec.class);
        Observable<MovieBean> observable = apiService.getShouDate();
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MovieBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("TAG",e.toString());
                    }

                    @Override
                    public void onNext(MovieBean movie_first) {
                        if(onFinishListener!=null){
                            onFinishListener.Success((BaseBean) movie_first);
                        }
                    }
                });
    }
}
