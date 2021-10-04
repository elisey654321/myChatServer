package com.myProject.myProject;

import java.util.Date;

public class Messege {
    public Date date;
    public String source,text,name;

    Messege(Date data,String source,String text,String name){
        this.date   = date;
        this.source = source;
        this.text   = text;
        this.name   = name;
    }

    public Date getTime() {
        return date;
    }

    public String getSource() {
        return source;
    }

    public String getText() {
        return text;
    }
}
