public class VotacaoTimes {
}

import java.util.Map;
import java.util.Scanner;

public class VotacaoTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> times = new HashMap<>();
        times.put("Teffismo Club", 0);
        times.put("Patinho Club", 0);
        times.put("Lucas FC", 0);
        times.put("Sport Redes FC", 0);

        System.out.print("Digite a quantidade de pessoas que irão votar: ");
        int quantidadeVotantes = scanner.nextInt();

        for (int i = 1; i <= quantidadeVotantes; i++) {
            System.out.println("Votante " + i + ", escolha seu time:");
            System.out.println("1 - Teffismo Club");
            System.out.println("2 - Patinho Club");
            System.out.println("3 - Lucas FC");
            System.out.println("4 - Sport Redes FC");
            int voto = 0;

            while (true) {
                System.out.print("Digite o número correspondente ao seu time (1-4): ");
                voto = scanner.nextInt();

                if (voto >= 1 && voto <= 4) {
                    break;
                } else {
                    System.out.println("Voto inválido! Por favor, digite um número de 1 a 4.");
                }
            }

           
            switch (voto) {
                case 1:
                    times.put("Teffismo Club", times.get("Teffismo Club") + 1);
                    break;
                case 2:
                    times.put("Patinho Club", times.get("Patinho Club") + 1);
                    break;
                case 3:
                    times.put("Lucas FC", times.get("Lucas FC") + 1);
                    break;
                case 4:
                    times.put("Sport Redes FC", times.get("Sport Redes FC") + 1);
                    break;
            }
        }

     
        System.out.println("\nResultados da votação:");
        String timeVencedor = null;
        int maxVotos = -1;

        for (Map.Entry<String, Integer> entry : times.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votos");
            if (entry.getValue() > maxVotos) {
                maxVotos = entry.getValue();
                timeVencedor = entry.getKey();
            }
        }

      
        System.out.println("O time vencedor é: " + timeVencedor + " com " + maxVotos + " votos!");

        scanner.close();
    }
