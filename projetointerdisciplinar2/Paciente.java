public class Paciente extends Pessoa implements Imprimivel {
    private int dose;
    private String nomeVacina;

    Paciente(String n, String c, int d, int dVacina, String nv) {
        super(n, c, d);
        dose = dVacina;
        nomeVacina = nv;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    @Override
    public String toString() {

        return "----------------------\nPaciente: " + super.getNome() + "\nCPF: " + super.getCpf()
                + "\nData de nascimento: " + super.getDataNascimento() / 10000 + "/"
                + super.getDataNascimento() % 10000 / 100 + "/" + super.getDataNascimento() % 100 
                + "\nDose: " + dose + "\nVacina: " + nomeVacina + NLIN;
    }

}
