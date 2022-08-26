public class User {

    private String nome;
    private String sobrenome;
    private String email;
    private String usuario;
    private String senha;

    public void atribuirNome(String nome) {
        this.nome = nome;
    }

    public String pegarNome() {
        return nome;
    }

    public void atribuirSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String pegarSobrenome() {
        return sobrenome;
    }

    public void atribuirEmail(String email) {
        this.email = email;
    }

    public String pegarEmail() {
        return email;
    }

    public void atribuirUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String pegarUsuario() {
        return usuario;
    }

    public void atribuirSenha(String senha) {
        this.senha = senha;
    }

    public String pegarSenha() {
        return senha;
    }
}
