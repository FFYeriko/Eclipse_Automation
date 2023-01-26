public class Features {

    public int multiplicacion (int numA, int numB){
        int result;
        result = numA * numB;

        return result;
    }

    public boolean isnull (int valor_result){
        boolean result = true;

        if (valor_result != 0){
            result = false;
        }

        return result;
    }
}
