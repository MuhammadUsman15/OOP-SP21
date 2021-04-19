/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publication;

public class Publication {
    int price;   
    String title;
    public Publication(int price, String title) {
        this.price = price;  
        this.title = title;   
    }

    public int getPrice() {
        return price;    
    }

    public void setPrice(int price) {
        this.price = price; 
    }

    public String getTitle() {
        return title;  
    }

    public void setTitle(String title) {
        this.title = title;  
    }
}

class Book extends Publication{
    int pageNo; 
    public Book(int price, String title,int pageNo) {
        super(price, title);   
        this.pageNo=pageNo;  
    }

    public void display() {
        System.out.println("Book detail \nTile ="+title+" \n price = "+price+" \n page no "+pageNo);  
    }
    public int getPageNo() {
        return pageNo; 
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;   
    }
}
class Audio extends Publication {
    int time;
    public Audio(int price, String title,int time) {
        super(price, title);     
        this.time=time;   
    }

    public Audio(int price, String title) {
        super(price, title);  
    }

    public int getTime() {
        return time; 
    }

    public void setTime(int time) {
        this.time = time; 
    }

    public void display() {
        System.out.println("Audio \nTile ="+title+" \n price = "+price+" \n time "+time);  
    }
}