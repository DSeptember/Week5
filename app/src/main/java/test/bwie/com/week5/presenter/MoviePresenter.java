package test.bwie.com.week5.presenter;


import test.bwie.com.week5.OnFinishListener;
import test.bwie.com.week5.bean.BaseBean;
import test.bwie.com.week5.bean.MovieBean;
import test.bwie.com.week5.model.MovieModel;
import test.bwie.com.week5.view.MovieView;

/**
 * Created by dy on 2017/11/23.
 */

public class MoviePresenter implements MoviePresenterInt,OnFinishListener {

    private MovieView movieView;
    private final MovieModel movieModel;

    public MoviePresenter(MovieView movieView){
        this.movieView=movieView;
        movieModel = new MovieModel();
    }
    @Override
    public void MovieP() {
        movieModel.MovieM(this);
    }

    @Override
    public void Success(BaseBean baseBean) {
        movieView.MovieV((MovieBean) baseBean);
    }
    public void destroy(){
        if(movieView!=null){
            movieView=null;
        }
    }
}
