public class DecreasingSequence{

static class Result{
int output1;
int output2;

Result(int o1,int o2){
output1=o1;
output2=o2;
}
}

public static Result decreasingSeq(int[] input1,int input2){

if(input2<=1)
return new Result(0,0);

int count=0;
int longest=0;
int i=0;

while(i<input2-1){

if(input1[i]>input1[i+1]){

int len=2;
i++;

while(i<input2-1&&input1[i]>input1[i+1]){
len++;
i++;
}

count++;

if(len>longest)
longest=len;
}
else{
i++;
}
}

return new Result(count,longest);
}

public static void main(String[] args){

int[] arr={11,3,1,4,7,8,12,2,3,7};

Result r=decreasingSeq(arr,arr.length);

System.out.println("Output1="+r.output1);
System.out.println("Output2="+r.output2);
}
}