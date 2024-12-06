// Classe
public class Pessoa {
    // Atributo
    private String nome;
    // Propriedade
    public void setNome(String nome) {
        try {
            this.nome = nome;
        } catch (Exception erro) {
            System.out.println("Erro: não foi possível atribuir nome");
        }
    }
    // Metodo
    public void saudacao() {
        System.out.println("Olá " + this.nome);
    }
}

// Exemplo de instancia de um objeto a partir de uma classe (molde)
//public class Mundo{
//    public void Terra () {
//        Pessoa laura = new Pessoa();
//        laura.setNome("Laura");
//    }
//}
