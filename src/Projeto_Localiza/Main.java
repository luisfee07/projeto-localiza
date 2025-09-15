package Projeto_Localiza;

import Projeto_Localiza.Entidades.Carro;
import Projeto_Localiza.Entidades.Cliente;
import Projeto_Localiza.Entidades.Funcionario;
import Projeto_Localiza.Entidades.Locacao;

public class Main {
    public static void main(String[] args) {

        // Instanciação dos objetos
        Carro carro = new Carro("Toyota Corolla", "ABC-1234", "Sedã", true, true, 2022, 2023, 1000, 5000, "Disponível",
                150.0f);
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", "11999999999", "joao@email.com");
        Funcionario funcionario = new Funcionario("Maria Santos", "987.654.321-00", "12345", "Gerente",
                "maria@email.com");
        Locacao locacao = new Locacao(carro, cliente, "2025-05-24", "2025-06-01", carro.getDiaria());

        // Exibição dos dados
        System.out.println("\n===== Informações do Carro =====");
        System.out.printf("Modelo: %s | Placa: %s | Categoria: %s | Status: %s | Diária: R$%.2f\n",
                carro.getModelo(), carro.getPlaca(), carro.getCategoria(), carro.getStatus(), carro.getDiaria());

        System.out.println("\n===== Informações do Cliente =====");
        System.out.printf("Nome: %s | CPF: %s | Telefone: %s | Email: %s\n",
                cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getEmail());

        System.out.println("\n===== Informações do Funcionário =====");
        System.out.printf("Nome: %s | CPF: %s | Matrícula: %s | Cargo: %s | Email: %s\n",
                funcionario.getNome(), funcionario.getCpf(), funcionario.getMatricula(), funcionario.getCargo(),
                funcionario.getEmail());

        System.out.println("\n===== Detalhes da Locação =====");
        System.out.printf(
                "Carro Locado: %s | Cliente: %s\nData Início: %s | Data Fim Estimada: %s | Valor da Diária: R$%.2f\n",
                locacao.getCarroLocado().getModelo(), locacao.getCliente().getNome(), locacao.getDataInicio(),
                locacao.getDataFimEstimada(), locacao.getValorDiaria());

        System.out.println("\nDados exibidos com sucesso!");
    }
}