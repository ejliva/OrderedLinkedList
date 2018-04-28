/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author: Earl John Liva
 * Instructor: Voelkers
 * TA: Sai P.
 */
class OrderedLinkedList{
  
    private class Node{    
    //Note: The member variabes are public so the methods
    //of the OrderedLinkedList class have direct access to them
    //NO setters and getters are needed - more effecient access.
        
    public String payload;  //The element stored in this node.
    public int keyValue;    //The element stored in this node.
    public Node next;       //Refers to the next node.
        
        //Explicit value constructor for the Node class
    public Node(String payload, int keyValue){   
        this.payload = payload;     //initial data.
        this.keyValue = keyValue;   //inital data.
        }   //end of constructor.
    }   //end of class Node.
        
    private Node first; //refers to the first node. 
    //This is the only member variable allowed.
    //You can Not add any other member variables!!!
        
    public OrderedLinkedList()
        {
            first = null;
        }   // end of default constructor
    
        
        //returns true if list is empty.
        public boolean empty()
        { 
           return first == null;  
        }   //end of the empty method.  
        
        
        //The first node is removed from the list and its payload is returned.
        //An exception with a meaningful error messae is thrown if the list is empty.
        
        public String getFirst() throws Exception{
            if(first == null) //check if the list is empty
            {
                return null; //return value
            }
            else
            {
                Node head = first; //refers to the first node
                while(head != null) //travers to the list
                {
                    head = head.next.next; 
                } //end of while
                return first.payload;
            } //end of else 
        }//end of method.
        
        //The last node is removed from the list and its payload is returned.
        //An exception with a meaningful error message is thrown if the list is empty.
        public String getLast() throws Exception{
            if(first == null) //check if the list is empty.
            {
                return null;
            }
            else
            {
                Node head = first;
                while(head.next.next != null)
                {
                    head = head.next;
                }
                return first.payload;
        
            } 
        } //end of method
        
        // The insert method creates a new node, puts the input parameter value
        // into the new node, and then inserts the node into the list in sorted order
        //based on the keyValue. For example, if a list has 3 node with key values
        // of 5, 10, and 15, insertion of a new node which has a keyvalue of 12 would
        // require that the new node was inserted after the node with key value of 10.
        // If the key being inserted is already in the list, throw an exception with a
        // meaningful error string. Make sure that you test all possible cases for insertion.
        
        public void insert(String payload, int key) throws Exception{
            Node head = new Node(payload, key); //first node created that inputs the parameter values.
            head.next = first;
            first = head;
        }
        
        
        public void remove(int key) throws Exception{
            if(first.keyValue != key) // check if key value is in the list.
            {
                System.out.println("key value is not in the list"); //error
            }
            else
            {
                Node pred = null; //pred
                Node head = first; //head
                while(head != null && head.keyValue == key)
                {
                    pred = head;
                    head = head.next;
                }
                
            }
            
        } //end of remove method.
        
        // Traverse the list, Keeping track of where the precedessor for each node
        // is located. When the value is found in some node in the list, make the
        // predecessor node bypass the node which holds the value. If the key value
        // is not found, throw an Exception that indicates the error has occured.
        
        public int listCount(){
            int count = 0; //set count to 0.
            while(first.next != null) //Traverse the list
            {
                count++; //count the nodes
                first = first.next;
            }
            return count;
           // Returns the number of nodes in the list. 
        }  //end of listcount().
        
        public String getValue(int key)throws Exception{
            if(first.keyValue != key)
            {
                return null;
            }
            else
            {
                // finding the predecessor
                Node pred = null; 
                Node head = first;
                while(head != null && head.keyValue == key) //Traverse through the loop and find the key.
                {
                    pred = head;
                    head = head.next;
                }
                return first.payload;
            }
    
        } //end of getValue().
            
        // Traverse the list until you locate the requested key value. Return the
        // payload from the node which has the requested key value. If the key value
        // is not found, throw an Exception that indicates the error has occured.
        
        @Override
        public String toString()
        {
            
            String list = "Node list:\n"; // output.
            Node head = first; //refers to the node.
            while(head != null) //loop through the list.
            {
                list += head.payload + "," +head.keyValue + "\n";
                head = head.next;//output the values. 
            } //end of loop
            return list; //return the list
        } //end of toString()
            
        // Override the toString method and create a string that contrains the information
        // from all the nodes currently on the list. The string should be constructed such
        // that the data from each node will appear on a seperate line. If the list is empty
        // the returned string should indicate that the list was empty.
                
}
