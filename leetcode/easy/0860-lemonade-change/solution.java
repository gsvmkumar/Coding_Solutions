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
                if( ch[0]<3 ){
                    if(ch[0]<1 || ch[1]<1)
                        return false;
                }
                ch[2]++;
                if(ch[0]>=1 && ch[1]>=1){
                    ch[0]--;
                    ch[1]--;
                }else{
                    ch[0]-=3;
                }
            }
        }
        return true;
    }
}