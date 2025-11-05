package aula2.exercicio1;

public class DataAniversario {
    private int dia;
    private int mes;

    public DataAniversario(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        DataAniversario outra = (DataAniversario) obj;
        return this.dia == outra.dia && this.mes == outra.mes;
    }

    @Override
    public String toString() {
        return dia + "/" + mes;
    }
}