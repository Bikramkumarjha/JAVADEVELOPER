public class _8funoverload {
    int sum(int a, int b) {
        int sum = a + b ;
        return sum;

    }
    float sum(float a, float b) {
        float  sum = a + b ;
        return sum;

    }


    int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;

    }
    double sum(double a,double b)
    {
        double sum=a+b;
        return sum;
    }

    public static void main(String arg[]) 
    {
         _8funoverload     a = new _8funoverload();
        int sum = a.sum(1, 2, 3);
        System.out.println(a.sum(40.444f, 45.45f));
        System.out.println(a.sum(1, 2, 5));

    }
}
