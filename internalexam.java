import java.util.*;
class Node
{
int data;
Node next;
Node(int data)
{
this.data=data;
next=null;
}
}
class Singlell
{
Node head;
void insert(int key)
{
if(head==null)
{
Node newnode=new Node(key);
head=newnode;
System.out.println("The node " +key+" is inserted at begining of the list");
return;
}
if(head!=null)
{
Node newnode=new Node(key);
newnode.next=head;
head=newnode;
System.out.println("The node " +key+" is inserted at begining of the list");
}
}
void pop()
{
Node temp=head;
if(head == null)
{
System.out.println("List is empty");
return;
}
if(head.next==null)
{
head=null;
return;
}
while(temp.next.next!=null)
{
temp=temp.next;
}
temp.next=null;
}
void display()
{
Node temp=head;
if(head == null)
{
System.out.println("List is empty");
return;
}
System.out.print("head");
while(temp !=null)
{
System.out.print("--> "+temp.data);
temp=temp.next;
}
System.out.println();
}
}
class single
{
public static void main(String [] args)
{
int data;
int k;
Scanner sc=new Scanner(System.in);
Singlell s=new Singlell();
boolean con=true;
while(con)
{
System.out.println("Enter 1 2 3 4 to perform operations on linked list !\n1: Insertion at front\n2: Deletion at end\n3:Display list\n4: exit");
k=sc.nextInt();
if(k==4)
{
break;
}
switch(k)
{
case 1:
System.out.println("Enter data to insert");
data=sc.nextInt();

s.insert(data);
break;
case 2:
s.pop();
break;
case 3:
s.display();
break;
default:
System.out.println("Invalid operation !");
break;
}
}
}
}
