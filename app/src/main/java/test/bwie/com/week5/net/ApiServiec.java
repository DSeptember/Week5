package test.bwie.com.week5.net;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;
import test.bwie.com.week5.bean.Fragment6Bean;
import test.bwie.com.week5.bean.MovieBean;
import test.bwie.com.week5.bean.ShowBean;

/**
 * Created by dy on 2017/11/23.
 */

public interface ApiServiec {
    @POST("homePageApi/homePage.do")
    Observable<MovieBean>getShouDate();
    @POST("videoDetailApi/videoDetail.do")
    @FormUrlEncoded
    Observable<ShowBean> getShowDate(@Field("mediaId") String mediaId);
    @POST("Commentary/getCommentList.do")
    @FormUrlEncoded
    Observable<Fragment6Bean> getFragement6Date(@Field("mediaId") String mediaId);

}
