package test.bwie.com.week5.presenter;

import test.bwie.com.week5.OnFinishListener;
import test.bwie.com.week5.bean.BaseBean;
import test.bwie.com.week5.bean.ShowBean;
import test.bwie.com.week5.model.ShowModel;
import test.bwie.com.week5.view.ShowView;

/**
 * Created by dy on 2017/11/24.
 */

public class ShowPresenter implements ShowPresenterInt,OnFinishListener{

    private ShowView showView;
    private final ShowModel showModel;

    public ShowPresenter(ShowView showView){
        this.showView=showView;
        showModel = new ShowModel();
    }
    @Override
    public void ShowP(String dataid) {
        showModel.ShowM(this,dataid);
    }

    @Override
    public void Success(BaseBean baseBean) {
        showView.ShowV((ShowBean)baseBean);
    }
}
