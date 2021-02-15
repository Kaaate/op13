package models;

import java.util.Objects;

public class Comment
{
    private String text;
    private Reactions reactions;
    public Comment(String text, Reactions reactions) {
        this.text = text;
        this.reactions = reactions;
    }
    public String getText()
    {
        return text;
    }
    public Reactions getReactions() {
        return reactions;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;
        Comment comment = (Comment) o;
        return getText().equals(comment.getText()) && getReactions().equals(comment.getReactions());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getText(), getReactions());
    }
}
