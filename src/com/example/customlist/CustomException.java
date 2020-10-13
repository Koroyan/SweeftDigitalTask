package com.example.customlist;

public class CustomException extends Throwable{
    public CustomException(int index,int size){
        super("array size is "+size+ ": index is "+index+": please get correct index!");
    }
}
