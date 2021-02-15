package models;

import java.util.HashSet;

public class VideoBlog {
    private HashSet<Video> videos;
    private VideoBlogger videoBlogger;
    public VideoBlog(VideoBlogger videoBlogger, HashSet<Video> videos) {
        this.videoBlogger = videoBlogger;
        this.videos = videos;
    }
    public HashSet<Video> getVideos() {
        return videos;
    }
    public VideoBlogger getVideoBlogger() {
        return videoBlogger;
    }
    public void setVideoBlogger(VideoBlogger videoBlogger) {
        this.videoBlogger = videoBlogger;
    }
    public void add(Video video) throws Exception {
        if (video == null)
        {
            throw new NullPointerException("Video can`t be null.");
        }
        this.videos.add(video);
    }
}