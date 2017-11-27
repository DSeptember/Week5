package test.bwie.com.week5.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import test.bwie.com.week5.R;
import test.bwie.com.week5.activity.ShowActivity;
import test.bwie.com.week5.bean.MovieBean;

/**
 * Created by dy on 2017/11/23.
 */

public class MovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<MovieBean.RetBean.ListBean.ChildListBean> list;
    private OnItemDelClick onItemDelClick;
    public interface OnItemDelClick{
        public void deleteItem(String position);
    }
    public void setOnItemDelClick(OnItemDelClick onItemDelClick){
        this.onItemDelClick=onItemDelClick;
    }
    public MovieAdapter(Context context, List<MovieBean.RetBean.ListBean.ChildListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MyViewHolder myholder= (MyViewHolder) holder;
        myholder.simp.setImageURI(Uri.parse(list.get(position).getPic()));
        myholder.tv.setText(list.get(position).getTitle());
        myholder.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ShowActivity.class);
                context.startActivity(intent);
                onItemDelClick.deleteItem(list.get(position).getDataId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {

        private final SimpleDraweeView simp;
        private final TextView tv;
        private final LinearLayout ll;

        public MyViewHolder(View itemView) {
            super(itemView);
            simp = itemView.findViewById(R.id.movie_item_sim);
            tv = itemView.findViewById(R.id.movie_item_tv);
            ll = itemView.findViewById(R.id.ll);
        }
    }
}
