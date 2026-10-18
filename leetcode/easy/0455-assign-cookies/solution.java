class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0,c=0;
        for(int i=0;i<g.length;i++){
            while(j<s.length && g[i] > s[j] ){
                j++;
            }
            if(j==s.length) 
                return c;
            j++;
            c++;
        }
        return c;
    }
}