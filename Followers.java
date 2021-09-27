package com.company;

public class Followers implements IObserver{
    private Integer followers_id;
    private IGAccount account;

    public Followers(Integer follower_id, IGAccount account) {
        this.followers_id = follower_id;
        this.account = account;
        account.add(this);
    }


    @Override
    public void update(Integer postType) {
        if(postType == 1) {
            Post newPost = account.getTodayPosts();
            System.out.println("This follower with id : " + followers_id + " accepted a new Post: " + newPost);
        } else if(postType == 2) {
            Video newVideo = account.getTodayVideos();
            System.out.println("This follower with id : " + followers_id + " accepted a new Video: " + newVideo);
        }
    }
}