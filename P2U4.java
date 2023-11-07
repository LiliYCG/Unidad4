
package p2u4;


public class P2U4 {

    
    public static void main(String[] args) {
        char [][] L = new char [3][5];
        char ch = 'a';
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <5; j++) {
               L [i][j] = ch++;
                System.out.print(L [i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
