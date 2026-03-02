class book{
    String tittle;
    String author;
    book(String tittle,String author){
        this.tittle=tittle;
        this.author=author;
    }
    void display(){
    }
}
class ebook extends book{
    int filesize;
    ebook(String tittle,String author,int filesize){
        super(tittle,author);
        this.filesize=filesize;
    }
    void display(){
        System.out.println("tittle is "+tittle+" \nauthor is "+author+" \nfilesize is "+filesize);
    }
}
class printedbook extends book{
    int pagecount;
    printedbook(String tittle,String author,int pagecount){
        super(tittle,author);
        this.pagecount=pagecount;
    }
    void display() {
        System.out.println("tittle is "+tittle + " \nauthor is " + author + " \npagecount is " + pagecount);
    }
}
public class librarybooks {
    public static void main(String[] args){
        book b1=new ebook("book1","nani",10);
        b1.display();
        System.out.println("---------------");
        book b2=new printedbook("book2","rahul",100);
        b2.display();
    }
}
