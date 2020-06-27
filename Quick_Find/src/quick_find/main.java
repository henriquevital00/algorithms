/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick_find;

import java.util.Scanner;

/**
 *
 * @author henrique
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Choose the number of elements: ");
        int size = Integer.parseInt(input.nextLine());
        QuickFind qf = new QuickFind(10);
        
        qf.menu();
        int op = Integer.parseInt(input.nextLine());
        while (op != 4){
            if (op == 1){
                System.out.println("Type the two index");
                int p = Integer.parseInt(input.nextLine());
                int q = Integer.parseInt(input.nextLine());
                qf.union(p, q);
            }
            else if(op == 2){
                int p = Integer.parseInt(input.nextLine());
                int q = Integer.parseInt(input.nextLine());
                qf.connected(p, q);
            }
            else{
                qf.getId();
            }
        }
    }
    
}
