package processors;

import models.Comment;
import models.Video;
import models.VideoBlog;
import java.util.HashSet;
import java.util.Iterator;
public class VideoBlogProcessor {
    public int GetViewsSumForAllVideos(VideoBlog videoBlog) {
        int sum=0;
        for (Iterator<Video> it = videoBlog.getVideos().iterator(); it.hasNext();) {
            sum += it.next().getViewsCount();
        }
        return sum;
    }
    public boolean IsExistCommentHavingLikesMoreThanVideo(VideoBlog videoBlog) {
        for (Video video : videoBlog.getVideos()) {
            int videoLikesAmount = video.getReactions().getLikes();
            for (Comment comment : video.getComments()) {
                if(comment.getReactions().getLikes() > videoLikesAmount) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int GetMaxDislikesAmount(VideoBlog videoBlog) {
        int maxDislikesAmount = 0;
        for (Video video : videoBlog.getVideos()) {
            if(video.getReactions().getDislikes() > maxDislikesAmount)
                maxDislikesAmount = video.getReactions().getDislikes();
        }
        return maxDislikesAmount;
    }
    public HashSet<Video> GetVideosHavingMaxDislikesCount(VideoBlog videoBlog) {
        HashSet<Video> videos = new HashSet<>();
        int maxDislikesAmount = GetMaxDislikesAmount(videoBlog);
        for (Iterator it = videoBlog.getVideos().iterator(); it.hasNext();) {
            Video currentVideo = (Video) it.next();
            if(currentVideo.getReactions().getDislikes() == maxDislikesAmount) {
                videos.add(currentVideo);
            }
        }
        return videos;
    }
}