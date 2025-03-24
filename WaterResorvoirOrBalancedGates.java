import java.util.Arrays;
class WaterResorvoirOrBalancedGates{
    public static void main(String[] args){
        String s="((()))";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                c++;
            else
                c--;
                if(c==-1)
                    break;
        }
        if(c==0)
            System.out.println("Balanced gates");
        else
            System.out.println("Not a balanced gates");
    }
}


// o/P:Balanced gates
