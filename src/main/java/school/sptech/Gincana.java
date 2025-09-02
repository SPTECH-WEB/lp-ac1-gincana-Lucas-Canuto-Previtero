package school.sptech;

public class Gincana {
    private String nome;
    private Double premio;
    private Integer qtdInscrito;
    private Boolean ativa;


    public Gincana(String nome, Double premio) {
        this.premio = premio;
        this.nome = nome;
        this.qtdInscrito = 0;
        this.ativa = true;
    }

    public void inscrever(Integer qtd) {
        if (ativa == true) {
            if (qtd != null && qtd > 0) {
                qtdInscrito += qtd;

            }
        }
    }

    public Integer remover(Integer qtd) {
        if (ativa == true) {
            if (qtd != null && qtd > 0 && qtd <= qtdInscrito) {
                qtdInscrito -= qtd;
                return qtd;

            } else {
                return null;
            }
        } else {
            return null;
        }
    }


    public Integer desativar() {
        if (ativa == true) {
            ativa = false;
            Integer inscritosAntes = qtdInscrito;
            qtdInscrito = 0;
            return inscritosAntes;

        } else {
            return null;
        }
    }

    public void transferir(Gincana destino, Integer qtdATransferir) {
        if (destino != null && destino.ativa == true && ativa == true) {
            if (qtdATransferir != null && qtdATransferir > 0 && qtdATransferir <= qtdInscrito) {
                qtdInscrito -= qtdATransferir;
                destino.qtdInscrito += qtdATransferir;
            }
        }
    }



    public Boolean reajustarPremio(Double reajuste) {
        if (reajuste != null && reajuste > 0) {
            premio += premio * reajuste;
            return true;
        } else {
            return false;
        }
    }



    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return this.nome;}
    public Double getPremio() {return this.premio;}
    public Integer getQtdInscrito() {return this.qtdInscrito;}
    public Boolean getAtiva() {return this.ativa;}













}


