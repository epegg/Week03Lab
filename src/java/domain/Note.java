/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author 752814
 */
public class Note implements Serializable{
    //declare fields
    String title;
    String contents;
    
    //default constructor
    public Note() {
    }

    //constructor
    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    //getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    

    @Override
    public String toString() {
        return "Note{" + "strTitle=" + title + ", strContents=" + contents + '}';
    }
    
}
