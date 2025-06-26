package institute.practice1;

public class RevStr{
    public static void main(String[] args){
        String Ostr="TrumpTech";
        String Rstr="";
        System.out.println("OriginalString: "+Ostr);
        for(int i=0;i<Ostr.length();i++){
            Rstr = Ostr.charAt(i) + Rstr;
        }
        System.out.println("ReverseString: "+Rstr);
    }

}
