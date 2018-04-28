/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Earl John Liva
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            OrderedLinkedList list = new OrderedLinkedList();
            list.insert("payload", 5);
            list.insert("payload", 5);
            list.insert("payload", 15);
            list.insert("payload", 25);
            System.out.println(list.toString());
            
            
        }catch(Exception e){
            System.out.println();
        }
    }
    
}
