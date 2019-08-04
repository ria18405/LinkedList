/*
1.)addition of a Node at the end
2.)deletion at start
3.)deletion of 2nd last no.
4.)insertion of Node at the beginning
5.)finding maximum and reducing all elements of ll by1 except max
6.)remove duplicates
9.)deleteion of a specific value of node from ll


*/
import java.io.*;
import java.util.*;
import java.lang.*;

class add_del_LL{
	public static void main(String args[]){

	LinkedList L= new LinkedList();
	
	Scanner input = new Scanner(System.in);
	int n = input.nextInt(); 


	for(int i=0;i<n;i++){
    	int numbers=input.nextInt();
    	if (numbers==1||numbers==4||numbers==9||numbers==7){
    		int toadd=input.nextInt();
    		Function(numbers,toadd,L);
    	}
    	else
			Function(numbers,0,L);
		}
	
	}

	public static void Function(int numbers, int toadd,LinkedList L){
		

		if(numbers==1)
			{
			// addition of a Node at the end
			Node ptr=L.head;
			Node y = new Node(toadd);
			while(ptr.next!=null){
				ptr=ptr.next;
			}
			ptr.next=y;
			display(L);
			}
		else if (numbers==2)
			{
				//deletion from start
				L.head=L.head.next;	
				display(L);	
		
			}

		else if (numbers==3){
			//deletion of 2nd last no.
			Node ptr=L.head;
			Node rear=ptr.next.next;
			while(rear.next!=null){
				rear=rear.next;
				ptr=ptr.next;
			}

			ptr.next=rear;
			//rear.next=null;
			display(L);
			
		}
		else if (numbers==4){
			//insertion of Node at the beginning
			Node ptr=L.head;
			Node y = new Node(toadd);
			y.next=ptr.next;
			ptr.next=y;
			display(L);
			}
		else if (numbers==5){
			//finding maximum and reducing all elements of ll by1 except max
			Node ptr=L.head;
			int max=maximum(L);
			while(ptr!=null){
				if (ptr.data!=max)
					ptr.data=ptr.data-1;
				ptr=ptr.next;
			}
			display(L);
		}
		else if (numbers==6){
			//remove duplicates
			Node ptr=L.head;
			while(ptr!=null && ptr.next!=null){
				Node rear=ptr.next;
				while(rear.next!=null){
					if (ptr.data==rear.next.data){
						//deletion(L,rear.data);
						rear.next=rear.next.next;	
					}
					else
					rear=rear.next;
				}
				ptr=ptr.next;
			}
			display(L);
		}
		else if (numbers==7){
			//reverse alternate k nodes//incomplete
			int k=toadd;
			Node ptr=L.head.next;
			//while(ptr!=null){
			
			//}

		}
		else if (numbers==8){
			//reverse ll//wrong
			Node ptr=L.head.next;
			Node rear=ptr.next;
			while(rear!=null){
			rear=ptr;
			ptr=ptr.next;
			rear=rear.next;
			}
			L.head.next=null;
			display(L);
			

		}
				

		else if (numbers==9){
			int todel=toadd;
			deletion(L,todel);

		}

	else if(numbers==10){
		//REVERSE A LINKED LIST AND STORE IT IN ANOTHER LL
		LinkedList L2=new LinkedList();
		Node ptr=L.head.next;
		Node ptr2=L2.head;
		while(ptr!=null){
			Node y=new Node(ptr.data);
		
			y.next=ptr2.next;
			ptr2.next=y;

			ptr=ptr.next;
		}
		display(L);
		display(L2);

	}

	}

	public static void display(LinkedList L){
		Node ptr=L.head.next;
		while(ptr!=null){
		System.out.print(ptr.data +" ");
		ptr=ptr.next;

		}
		System.out.println();
	}
	public static int maximum(LinkedList L){
		Node ptr=L.head;
		int max=ptr.data;
		while(ptr!=null){
			if (ptr.data>max){
				max=ptr.data;
			}
			ptr=ptr.next;
		}
		return max;
	}
	public static void deletion(LinkedList L,int todel){
		Node prev=L.head;
		Node ptr=prev.next;
		while(ptr.data!=todel){
			ptr=ptr.next;
			prev=prev.next;
		}
		prev.next=ptr.next;
		ptr.next=null;
		display(L);
	}
}



class Node{
	public int data;
	public Node next;
	public Node(int x)
	{

		data=x;
		next=null;
	}
}


class LinkedList
{	Node head;
	public LinkedList(){
	head=new Node(1);
	}
	
}
