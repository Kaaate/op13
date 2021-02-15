package models;

public class VideoBlogger
{
    private String name;
    private String camera;
    private String instagram;
    public VideoBlogger()
    {
        this.name = "No name";
        this.camera = "No camera";
        this.camera = "No instagram";
    }
    public VideoBlogger(String name, String camera, String instagram)
    {
        this.name = name;
        this.camera = camera;
        this.instagram = instagram;
    }
    public String getName()
    {
        return name;
    }
    public String getCamera()
    {
        return camera;
    }
    public String getInstagram()
    {
        return instagram;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCamera(String camera)
    {
        this.camera = camera;
    }
    public void setInstagram(String instagram)
    {
        this.instagram = instagram;
    }
}