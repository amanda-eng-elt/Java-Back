public class ImprimaNome {

    public static void main(String[] args) {

        String primeiroNome ="Ana Luiza";
        String segundoNome ="Damasceno";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
         
        System.out.println(nomeCompleto);
    }
    
 public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
    }
        
    }
