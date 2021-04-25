package gt.edu.umg.ingenieria.sistemas.ingenieria.brbble_sort.services;

public class BrbbleSort implements IBrbbleSort{

    @Override
    public void brbbleSort(String[] array) {
        for (int x = 0; x < array.length; x++) {

            for (int y = 0; y < array.length - 1; y++) {
                String elementoActual = array[y],
                        elementoSiguiente = array[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {

                    array[y] = elementoSiguiente;
                    array[y + 1] = elementoActual;
                }
            }
        }
    }
}
