package com.app.firm;

import java.util.*;

@SuppressWarnings("All")
public class Book {

    private int bookId;
    private String bookName;
    private List<Authors> authorsList;
    private String isbnNo;
    private String bookGenre;
    private String pubDate;
    private int totPages;

    public Book() {
    }

    public Book(int bookId, String bookName, List<Authors> authorsList, String isbnNo, String bookGenre, String pubDate, int totPages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorsList = authorsList;
        this.isbnNo = isbnNo;
        this.bookGenre = bookGenre;
        this.pubDate = pubDate;
        this.totPages = totPages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Authors> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(List<Authors> authorsList) {
        this.authorsList = authorsList;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public int getTotPages() {
        return totPages;
    }

    public void setTotPages(int totPages) {
        this.totPages = totPages;
    }

    public void displayBookDetails()
    {
        System.out.println("Displaying Book Details...\n-------------------------\nBook ID: BPF-"+bookId+"\nBook Name: "+bookName+"\nISBN No: "+isbnNo+"\nGenre: "+bookGenre+"\nPublication Date: "+pubDate+"\nPages: "+totPages+" Pages");

        for(Authors authDet: authorsList)
        {
            System.out.println(authDet);
        }
    }
}
