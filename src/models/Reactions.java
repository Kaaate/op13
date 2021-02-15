package models;

public class Reactions {

    private int likes;
    private int dislikes;
    public Reactions() {
        this.likes = 0;
        this.dislikes = 0;
    }
    public Reactions(int likes, int dislikes) {
        this.likes = likes;
        this.dislikes = dislikes;
    }
    public int getLikes() {
        return likes;
    }
    public int getDislikes() {
        return dislikes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
}
