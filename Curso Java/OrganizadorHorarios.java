
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OrganizadorHorarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Set<String> horarios = new TreeSet<>();

        for(int i = 0; i < n; i++){
            String horario = scan.nextLine().trim();
            horarios.add(horario);
        }

        for(String horario : horarios){
            System.out.println(horario);
        }

        System.out.println("Total de horarios unicos: " + horarios.size());

        scan.close();
    }
}
