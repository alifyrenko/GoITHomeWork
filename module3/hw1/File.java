package com.goit.gojavaonline.module3.hw1;

import java.util.Date;

/**
 * Created by ANTON on 25.05.2016.
 */
 public class File {

    private String fileName;
    private int fileSize;
    private Date dateLastModified;
    private Date dateCreated;

    private void delete(){}
    private void move(){}
    private void modify(){}

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public Date getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(Date dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
