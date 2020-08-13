package basic;
import java.util.Scanner;
class Secret{
    protected String Asia(String msg){
        String ans="";
        for(int i=0;i<msg.length();i++){
            if(msg.charAt(i)>=65 && msg.charAt(i)<=91 || msg.charAt(i)>=97 && msg.charAt(i)<=122){
                ans+=(char)(msg.charAt(i)+2);
            }
            else{
                return "Invalid message";
            }
        }
        return ans;
    }
    protected String US(String msg){
        String ans="";
        for(int i=0;i<msg.length();i++){
            ans+=((int)msg.charAt(i))+".";
        }
        return ans.substring(0,ans.length()-1);
    }
    protected String Dubai(String msg){
        StringBuilder str = new StringBuilder(msg);
        return str.reverse().toString();
    }

}
public class SecretOperation extends Secret {

    private static String[] Operate() {
        SecretOperation sec = new SecretOperation();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] S = new String[n];
        int[] L = new int[n];
        for(int i=0;i<n;i++){
            S[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            L[i]=sc.nextInt();
        }
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            switch (L[i]){
                case 0:
                    ans[i]=sec.Asia(S[i]);
                    break;
                case 1:
                    ans[i]=sec.US(S[i]);
                    break;
                case 2:
                    ans[i]=sec.Dubai(S[i]);
                    break;
                default:
                    ans[i]="Invalid locale";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] S=Operate();
        for(String s : S){
            System.out.println(s);
        }
    }

}
