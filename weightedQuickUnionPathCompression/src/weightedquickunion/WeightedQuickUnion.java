/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightedquickunion;

/**
 *
 * @author henrique
 */
public class WeightedQuickUnion {
    private int[] parent;
    private int[] size;

    public WeightedQuickUnion(int N) {
        parent = new int[N];
        size = new int[N];
        for (int i=0; i < N; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    
    public int root(int i){
        while(i != parent[i]){
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        return i;
    }
    
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }
    
    public void union(int p, int q){
        int rootP = root(p);
        int rootQ = root(q);
        
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
    }
}
