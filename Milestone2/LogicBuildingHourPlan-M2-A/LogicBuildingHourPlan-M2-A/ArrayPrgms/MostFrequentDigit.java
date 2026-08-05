public class MostFrequentDigit{

public static int mostFrequentDigit(int[] input1,int input2){

int[] freq=new int[10];

for(int i=0;i<input2;i++){
int n=Math.abs(input1[i]);
if(n==0)
freq[0]++;
while(n>0){
freq[n%10]++;
n=n/10;
}
}

int max=0;
int ans=0;

for(int i=0;i<=9;i++){
if(freq[i]>=max){
max=freq[i];
ans=i;
}
}

return ans;
}

public static void main(String[] args){

int[] arr={1237,262,666,140};

System.out.println(mostFrequentDigit(arr,arr.length));

}
}