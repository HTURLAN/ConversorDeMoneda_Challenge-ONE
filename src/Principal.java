import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion =0;
        double valorAConvertir;
        String menu = """
                ********************************************************
                Bienvenido/a a nuestro conversor de monedas!
                            
                Estas opciones estan disponibles para convertir...
                            
                1) Dolar ==> Peso Argentino
                2) Peso Argentino ==> Dolar
                3) Dolar ==> Real Brasileño
                4) Real Brasileño ==> Dolar
                5) Dolar ==> Peso Colombiano
                6) Peso Colombiano ==> Dolar
                7) Salir
                      
                ********************************************************
                Ingresa una opción válida:
                """;

        while (opcion != 7) {

            System.out.println(menu);
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            if (opcion != 7){
                System.out.println("Ingresa el valor que deseas convertir: ");
                Scanner valor = new Scanner(System.in);
                valorAConvertir = valor.nextDouble();

            switch (opcion) {

                case 1:

                    try {
                        ConsultarApi nuevaConsulta = new ConsultarApi();
                        ConversorMoneda conversion = nuevaConsulta.nuevaConversion(
                                "USD",
                                "ARS",
                                valorAConvertir);
                        System.out.println("El equivalente de $ " + valorAConvertir + " "
                                + conversion.base_code() + " son: $ "
                                + conversion.conversion_result() + " "
                                + conversion.target_code());


                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;
                case 2:

                    try {
                        ConsultarApi nuevaConsulta = new ConsultarApi();
                        ConversorMoneda conversion = nuevaConsulta.nuevaConversion(
                                "ARS",
                                "USD",
                                valorAConvertir);
                        System.out.println("El equivalente de $ " + valorAConvertir + " "
                                + conversion.base_code() + " son: $ "
                                + conversion.conversion_result() + " "
                                + conversion.target_code());

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;

                case 3:

                    try {
                        ConsultarApi nuevaConsulta = new ConsultarApi();
                        ConversorMoneda conversion = nuevaConsulta.nuevaConversion(
                                "USD",
                                "BRL",
                                valorAConvertir);
                        System.out.println("El equivalente de $ " + valorAConvertir + " "
                                + conversion.base_code() + " son: $ "
                                + conversion.conversion_result() + " "
                                + conversion.target_code());

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;

                case 4:

                    try {
                        ConsultarApi nuevaConsulta = new ConsultarApi();
                        ConversorMoneda conversion = nuevaConsulta.nuevaConversion(
                                "BRL",
                                "USD",
                                valorAConvertir);
                        System.out.println("El equivalente de $ " + valorAConvertir + " "
                                + conversion.base_code() + " son: $ "
                                + conversion.conversion_result() + " "
                                + conversion.target_code());

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }

                    break;
                case 5:

                    try {
                        ConsultarApi nuevaConsulta = new ConsultarApi();
                        ConversorMoneda conversion = nuevaConsulta.nuevaConversion(
                                "USD",
                                "COP",
                                valorAConvertir);
                        System.out.println("El equivalente de $ " + valorAConvertir + " "
                                + conversion.base_code() + " son: $ "
                                + conversion.conversion_result() + " "
                                + conversion.target_code());

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;

                case 6:

                    try {
                        ConsultarApi nuevaConsulta = new ConsultarApi();
                        ConversorMoneda conversion = nuevaConsulta.nuevaConversion(
                                "COP",
                                "USD",
                                valorAConvertir);
                        System.out.println("El equivalente de $ " + valorAConvertir + " "
                                + conversion.base_code() + " son: $ "
                                + conversion.conversion_result() + " "
                                + conversion.target_code());

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                        break;
                    }

            }
            }else {
                System.out.println("Muchas gracias por utilizar nuestro conversor");
                break;
            }

        }
    }
}