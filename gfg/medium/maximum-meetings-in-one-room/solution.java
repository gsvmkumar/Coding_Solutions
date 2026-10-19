class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        int n = s.length;
        int[][] m = new int[n][3];

        for (int i = 0; i < n; i++) {
            m[i][0] = s[i];   
            m[i][1] = f[i];   
            m[i][2] = i + 1;  
        }
        Arrays.sort(m, (a,b)->{
           if(a[1]!=b[1])
                return Integer.compare(a[1],b[1]);
            return Integer.compare(a[2],b[2]);
        });
        
        ArrayList<Integer> res=new ArrayList<>();
        res.add(m[0][2]);
        int last=m[0][1];
        for(int i=1;i<n;i++){
            if(last<m[i][0]){
                res.add(m[i][2]);
                last=m[i][1];
            }
        }
        
        Collections.sort(res);
        return res;
        
    }
}