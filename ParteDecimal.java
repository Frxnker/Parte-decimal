public class ParteDecimal {
    public static void main(String[] args) {

        System.out.println("Introduce un número real: ");
        double n = Double.parseDouble(System.console().readLine());

        double redondeo = Math.round(n);

        if (n == redondeo) {
            System.out.println("El número no tiene parte decimal.");
        } else {
            System.out.println("El número si tiene parte decimal y es: " + (n - redondeo));
        }
    }
}
