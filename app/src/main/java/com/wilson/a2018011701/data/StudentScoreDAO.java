package com.wilson.a2018011701.data;

import java.util.ArrayList;

/**
 * Created by Student on 2018/1/17.
 */

public class StudentScoreDAO {
    public ArrayList<Student> mylist;
    public StudentScoreDAO()
    {
        mylist = new ArrayList<>();
    }
    public boolean add(Student s)
    {
        mylist.add(s);
        return true;
    }
    public ArrayList<Student> getList()
    {
        return mylist;
    }
    public Student getStudent(int id)
    {
        for (Student s : mylist)
        {
            if (s.id == id)
            {
                return s;
            }
        }
        return null;
    }
    public boolean update(Student s)
    {
        for (Student t : mylist)
        {
            if (t.id == s.id)
            {
                t.name=s.name;
                t.score=s.score;

                return true;
            }
        }
        return false;
    }
    public boolean delete(int id)
    {
        for (Student t : mylist)
        {
            if (t.id == id)
            {
                mylist.remove(t);
                return true;
            }
        }
        return false;
    }
}
