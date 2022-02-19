public class calc{
private static Type name() {

    int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primeiro valor: ");
        num1 = sc.nextInt();
        
        System.out.println("Insira o segundo valor: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("O Resultado é: "+ sum);
}

}