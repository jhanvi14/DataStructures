import java.util.*;
public class RemoveDuplicates
{
    static Node head;
    public class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data =d;
        }
    }
    public RemoveDuplicates insert(RemoveDuplicates li,int data)
    {
       Node newNode=new Node(data);
       newNode.next=null;
       if (head==null)
       {
           head=newNode;
       }
       else
       {
           Node last=head;
           while(last.next!=null)
           {
               last=last.next;
           }
           last.next=newNode;
       }
       return li;
    }
    public RemoveDuplicates deleteDuplicates(RemoveDuplicates head)
    {
        Set<Integer> set =new HashSet<>();
        RemoveDuplicate pre=null;
        RemoveDuplicates fakeHead=head;
        while(fakeHead!=null){
            if(!set.add(fakeHead.val)){
                pre.next=fakeHead.next;
            }
            else
            {
                pre=fakeHead;
            }
            fakeHead=fakeHead.next;
        }
        return head;
    }
    public static void main(String[]args){
        RemoveDuplicates=new RemoveDuplicates;
        li.insert(li,10);
        li.insert(li,20);
        li.insert(li,30);
        li.insert(li,40);
        li.RemoveDuplicates(head);
    }
}