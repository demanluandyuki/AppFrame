package com.joyfulmath.appframe.business.recycleview.presenter;

/**
 * Created by deman on 2016/3/30.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.joyfulmath.appframe.R;
import com.joyfulmath.publicutils.ImageUtils.ImageLoadManger;


/**
 * @author deman.lu
 * @version on 2016-03-10 14:19
 */
public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder> {

    private Context context;
    private IRecyclePresenter recyclePresenter;
    public RecycleAdapter(Context context,IRecyclePresenter recyclePresenter)
    {
        this.context = context;
        this.recyclePresenter = recyclePresenter;
    }


    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecycleViewHolder holder = new RecycleViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_list,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
        holder.tv1.setText(recyclePresenter.getTitle(position));
        ImageLoadManger.getsInstance().load(recyclePresenter.getPath(position),holder.im);
    }


    @Override
    public int getItemCount() {
        return recyclePresenter.length();
    }

    class RecycleViewHolder extends RecyclerView.ViewHolder
    {
        TextView    tv1;
        ImageView im;
        public RecycleViewHolder(View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById(R.id.tv_title);
            im = (ImageView) itemView.findViewById(R.id.im_content);
        }
    }
}
