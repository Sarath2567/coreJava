package institute.assignment;
//write a progam to check if two numbers are equal
public class CheckEqual {
    public static void main(String[] args){
        int a=15;
        int b=25;
        if (a==b){
            System.out.println(a==b);
            System.out.println(a+" is Equals to "+b);
        }
        else if(a<b){
            System.out.println(a<b);
            System.out.println(a+" is Less than "+b);
        }
        else if(a>b){
            System.out.println(a>b);
            System.out.println(a+" is Grater than "+b);
        }
        else if(a<=b){
            System.out.println(a<=b);
            System.out.println(a+" is Lessthan or Equal to"+b);
        }
        else if(a>=b){
            System.out.println(a>=b);
            System.out.println(a+"is Graterthan or Equal to"+b);
        }
    }
}
