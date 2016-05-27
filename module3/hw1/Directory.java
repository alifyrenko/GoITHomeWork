package com.goit.gojavaonline.module3.hw1;
import java.util.List;

/**
 * Created by ANTON on 25.05.2016.
 */
public class Directory {
    //comments
    private String folderName;
    private int folderSize;
    private List <File> textFileList;

    private void folderDelete(){}
    private void folderMove(){}
    private void folderModify(){}

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getFolderSize() {
        return folderSize;
    }

    public void setFolderSize(int folderSize) {
        this.folderSize = folderSize;
    }

    public List<File> getTextFileList() {
        return textFileList;
    }

    public void setTextFileList(List<File> textFileList) {
        this.textFileList = textFileList;
    }
}
