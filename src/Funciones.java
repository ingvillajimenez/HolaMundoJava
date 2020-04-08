public class Funciones {
    /*
    * Linea 1
    * Linea 2
    * Linea 3
    * */

    /**
     *
     * */
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //pi * r2
        circleArea(y);

        //Area de una esfera
        //4*PI*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*PI*r3
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES: " + convertToDolar(1000, "COP"));

    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r) {
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actulizada en Dolares
     * */
    public static double convertToDolar(double quantity, String currency) {
        //MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
        }

        return quantity;
    }
}
