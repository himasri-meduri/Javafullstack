public class SimpleEncodedArray{

static class Result{
int output1;
int output2;

Result(int o1,int o2){
output1=o1;
output2=o2;
}
}

public static Result findOriginalFirstAndSum(int[] input1,int input2){

int[] arr=new int[input2];
arr[input2-1]=input1[input2-1];

for(int i=input2-2;i>=0;i--)
arr[i]=input1[i]-arr[i+1];

int sum=0;

for(int i=0;i<input2;i++)
sum+=arr[i];

return new Result(arr[0],sum);
}

public static void main(String[] args){

int[] input={7,6,8,16,12,3};

Result r=findOriginalFirstAndSum(input,input.length);

System.out.println("Output1="+r.output1);
System.out.println("Output2="+r.output2);
}
}