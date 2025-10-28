import java.util.Scanner;

class calcudarIMC{
    public static String dadosimc(double imc){
        if (imc == 16.0 || imc < 17.0 ){
            return "magreza grave";
        }
        else if (imc == 17.00 || imc < 18.5) {
            return "magreza moderada";
        }
        else if (imc == 17.0 || imc < 18.5) {
            return "Magreza leve";
        }
        else if (imc == 18.5 || imc < 25.0) {
            return "Saudável";
        }
        else if (imc == 25.0 || imc < 30.0) {
            return "Sobrepeso";
        }
        else if (imc == 30.0 || imc < 35.0) {
            return "Obesidade Grau I";
        }
        else if (imc == 35.0 || imc < 40.0) {
            return "Obesidade Grau II";
        }
        else {
            return "Obesidade Grau III";
        }
    }

    public static double calcularPeso(double peso, double altura) {
        return peso / (altura*altura);
    }


    public static void calculadora(String calcular) {
        double peso;
        double altura;
        double imc;

        Scanner pScan = new Scanner(System.in);
        Scanner aScan = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Calculadora de IMC");
        System.out.println("==============================");

        System.out.println("Digite o seu peso em KG:");
        peso = Double.parseDouble(pScan.nextLine());

        System.out.println("Digite a sua altura em Metros:");
        altura = Double.parseDouble(aScan.nextLine());


        imc = calcularPeso(peso, altura);
        System.out.printf("\nSeu IMC é: %.2f kg/m2\n", imc);
        System.out.printf(dadosimc(imc));

    }

    public static void main(String[] args) {
        String versao ="1.0";
        calculadora(versao);
    }
}
