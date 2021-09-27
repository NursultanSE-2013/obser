package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here-
        IGAccount account = new IGAccount();
        Followers f1 = new Followers(1, account);
        Followers f2 = new Followers(2, account);

        Post newPost = new Post("Kz", "About Kz", "/Kazakhstan.com");
        Video newVideo = new Video("Kazakhstan",720, 45);
        account.publishPost(newPost);
        account.publishVideo(newVideo);
        account.remove(f2);
    }
}
