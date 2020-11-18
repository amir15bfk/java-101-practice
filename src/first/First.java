
package first;

public class First {

    
    
    public static void main(String[] args) {
       
        Book calculus= new Book("calculus","maekil spivic",612,1958);
        calculus.printBookInfo();
        calculus.open_book();
        if(calculus.MoveToPage(50)){
            
        }
        calculus.close_book();
        
    
    }
    
}
