class ArrayUtil{

    public static int [] concat(int[] a, int [] b){
        int [] c=new int[a.length+ b.length];

        //배열 a와 b를 연결한 새로운 배열 리턴
/*
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = a.length; i <(a.length+b.length) ; i++) {
            c[i]=b[i-a.length];
        }
*/

        //java에서 지원하는 arraycopy 메소드, arrayUtil.concat과 동일한 기능
        //System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length,  b.length );
        return c;
    }
    public static void print(int[] a){
        System.out.print("[");
        //배열 a 출력
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.print("]");
    }
}
public class Empty {
    public static void main(String[] args) {
        int[] array1={1,5,7,9};
        int[] array2={3,6,-1,100,77};
        int[] array3=ArrayUtil.concat(array1,array2);
        ArrayUtil.print(array3);
    }
}