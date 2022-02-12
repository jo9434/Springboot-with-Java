package com.app.firm;

@SuppressWarnings("All")
public class Authors {
    private int authorId;
    private String authorName;
    private String authorPenname;
    private String authorDOB;
    private String authorOccupation;

    public Authors() {
    }

    public Authors(int authorId, String authorName, String authorPenname, String authorDOB, String authorOccupation) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorPenname = authorPenname;
        this.authorDOB = authorDOB;
        this.authorOccupation = authorOccupation;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPenname() {
        return authorPenname;
    }

    public void setAuthorPenname(String authorPenname) {
        this.authorPenname = authorPenname;
    }

    public String getAuthorDOB() {
        return authorDOB;
    }

    public void setAuthorDOB(String authorDOB) {
        this.authorDOB = authorDOB;
    }

    public String getAuthorOccupation() {
        return authorOccupation;
    }

    public void setAuthorOccupation(String authorOccupation) {
        this.authorOccupation = authorOccupation;
    }

    @Override
    public String toString() {
        return "Author Id: AU-" + authorId + "\nAuthor Name: " + authorName + "\nAuthor Pen Name: " + authorPenname + "\n\n----------------------------------------\nShort Portfolio of " + authorPenname + ":\n----------------------------------------\nD.O.B: " + authorDOB + "\nOccupation: " + authorOccupation;
    }
}
