class vowels
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
system.out.println("Eneter the string:");
string str=sc.nextLine();
int len=str.Length();
for (i=0;i<=len;i++)
{
int count = 0;
if (str[i]=="A"||str[i]=="E"||str[i]=="I"||str[i]=="O"||str[i]=="U"||str[i]=="a"||str[i]=="e"||str[i]=="i"||str[i]=="o"||str[i]=="u")
{
count = count+1;
}
}
System.out.println("vowels"+count);
}
}
