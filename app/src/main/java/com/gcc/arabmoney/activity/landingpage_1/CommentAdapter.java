package com.gcc.arabmoney.activity.landingpage_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gcc.arabmoney.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;

public class CommentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<CommentModel> localDataSet;
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
        LinearLayout replyBtn;
        RecyclerView childCommentList;

        public Holder(View view) {
            super(view);
            data_area = view.findViewById(R.id.data_area);
            userImage = view.findViewById(R.id.user_image);
            usernameView = view.findViewById(R.id.username);
            commentView = view.findViewById(R.id.comment);
            like_area = view.findViewById(R.id.like_area);
            likeNumView = view.findViewById(R.id.like_num);
            replyBtn = view.findViewById(R.id.reply_btn);
            childCommentList = view.findViewById(R.id.child_comment_list);
        }
    }

    public CommentAdapter(Context context, List<CommentModel> dataSet) {
        this.context = context;
        localDataSet = dataSet;
        SimpleDateFormat ft = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());
        current_date = ft.format(new Date());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_comment, viewGroup, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
        CommentModel model = (CommentModel) localDataSet.get(position);
        Holder holder = (Holder) viewHolder;

        holder.usernameView.setText(model.getUser());
        holder.userImage.setImageResource(model.getImage());
        holder.commentView.setText(model.getComment());
        holder.likeNumView.setText(String.valueOf(model.getLikeNum()));

        loadChildComments(holder, model.getChildComments());
    }
    @Override
    public int getItemCount() {
        return localDataSet.size();
    }

    private void loadChildComments(Holder holder, List<ChildCommentModel> child_comments){
        holder.childCommentList.setLayoutManager(new LinearLayoutManager(context));
        holder.childCommentList.setNestedScrollingEnabled(false);
        ChildCommentAdapter comment_adapter = new ChildCommentAdapter(context, child_comments);
        holder.childCommentList.setAdapter(comment_adapter);
    }
}