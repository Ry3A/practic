package lab1;

public class Book {
    private String author;
    private int year;

    public Book(String n, int a){
        author = n;
        year = a;
    }
    public Book(String n){
        author = n;
        year = 1867;
    }
    public Book(){
        author = "Njkckz";
        year = 1985;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(String author){
        return author;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return this.author + ", year " + this.year;
    }
}
