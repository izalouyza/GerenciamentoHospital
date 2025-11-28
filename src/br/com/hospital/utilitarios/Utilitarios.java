package br.com.hospital.utilitarios;

public class Utilitarios {

    // Gera ID's
    private static int contadorId = 1;

    public static int gerarIdIncremental() {
        return contadorId++;
    }

    // Evita ID's repetidos
    public static String gerarIdUnico() {
        return "ID-" + gerarIdIncremental();
    }

    // Verifica texto vazio
    public static boolean textoNaoVazio(String txt) {
        return txt != null && !txt.isBlank();
    }

    // Valida e-mail
    public static boolean emailValido(String email) {
        if (email == null){
            return false;
        }
        email = email.trim();
        return email.contains("@") && email.contains(".");
    }

    // Valida o CRM
    public static boolean crmValido(String crm) {
        if (crm == null){
            return false;
        }
        crm = crm.trim();
        return crm.length() >= 4 && crm.length() <= 10;
    }

    // Valida telefone
    public static boolean telefoneValido(String telefone) {
        if (telefone == null){
            return false;
        }
        String digitos = telefone.replaceAll("\\D", "");
        return digitos.matches("\\d{8,13}");
    }
}
