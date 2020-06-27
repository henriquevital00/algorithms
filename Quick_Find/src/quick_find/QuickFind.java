/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick_find;

/**
 *
 * @author henrique
 */
public class QuickFind {
    private int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i=0; i < N; i++){
            id[i] = i;
        }
    }
    
    public boolean connected(int p, int q){
        return id[p] == id[q];
    }
    
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid){
                id[i] = qid;
            }
        }
    }

    public void getId() {
        for (int i=0; i<id.length; i++)
            System.out.println(id[i] + " ");
    }
    
    public void menu(){
        System.out.println("Choose an option:");
        System.out.println("1- Union");
        System.out.println("2- Check if is connected");
        System.out.println("3- Show the array");
        System.out.println("4- Exit");
    }
}
