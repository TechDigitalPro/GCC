package com.gcc.arabmoney.activity.landingpage_1;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ChildCommentModel implements Serializable {
    @SerializedName("id")
    private int id;
    @SerializedName("comment_id")
    private int commentId;
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

    public ChildCommentModel(){

    }
    public ChildCommentModel(String name, int image, String comment, int likeNum){
        this.user = name;
        this.image = image;
        this.comment = comment;
        this.likeNum = likeNum;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setImage(int image) {
        this.image = image;
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

    public int getId() {
        return id;
    }

    public int getCommentId() {
        return commentId;
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
}
