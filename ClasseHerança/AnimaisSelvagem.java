public class AnimaisSelvagem {
    private String nome;

    public void comer(){
        System.out.printf("%s comeu...\n", nome);
    }

    public void atacou(){
        System.out.printf("%s atacou...\n", nome);
    }

    public void cacou(){
        System.out.printf("%s caçou...\n", nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
