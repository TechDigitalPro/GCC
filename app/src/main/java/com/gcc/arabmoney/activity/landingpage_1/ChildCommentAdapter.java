package com.gcc.arabmoney.activity.landingpage_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.gcc.arabmoney.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChildCommentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<ChildCommentModel> localDataSet;
    private Listener mListener;
    private String current_date;

    public interface Listener{

    }
    public void setListener(Listener listener){
        mListener = listener;
    }

    public static class Holder extends RecyclerView.ViewHolder {
        LinearLayout data_area;
        CircleImageView userImage;
        TextView usernameView;
        TextView commentView;
        LinearLayout like_area;
        TextView likeNumView;

        public Holder(View view) {
            super(view);
            data_area = view.findViewById(R.id.data_area);
            userImage = view.findViewById(R.id.user_image);
            usernameView = view.findViewById(R.id.username);
            commentView = view.findViewById(R.id.comment);
            like_area = view.findViewById(R.id.like_area);
            likeNumView = view.findViewById(R.id.like_num);
        }
    }

    public ChildCommentAdapter(Context context, List<ChildCommentModel> dataSet) {
        this.context = context;
        localDataSet = dataSet;
        SimpleDateFormat ft = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());
        current_date = ft.format(new Date());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_child_comment_item, viewGroup, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
        ChildCommentModel model = (ChildCommentModel) localDataSet.get(position);
        Holder holder = (Holder) viewHolder;

        holder.usernameView.setText(model.getUser());
        holder.userImage.setImageResource(model.getImage());
        holder.commentView.setText(model.getComment());
        holder.likeNumView.setText(String.valueOf(model.getLikeNum()));

    }
    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}