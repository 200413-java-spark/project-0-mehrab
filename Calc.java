import java.util.Scanner; 
class Calc {
    public static void main(String[] args) {

        Scanner calc_input = new Scanner(System.in);

        System.out.println("Enter operand 1");

        int operand_a=calc_input.nextInt();        

        System.out.println("Enter operand 2");
        int operand_b = calc_input.nextInt();

        System.out.println("Enter operator ex: +, -, *, /");
        Character operator = calc_input.next().charAt(0);

        if (operator.equals('*')) {
            System.out.println(operand_a * operand_b);
        }          
        
        calc_input.close();
    }
}