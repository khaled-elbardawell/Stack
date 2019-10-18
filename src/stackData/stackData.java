
package stackData;

class stackNode{
    Object info;
    stackNode link;
    public stackNode(Object info , stackNode link){
        this.info=info;
        this.link=link;
    }
    public stackNode(){
        this(null,null);
    }
}

class Stack{
    stackNode topNode;
    int length;
    
    public boolean isEmpty(){
        if(length == 0){
            return true;
        }
            return false;
    }
    
    public boolean isFull(){
        if( this.size() == 5){
            return true;
        }
        return false;
    }
    
        public int size(){
            return length;
    }
         
        public void print(){
           stackNode n = topNode ;
            if( this.isEmpty() ){
                return;
            }else{
                while(n != null){
                    System.out.println(n.info);
                    n=n.link;
                }
            }
        }
        
        public Object peak(){
            if( this.isEmpty() ){
                return "The stack is empty !! ";
            }
            return topNode.info;
        }
        
     public void push(Object info){
         stackNode newNode = new stackNode(info,null);
         stackNode n=topNode;
         if( this.isEmpty() ){
             topNode = newNode;
             ++length;
         }else if( this.isFull() ){
               return;
         }else{
             topNode=newNode;
             topNode.link=n;
             ++length;
         }
     }
     
     public Object pop(){
         if(this.isEmpty()){
             return "The stack is empty !! " ;
         }else{
             Object itemDel;
             itemDel=topNode.info;
             topNode=topNode.link;
             --length;
             return itemDel;
         }
     }
     
    
}

public class stackData {

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println("*********** Stack After push ****************");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);    
        s.push(6);//full >> push nothing to do , becuse the stack size = 5  
        s.print();
         
         System.out.println( "The size >> "+s.size() ); 
         System.out.println( "The top item >> "+s.peak() );
         System.out.println( "Stack is full ? >> "+s.isFull() ); 
          
          
        System.out.println("*********** Stack After Delete ****************");
        s.pop();
        s.print();
        
         System.out.println( "The size >> "+s.size() ); 
         System.out.println( "The top item >> "+s.peak() ); 
         System.out.println( "Stack is full ? >> "+s.isFull() );
    }
    
}
