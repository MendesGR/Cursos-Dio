import java.util.*;

public class FiltroCandidatos {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a primeira linha: número de candidatos e habilidade buscada
        String[] primeiraLinha = scanner.nextLine().split(",");
        int n = Integer.parseInt(primeiraLinha[0].trim());
        String habilidadeBuscada = primeiraLinha[1].trim().toLowerCase();

        List<String> candidatosComHabilidade = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine().trim();
            // Separar nome e habilidades
            String[] partes = linha.split("-", 2);
            String nome = partes[0].trim();
            String habilidades = partes.length > 1 ? partes[1].trim() : "";

            // TODO: Divida as habilidades e verifique se alguma bate com a buscada
            String[] listaHabilidades = habilidades.split(",");
            for (String habilidade : listaHabilidades) {
                if (habilidade.trim().equalsIgnoreCase(habilidadeBuscada)) {
                    candidatosComHabilidade.add(nome);
                    break; // já encontrou, não precisa verificar mais
                }
            }
    
        }

        if (candidatosComHabilidade.isEmpty()) {
            System.out.println("Nenhum candidato encontrado");
        } else {
            for (String candidato : candidatosComHabilidade) {
                System.out.println(candidato);
            }
        }

        scanner.close();
    }
}
