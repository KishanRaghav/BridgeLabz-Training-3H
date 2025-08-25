import java.util.*;

public class RockPaperScissors {
    static String compChoice() {
        int x=(int)(Math.random()*3);
        if(x==0)return "rock";if(x==1)return "paper";return "scissors";
    }
    static int winner(String user,String comp) {
        if(user.equals(comp))return 0;
        if(user.equals("rock")&&comp.equals("scissors"))return 1;
        if(user.equals("paper")&&comp.equals("rock"))return 1;
        if(user.equals("scissors")&&comp.equals("paper"))return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt(),uw=0,cw=0;
        for(int i=0;i<games;i++){
            String user=sc.next();
            String comp=compChoice();
            int res=winner(user,comp);
            if(res==1)uw++;else if(res==-1)cw++;
            System.out.println("User:"+user+" Comp:"+comp+" Result:"+(res==1?"User":"Comp"));
        }
        System.out.println("User Wins:"+uw+" Computer Wins:"+cw);
        double up=(uw*100.0/games),cp=(cw*100.0/games);
        System.out.println("User%:"+up+" Computer%:"+cp);
    }
}