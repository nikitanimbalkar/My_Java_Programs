class Fibonaccirecurssion
{
static int n1=0,n2=1,n3=0;
static void printFibonacci(int count){
if(count>0){
n3=n1+n2;
n1=n2;
n2=n3;
System.our.println(""+n3);
printFibonacci(count-1);
}}
Public static void main(String args[]){
int count=10;
system.out.print(n2+""+n2);
printFibonacci(count-2);
}}