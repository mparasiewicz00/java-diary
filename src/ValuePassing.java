public class ValuePassing {
    public static int changei(int i){
        int[] a = {1}; //a
        ++i; //b
        return(i + a[0]);
    }

    public static void main(String[] args){
        int i = 2;  //1
        {
            i = i + 3; //2
            int y = 4; //3
            y = ++y;  //4
        }

        int return_i = 0;
        return_i = changei(i); //5
    }
}
