import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleVacinas {
    public static void main(String[] args) {
        // declaração dos objetos
        Funcionario funcionario;
        Paciente paciente;
        Vacina vacina;

        // ArrayList
        ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
        ArrayList<Pessoa> pacientes = new ArrayList<Pessoa>();

        // Variaveis auxiliares
        String nomeFuncionario, senhaFuncionario;
        int registroFuncionario;

        String nomeVacina, fabricanteVacina, loteVacina;
        int qtdVacina, validadeVacina;

        String nomePaciente, cpfPaciente;
        int dataNascimentoPaciente, qtdDose;

        // solicita dados do objeto funcinario
        nomeFuncionario = JOptionPane.showInputDialog("Digite o seu nome: ");
        registroFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu registro: "));
        senhaFuncionario = JOptionPane.showInputDialog("Digite a sua senha: ");
        funcionario = new Funcionario(nomeFuncionario, "", 0, registroFuncionario, senhaFuncionario);// instanciação
                                                                                                     // objeto
                                                                                                     // funcionario

        if (funcionario.validar() == true) { // método valida se usuario e senha estão corretos
            JOptionPane.showMessageDialog(null, funcionario.toString());// retorna o método com o nome do funcionario
            int opcao = 0;
            while (opcao != 6) {// estrutura de repetição para manter no menu principal
                opcao = Integer.parseInt(JOptionPane
                        .showInputDialog(("<--------- MENU DE OPÇÕES ---------->" + "\n[1] Registra uma nova vacina"
                                + "\n[2] Adicionar nova quantidade " + "\n[3] Relatório de estoque "
                                + "\n[4] Remover Vacina " + "\n[5] Cadastro paciente " + "\n[6] Sair\n")));

                switch (opcao) {
                case 1:// cadastro vacina
                    nomeVacina = JOptionPane.showInputDialog("Digite o nome da vacina: ");
                    fabricanteVacina = JOptionPane.showInputDialog("Digite o fabricante: ");
                    loteVacina = JOptionPane.showInputDialog("Digite o lote: ");
                    qtdVacina = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vacinas: "));
                    validadeVacina = Integer.parseInt(JOptionPane.showInputDialog("Digite a validade: (ddmmaa)"));
                    vacina = new Vacina(nomeVacina, fabricanteVacina, loteVacina, qtdVacina, validadeVacina); // instancia
                                                                                                              // o
                                                                                                              // objeto
                                                                                                              // na
                                                                                                              // classe
                                                                                                              // Vacina
                    vacinas.add(vacina);// adiciona o objeto instanciado no ArrayList Vacina
                    break;

                case 2:// adiciona qtd de vacina em lote ja existente
                    int verificar = 0;
                    loteVacina = JOptionPane.showInputDialog(
                            "<---------- ADICIONAR QTDE DE VACINA ---------->\nDigite o lote da vacina: ");
                    for (Vacina lote : vacinas) {// percorre o vetor
                        if (vacinas.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Não há lotes para adicionar vacinas!");
                        } else if (lote.validarLote(loteVacina)) {
                            qtdVacina = Integer.parseInt(
                                    JOptionPane.showInputDialog("Lote" + loteVacina + " da " + lote.getNomeVacina()
                                            + " encontrado!! \nDigite a quantidade de vacinas que deseja adicionar: "));
                            lote.somaVacina(qtdVacina);// método para somar com a vacina ja contida no lote
                            JOptionPane.showMessageDialog(null, "Quantidade adicionada");
                            verificar++;// contador
                        }

                    }
                    if (verificar == 0) {
                        JOptionPane.showMessageDialog(null, "Lote não encontrado, por favor verificar");// caso não
                                                                                                        // encontre o
                                                                                                        // lote
                    }
                    break;

                case 3:// relatório de vacinas cadastradas
                    String relatorio = "";
                    if (vacinas.isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                "Relatório vazio!!  \nPara cadastrar uma nova vacina digite 1 no MENU DE OPÇÕES");
                    } else {
                        for (int i = 0; i < vacinas.size(); i++) {
                            relatorio += vacinas.get(i).toString();// acumula no relatorio junto ao método toString
                        }
                        JOptionPane.showMessageDialog(null, relatorio);

                    }
                    break;

                case 4:// remove lote
                    verificar = 0;
                    loteVacina = JOptionPane.showInputDialog("Digite o lote que deseja remover: ");
                    for (int i = 0; i < vacinas.size(); i++) {
                        Vacina loteVacina2 = vacinas.get(i);// declarei objeto do Tipo vacina pra receber vacina na
                                                            // posição i
                        if (loteVacina2.getLoteVacina().equals(loteVacina)) {// comparar com o lote digitado
                            vacinas.remove(loteVacina2);
                            JOptionPane.showMessageDialog(null, "Lote removido");
                            verificar++;// contador

                        }

                    }
                    if (verificar == 0) {
                        JOptionPane.showMessageDialog(null, "Lote não encontrado, por favor verifique na opção 3");// caso
                                                                                                                   // não
                                                                                                                   // encontre
                                                                                                                   // o
                                                                                                                   // lote
                    }
                    break;
                case 5:// abre o menu de cadastro paciente
                    int opcao1 = 0;

                    while (opcao1 != 3) {// while para ficar no menu até que a opção 3 seja digitada
                        opcao1 = Integer.parseInt(JOptionPane.showInputDialog(
                                "<----------- MENU PACIENTE ----------- >" + "\n[1] - Cadastro paciente"
                                        + "\n[2] - Relatório de vacinados" + "\n[3] - Voltar ao MENU de OPÇÕES\n"));
                        switch (opcao1) {
                        case 1:// cadastro paciente
                            verificar = 0;
                            nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente: ");
                            cpfPaciente = JOptionPane.showInputDialog("Digite o cpf do paciente: ");
                            dataNascimentoPaciente = Integer
                                    .parseInt(JOptionPane.showInputDialog("Digite a data de nascimento: (ddmmaa)"));
                            loteVacina = JOptionPane.showInputDialog("Digite o lote aplicado: ");
                            for (Vacina peslote : vacinas) {
                                if (peslote.getLoteVacina().equals(loteVacina)) {
                                    qtdDose = Integer.parseInt(JOptionPane.showInputDialog("Lote" + loteVacina
                                            + " encontrado!! \nDigite a quantidade de aplicações: "));// adiciona a
                                                                                                      // quantidade de
                                                                                                      // vacina
                                    peslote.subVacina(qtdDose);// método subtrai do lote existente
                                    paciente = new Paciente(nomePaciente, cpfPaciente, dataNascimentoPaciente, qtdDose,
                                            peslote.getNomeVacina());// instancia o objeto paciente a classe Paciente
                                    pacientes.add(paciente); // adiciona o objeto ao ArrayList pacientes
                                    JOptionPane.showMessageDialog(null, "Paciente cadastrado");
                                    verificar++;
                                }
                                

                            }
                            if (verificar == 0) {
                                JOptionPane.showMessageDialog(null,
                                        "Lote não encontrado, verifique os lotes cadastrados.");
                            }

                            break;

                        case 2:// relatório de pacientes imunizados
                            String relatorio1 = "";
                            for (Pessoa p : pacientes) {// percorre o foreach por meio do objeto p do tipo Pessoa
                                relatorio1 += p.toString();// acumula no relatorio junto ao método toString
                            }
                            JOptionPane.showMessageDialog(null, relatorio1);

                            break;

                        }
                    }

                }
            }
            JOptionPane.showMessageDialog(null, "Produzido por: "
                    + "\nRGM: 26952505  Alana Caroline Barros dos Santos" + "\nRGM: 26732793  Gabriela Muniz Rezende"
                    + "\nRGM: 28062426  Kenneth Stanley Neves dos Santos" + "\nRGM: 27719821  Marcus Vinicius Ignacio"
                    + " \nObrigada por utilizar o nosso programa :)");// finalização
                                                                      // programa

        }

    }

}
