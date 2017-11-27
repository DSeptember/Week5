package test.bwie.com.week5.model;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import test.bwie.com.week5.OnFinishListener;
import test.bwie.com.week5.bean.BaseBean;
import test.bwie.com.week5.bean.ShowBean;
import test.bwie.com.week5.net.Api;
import test.bwie.com.week5.net.ApiServiec;
import test.bwie.com.week5.net.RetrofitUtils;

/**
 * Created by dy on 2017/11/24.
 */

public class ShowModel implements ShowModellnt{

    @Override
    public void ShowM(final OnFinishListener onFinishListener, String dataId) {
        ApiServiec apiService = RetrofitUtils.getInstance().getApiService(Api.path, ApiServiec.class);
        Observable<ShowBean> observable = apiService.getShowDate(dataId);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShowBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ShowBean showBean) {
                        if(onFinishListener!=null){
                            onFinishListener.Success((BaseBean) showBean);
                        }
                    }
                });
    }
}
