package com.gcc.arabmoney.activity.landingpage_1;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommentModel implements Serializable {
    @SerializedName("id")
    private int id;
    @SerializedName("user")
    private String user;
    private int image;
    @SerializedName("comment")
    private String comment;
    @SerializedName("date")
    private String date;
    @SerializedName("like_num")
    private int likeNum;
    @SerializedName("dislike_num")
    private int dislikeNum;
    @SerializedName("child_comments")
    private List<ChildCommentModel> childComments = new ArrayList<>();

    public CommentModel(){
    }
    public CommentModel(String name, int image, String comment, int likeNum){
        this.user = name;
        this.image = image;
        this.comment = comment;
        this.likeNum = likeNum;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public void setDislikeNum(int dislikeNum) {
        this.dislikeNum = dislikeNum;
    }

    public void setChildComments(List<ChildCommentModel> childComments) {
        this.childComments = childComments;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public int getImage() {
        return image;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public int getDislikeNum() {
        return dislikeNum;
    }

    public List<ChildCommentModel> getChildComments() {
        return childComments;
    }
}
