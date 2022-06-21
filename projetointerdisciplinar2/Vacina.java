
public class Vacina implements Imprimivel {
    private String nomeVacina;
    private String fabricanteVacina;
    private String loteVacina;
    private int qtdVacina;
    private int validadeVacina;

    public Vacina() {

    }

    public Vacina(String n, String f, String l, int q, int v) {
        nomeVacina = n;
        fabricanteVacina = f;
        loteVacina = l;
        qtdVacina = q;
        validadeVacina = v;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getFabricanteVacina() {
        return fabricanteVacina;
    }

    public void setFabricanteVacina(String fabricanteVacina) {
        this.fabricanteVacina = fabricanteVacina;
    }

    public String getLoteVacina() {
        return loteVacina;
    }

    public void setLoteVacina(String loteVacina) {
        this.loteVacina = loteVacina;
    }

    public int getQtdVacina() {
        return qtdVacina;
    }

    public void setQtdVacina(int qtdVacina) {
        this.qtdVacina = qtdVacina;
    }

    public int getValidadeVacina() {
        return validadeVacina;
    }

    public void setValidadeVacina(int validadeVacina) {
        this.validadeVacina = validadeVacina;
    }

    public boolean validarLote(String lote) {
        boolean temLote;
        if (getLoteVacina().equals(lote)) {
            temLote = true;
            return temLote;
        }

        else {
            temLote = false;
            return temLote;
        }

    }

    public String toString() {
        return "----------------------\nVacina: " + nomeVacina + "\nFabricante: " + fabricanteVacina + "\nLote: "
                + loteVacina + "\nQuantidade: " + qtdVacina + "\nValidade: " + validadeVacina / 10000 + "/"
                + validadeVacina % 10000 / 100 + "/20" + validadeVacina % 100 + NLIN;
    }

    public void somaVacina(int v) {

        this.qtdVacina = getQtdVacina() + v;

    }

    public void subVacina(int v) {

        this.qtdVacina = this.qtdVacina - v;

    }

}
