/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightedquickunion;

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
        int N = input.nextInt();
        WeightedQuickUnion wqf = new WeightedQuickUnion(N);
        while (input.hasNextInt()) {
            int p = input.nextInt();
            int q = input.nextInt();
            if (wqf.root(p) == wqf.root(q)){
                continue;
            }
            
            wqf.union(p, q);
            System.out.println(p + " " + q);
        }
    }
    
}
