import java.util.Date;
import java.util.Enumeration;

public class PessoaJuridica extends Cliente {

    pvriate int funcionarios;
    private String setor;

    public PessoaJuridica(String name, String addres, Date data, String CNPJ, String setor, int funcionarios) {

        super(name, addres, data);
        this.CNPJ = CNPJ;
        this.setor = setor;
        this.funcionarios = funcionarios;

    }

    void imprimir() {

        System.out.println("Nome do funcionario: " + getNome());
        System.out.println("Quantidade de Funcionarios: " + funcionarios);
        System.out.println("CPF do funcionario: " + CNPJ);
        System.out.println("Endereço do funcionario: " + getEndereco());
        System.out.println("Data de cadastro feito pelo funcionario: " + getData());
        System.out.println("Setor do funcionario: " + setor);

    }

        public String getCNPJ(){
        return CNPJ;
        }
        public void setCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
        }


        public int getFuncionarios(){
        return Funcionarios;
        }
        public void setFuncionarios(int funcionarios){
        this.funcionarios = funcionarios;
        }



        public String getSetor(){
        return setor;
        }
        public void setSetor(String setor){
        this.setor = setor;
        }
}