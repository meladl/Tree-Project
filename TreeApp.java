//Mohamed Eladl
//ID:1203261
//CSCI 260
import java.util.*;
import java.io.*;

public class TreeApp {

    public static void main(String[] args) throws IOException {

        int value;
        Tree theTree = new Tree();

        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);

        while(true){
            System.out.print("Enter UpperCase Letter of the following Operations: ");
            System.out.print("Show, Insert, Find, Delete, Traverse, siZe, dePth, maX, miN, removelLeaVes, Rightminvalue, Leftminvalue, or Quit : ");
            int choice = getChar();
            switch(choice){
                case 's':
                theTree.displayTree();
                break;
                case 'i':
                System.out.print("Enter value to insert: ");
                value = getInt();
                theTree.insert(value, value + 0.9);
                break;
                case 'f':
                System.out.print("Enter value to find: ");
                value = getInt();
                Node found = theTree.find(value);
                if(found != null)
                {
                    System.out.print("Found: ");
                    found.displayNode();
                    System.out.print("\n");
                }
                else
                    System.out.print("Could not find ");
                System.out.print(value + '\n');
                break;
                case 'd':
                System.out.print("Enter value to delete: ");
                value = getInt();
                boolean didDelete = theTree.delete(value);
                if(didDelete)
                    System.out.print("Deleted " + value + '\n');
                else
                    System.out.print("Could not delete ");
                System.out.print(value + '\n');
                break;
                case 't':
                System.out.print("Enter type 1, 2 or 3: ");
                value = getInt();
                theTree.traverse(value);
                break;
                case 'n':
                Node findMin = theTree.minimum();
                if(findMin != null){
                    findMin.displayNode();
                }
                break;	             	              
                case 'x':
                Node findMax = theTree.maximum();
                if(findMax != null){
                    findMax.displayNode();
                }	              
                case 'v':
                theTree.removeLeaves();
                theTree.displayTree();                
                break;                             
                case 'r':
                Node findrm = theTree.rightMinValue();
                if(findrm != null){
                    findrm.displayNode();
                }
                break;
                case 'l':
                Node findlm = theTree.leftMaxValue();
                if(findlm != null){
                    findlm.displayNode();
                }
                break;                	              
                case 'z':
                int S = theTree.size();
                System.out.println(S);
                break;
                case 'p':
                System.out.print("Enter value find depth: ");
                value = getInt();
                int D = theTree.depth(value);
                if(D == -1)
                    System.out.print("Invalid entry");
                else
                    System.out.println("Depth: " + D);
                break;             
                case 'q':
                System.exit(0);
                default:
                System.out.print("Invalid entry\n");
            }  
        }  
    }  

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException{
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }

}
