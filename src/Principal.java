import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner( System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 9){
            System.out.println("""
                    ******************************************\n
                    Bienvenido al conversor de monedas Monking\n
                    Ingresa la moneda que desea convertir\n
                    1. Dólar(EEUU) a peso Argentino. \n
                    2. Peso Argentino a Dólar(EEUU). \n
                    3. Dólar a Real Brasilero. \n
                    4. Real Brasilero a Dólar(EEUU). \n
                    5. Dólar(EEUU) a Peso Colombiano. \n
                    6. Peso Colombiano a Dolar(EEUU). \n
                    9. Salir del Conversor. \n
                    ******************************************\n
                    """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                default:
                    System.out.println("No es una opción correcta");
                        break;



            }
        }
    }
}
