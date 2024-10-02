// Classe base Pessoa
class Pessoa {  
    protected String nome;
    protected String endereco;
    protected String email;

    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }
}

// Classe PessoaFisica
class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
    }
}

// Classe PessoaJuridica
class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CNPJ: " + cnpj);
    }
}

// Classe Funcionario
class Funcionario extends Pessoa {
    private String cpf;
    private double salario;

    public Funcionario(String nome, String endereco, String email, String cpf, double salario) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: " + salario);
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        PessoaFisica cliente1 = new PessoaFisica("Daniel", "Rua A, 123", "Daniel@gmail.com", "123.456.789-00");
        PessoaJuridica empresa1 = new PessoaJuridica("Empresa XYZ", "Av. Central, 1000", "contato@xyz.com", "00.123.456/0001-00");
        Funcionario funcionario1 = new Funcionario("Isabella ", "Rua alameda gema, 789", "Isabella@example.com", "321.654.987-00", 3500.00);

              



        System.out.println("Cliente cadastrado: ");
        cliente1.exibirInformacoes();
        System.out.println();
        System.out.println("Cliente juridico cadastrado: ");
        empresa1.exibirInformacoes();
        System.out.println();
        System.out.println("Funcionario cadastrado: ");
        funcionario1.exibirInformacoes();
    }
}

