class reversenumber 
{
public static void main(String[] arg) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int num=sc.nextInt();
int rev = 0;
while(num!=0)
{
int digit = num%10;
int rev = rev*10+digit;
num = num/10;
}
System.out.println("Reversednumber:"+num);
}
}
        
