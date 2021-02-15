package models;

import java.util.HashSet;
import java.util.Objects;
public class Video {
    private String name;
    private String url;
    private int viewsCount;
    private Reactions reactions;
    private HashSet<Comment> comments;
    public Video(String name, String url, int viewsCount, Reactions reactions, HashSet<Comment> comments) {
        this.name = name;
        this.viewsCount = viewsCount;
        this.reactions = reactions;
        this.comments = comments;
    }
    public String getName()
    {
        return name;
    }
    public String getUrl()
    {
        return url;
    }
    public int getViewsCount()
    {
        return viewsCount;
    }
    public Reactions getReactions() {
        return reactions;
    }
    public HashSet<Comment> getComments()
    {
        return comments;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }
    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }
    public void addComment(Comment comment) {
        if (comment == null)
        {
            throw new NullPointerException("Video can`t be null.");
        }
        this.comments.add(comment);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;
        Video video = (Video) o;
        return getViewsCount() == video.getViewsCount() && getName().equals(video.getName()) && getUrl().equals(video.getUrl()) && getReactions().equals(video.getReactions()) && getComments().equals(video.getComments());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getUrl(), getViewsCount(), getReactions(), getComments());
    }
}
