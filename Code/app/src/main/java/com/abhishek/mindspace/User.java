package com.abhishek.mindspace;

public class User
{
    public String Name; //32 b
    public String Phone; //20 b
    public String Email; //32 b

    public int addiction;
    public int stress;
    public int health;

    public int lazy;
    public int lonely;
    public int insomnia;

    public int anxiety;
    public int depression;
    public int dopamine;


    public User(String Name)
    {
        this.Name = Name;
    }
    public void print()
    {

    }
    public float getMarks()
    {
        int point =0;
        point+=addiction;
        point+=stress;
        point+=health;

        point+=lazy;
        point+=lonely;
        point+=insomnia;

        point+=anxiety;
        point+=depression;
        point+=dopamine;

        float res =(point/36.0f)*100;
        System.out.println(res);
        return res;
    }

}
