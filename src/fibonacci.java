public class fibonacci {
    public static void main(String[] args) {
        int m1=0, m2=1, m3, i=2, count=3;
        System.out.println(m1+" "+m2);
        for(i=2; i< count; i++){
            m3=m1+m2;
            System.out.println(" "+m3);
            m1=m2;
            m2=m3;
        }}}
