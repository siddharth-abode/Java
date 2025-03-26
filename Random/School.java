import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        StringOp obj = new StringOp();
        obj.accept();
        obj.form();
        obj.display();
    }
}

class StringOp {
    /*
     Given are two strings, input string and a mask string that remove all the characters of the
mask string from the original string.
Example: INPUT: ORIGINALSTRING: communication
MASK STRING: mont
OUTPUT: cuicai
A class StringOp is defined as follows to perform above operation.
Some of the members of the class are given below:
Class name : StringOp
Data members/instance variables:
nstr : to store the original string
msk : to store the mask string
nstr : to store the resultant string
Methods / Member functions:
StringOp() : default constructor to initialize the data
member with legal initial value
void accept( ) : to accept the original string str and the mask string
msk in lower case
void form() : to form the new string nstr after removal of
characters present in mask from the original string
void display( ) : to display the original string and the newly formed
string nstr
Specify the class StringOp giving details of the constructor( ), void accept( ),
void form() and void display( ). Define a main( ) function to create an object and call all
the functions accordingly to enable the task. 
     */
    String str, msk, nstr;
    Scanner sc = new Scanner(System.in);

    StringOp() {
        str = "";
        msk = "";
        nstr = "";
    }

    void accept() {
        System.out.print("ORIGINALSTRING: ");
        str = sc.next();
        System.out.print("MASK STRING:    ");
        msk = sc.next();
    }

    void form() {
        for (int i = 0; i < str.length(); ) {
            char ch = str.charAt(i);
            int x = i;
            for (int j = 0; j < msk.length(); j++) {
                char ch1 = msk.charAt(j);
                if (ch1 == ch) {
                    i++;
                    break;
                }
            }
            if(i == x){
            nstr += ch;
                i++;
            }
        }
    }

    void display() {
        System.out.println("ORIGINAL STRING = " + str);
        System.out.println("NEW STRING = " + nstr);
    }
}
