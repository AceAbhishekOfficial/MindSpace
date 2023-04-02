package com.abhishek.mindspace.ui;

public class YogaPose
{
    int ID;
    public String Name;
    public String Desc;
    public String Video;
    public String Benifits;
    public String link;

    public YogaPose(int ID,String Name, String Desc, String Video, String Benifits)
    {
        this.ID=ID;
        this.Benifits = Benifits;
        this.Desc = Desc;
        this.Name = Name;
        this.Video = Video;
    }

}
