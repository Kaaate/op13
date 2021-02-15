package company;

import models.*;
import processors.VideoBlogProcessor;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    private static VideoBlogProcessor videoBlogProcessor;
    public static void main(String[] args) {
        videoBlogProcessor = new VideoBlogProcessor();
        VideoBlogger sergeyNemchinskiy = new VideoBlogger("Sergey","Sony","some_instagram");
        VideoBlog sergeyNemchinskiyBlog = new VideoBlog(sergeyNemchinskiy, GenerateTestVideos());
        System.out.println("-> Task 1 <-");
        System.out.println("Sum of views at Nemchnskiy Blog is "
                + videoBlogProcessor.GetViewsSumForAllVideos(sergeyNemchinskiyBlog));
        System.out.println("-> Task 2 <-");
        System.out.println("The comment having more likes than video in Sergey Nemchinskiy videoblog "
                + ((videoBlogProcessor.IsExistCommentHavingLikesMoreThanVideo(sergeyNemchinskiyBlog))
                ? "exists"
                : "does not exist"));
        System.out.println("-> Task 3 <-");
        HashSet<Video> videos = videoBlogProcessor.GetVideosHavingMaxDislikesCount(sergeyNemchinskiyBlog);
        System.out.println("There "
                + (videos.size() <= 1 ? "are " : "is ") + videos.size() + " video(s) having max dislikes count in" +
                " Sergey Nemchinskiy videoblog");
        System.out.println("-> -> <- <-");
        for(Video video : videos) {
            System.out.println(video.getName());
        }
        System.out.println("-> Hashmap test <-");
        HashMap<Integer, VideoBlogger> videoBloggers = new HashMap<>();
        videoBloggers.put(0,sergeyNemchinskiy);
        for(var entry : videoBloggers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getName());
        }
    }
    private static  HashSet<Video> GenerateTestVideos()
    {
        HashSet<Video> videos = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            videos.add(new Video(Integer.toString(i), Integer.toString(i),
                    i, new Reactions(i, i), GenerateTestComments()));
        }
        return videos;
    }
    private static HashSet<Comment> GenerateTestComments()
    {
        HashSet<Comment> comments = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            comments.add(new Comment(Integer.toString(i), new Reactions(i, i)));
        }
        return comments;
    }
}