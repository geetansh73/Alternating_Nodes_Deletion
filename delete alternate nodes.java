import java.util.*;
public class linkedlist
{
    Node head=null;
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
    data=d;
    }
    }
    void add(int data)
    {
    Node o=new Node(data);
    o.next=null;
    if (head==null)
    {
    head=o;
    return;
    }
    Node last=head;
    while(last.next!=null)
    {
    last=last.next;
    }
    last.next=o;
    }
    void deletealter()
    {
        Node h=null;
        Node l=null;
   if (head!=null&& head.next!=null)
   {
h=head;
 l=head.next;
   }
   else
   {
      System.out.println("list should not be empty");
   }
   while(h!=null && l!=null)
   {
      if (l.next==null)
      {
    h.next=null;
    break;
      }
      else
      {
    h.next=l.next;
      h=l.next;
      if (h.next==null)
      {
    l=null;
    break;
      }
      else
      {
        l=h.next;
      }
   }
   }
    }
    void print()
    {
    Node c=head;
    while(c!=null)
    {
    System.out.print(c.data+" ");
    c=c.next;
    }
    }
    
    
public static void main(String g[])
{
    Scanner sc=new Scanner(System.in);
    linkedlist obj=new linkedlist();
    System.out.println("enter no. of elements ");
   int n=sc.nextInt();
   int a;
   for(int i=0;i<n;i++)
   {
a=sc.nextInt();
      obj.add(a);
   }
       obj.deletealter();
       obj.print();
}
}