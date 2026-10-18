class Solution {
    public boolean lemonadeChange(int[] bills) {
        int []ch=new int[3];
        for(int x:bills){
            if(x==5){
                ch[0]++;
            }
            else if(x==10){
                if(ch[0]==0)
                    return false;
                ch[0]--;
                ch[1]++;
            }
            else{
                ch[2]++;
                if(ch[0]>0 && ch[1]>0){
                    ch[0]--;
                    ch[1]--;
                }
                else if(ch[0]>=3)
                    ch[0]-=3;
                else
                    return false;
            }
        }
        return true;
    }
}