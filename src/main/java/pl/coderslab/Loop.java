package pl.coderslab;

public class Loop {
    public static void main(String[] args) {

        looop();
    }

    static void looop () {

        int[] tab = {0,1,2,3,4,5,6};
        for (int i=0; i <= tab.length-1; i+=2) {
            System.out.print(tab[i] +" ");
            if (i<tab.length-1) {
                System.out.println(tab[i+1]);
            }
        }

    }
}
