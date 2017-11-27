package test.bwie.com.week5.model;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import test.bwie.com.week5.OnFinishListener;
import test.bwie.com.week5.bean.BaseBean;
import test.bwie.com.week5.bean.Fragment6Bean;
import test.bwie.com.week5.net.Api;
import test.bwie.com.week5.net.ApiServiec;
import test.bwie.com.week5.net.RetrofitUtils;

/**
 * Created by dy on 2017/11/27.
 */

public class Fragment6Model implements FragmentModellnt{

    @Override
    public void FragmentM(final OnFinishListener onFinishListener, String dataId) {
        ApiServiec apiService = RetrofitUtils.getInstance().getApiService(Api.path, ApiServiec.class);
        Observable<Fragment6Bean> observable = apiService.getFragement6Date(dataId);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Fragment6Bean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Fragment6Bean fragment6Bean) {
                        if(onFinishListener!=null){
                            onFinishListener.Success((BaseBean) fragment6Bean);
                        }
                    }
                });
    }
}
