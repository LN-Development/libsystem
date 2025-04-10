/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lmp.libsystem;

/**
 *
 * @author LuanM
 */
public class books {
    
    private Long bookId;
    
    private String bookName;
    
    private String bookSeries;
    
    private String bookAuthor;
    
    private int bookType;
    
    private int bookGenre;
    
    private int bookQuantity;
    
    private boolean bookReserverd;
    
    private boolean bookMissing;
    
    private boolean isBookSerie;

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookSeries(String bookSeries) {
        this.bookSeries = bookSeries;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookType(int bookType) {
        this.bookType = bookType;
    }

    public void setBookGenre(int bookGenre) {
        this.bookGenre = bookGenre;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public void setBookReserverd(boolean bookReserverd) {
        this.bookReserverd = bookReserverd;
    }

    public void setBookMissing(boolean bookMissing) {
        this.bookMissing = bookMissing;
    }

    public void setIsBookSerie(boolean isBookSerie) {
        this.isBookSerie = isBookSerie;
    }

    public Long getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookSeries() {
        return bookSeries;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookType() {
        return bookType;
    }

    public int getBookGenre() {
        return bookGenre;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public boolean isBookReserverd() {
        return bookReserverd;
    }

    public boolean isBookMissing() {
        return bookMissing;
    }

    public boolean isIsBookSerie() {
        return isBookSerie;
    }
    
    
}
