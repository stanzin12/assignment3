
class question1{

    public static void main(String[] args){
        String s="football";
        String p="football";
        int a= compare(s,p);
        System.out.println(a);
    }
    public static int compare(String s,String p){
        String s1=s.toLowerCase();
        String p1=p.toLowerCase();
        int l1=s.length();
        int l2=p.length();
        int l=0;
        if(l1<l2){
            l=l1;
        }else{
            l=l2;
        }
        int i=0;
        char c1;
        char c2;
        int d1;
        int d2;
        while(i<l){
            c1=s1.charAt(i);
            c2=p1.charAt(i);
            d1=c1;
            d2=c2;
            if(d1<d2){
                return 1;
            }
            if(d2<d1){
                return -1;
            }if(d2==d1){
                i=i+1;
            }
        }
        if(l1<l2){
            return 1;

        }if(l2<l1){
            return -1;
        }
        return 0;
    }


}
