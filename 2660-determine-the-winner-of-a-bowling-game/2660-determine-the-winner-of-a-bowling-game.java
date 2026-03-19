class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int count1=0;
        int count2=0;
        for(int i=0;i<player1.length;i++){
            if((i>=1 && player1[i-1] ==10) ||( i>=2 && player1[i-2]==10)){
                count1 =count1+(player1[i] * 2);
            }
            else{
                count1=count1+player1[i];

            }
            if((i>=1 && player2[i-1] ==10) || (i>=2 && player2[i-2]==10)){
                count2 =count2+(player2[i] * 2);
            }
            else{
                count2=count2+player2[i];

            }
        }
        if(count1>count2) return 1;
        if(count1<count2) return 2;
        return 0;
    }
}