/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

/**
 *
 * @author amir_
 */
public class Book {
    public String name;
    public String auther;
    public int pubDate;
    public int pageNumber;
    public int current_page;
    public boolean is_open;
    public Book(String a, String b,int c,int d){
        this.name=a;
        this.auther= b;
        this.pageNumber=c;
        this.pubDate=d;
        this.is_open=false;
    }
    void open_book(){
        if (is_open){
            
            System.out.println("is open");
        }
        else {
            is_open = true;
        }
        
        
    }
    void close_book(){
        if (!is_open){
            
            System.out.println("is close");
        }
        else {
            is_open = false;
        }
        
        
    }
    public boolean MoveToPage(int p){
        if (!is_open) return false;
        if (p<1 || p> pageNumber){
            return false;
        } else {
            this.current_page=p;
            return true;
          
        }
        
        
    }
    public void printBookInfo(){
        System.out.println("Book Name : "+this.name);
        System.out.println("Book Auther : "+this.auther);
        System.out.println("Book Count : "+this.pageNumber);
    }
    
}
