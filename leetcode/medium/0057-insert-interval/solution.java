class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> a=new ArrayList<>();
        int n=intervals.length;
        for(int i=0;i<n;i++)
            a.add(intervals[i]);
        a.add(newInterval);
        Collections.sort(a, (x,y)->Integer.compare(x[0],y[0]));
        
        List<int[]> merged=new ArrayList<>();
        
        for(int i=0;i<a.size();i++){
            int []curr=a.get(i);
            n=merged.size();
            if(merged.isEmpty() || merged.get(n-1)[1]<curr[0] )
                merged.add(curr);
            else
                merged.get(n-1)[1]=Math.max(merged.get(n-1)[1],curr[1]);
        }

        return merged.toArray(new int[merged.size()][]);
    }
}