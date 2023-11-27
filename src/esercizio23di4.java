public class esercizio23di4 {
    public static void main(String[] args) {
        int[] IntArray = new int[]{1,2,3,4,5};
        int x = 0;

        revision(IntArray, x);
    }

    static void revision(int[] z, int y){
        try{
            System.out.println(z[1] / y);
        } catch (ArithmeticException e){
            System.out.println("No puedes dividir un numero por 0");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("el indice supera el largo del arreglo");
        } finally {
            System.out.println("Fin");
        }
    }
}
