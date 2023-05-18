package br.com.lucianoneves.calcularetencoes.retencoes;

public class Irrf {
    private float baseDeCalculoIrrf = 0;
    private float irrfRetido = 0;

    public float getBaseDeCalculoIrrf() {
        return baseDeCalculoIrrf;
    }

    public void setBaseDeCalculoIrrf(float baseDeCalculoIrrf) {
        this.baseDeCalculoIrrf = baseDeCalculoIrrf;
    }

    public float calculaIrrf () {
        if (baseDeCalculoIrrf <= 2112) {
            baseDeCalculoIrrf = baseDeCalculoIrrf;
        } else if (baseDeCalculoIrrf > 2112 && baseDeCalculoIrrf <= 2826.65) {
            baseDeCalculoIrrf = (float) (baseDeCalculoIrrf - (baseDeCalculoIrrf * 0.075 - 158.40));
        } else if (baseDeCalculoIrrf > 2826.65 && baseDeCalculoIrrf <= 3751.05) {
            baseDeCalculoIrrf = (float) (baseDeCalculoIrrf - (baseDeCalculoIrrf * 0.15 - 370.40));
        } else if (baseDeCalculoIrrf > 3751.05 && baseDeCalculoIrrf <= 4664.68) {
            baseDeCalculoIrrf = (float) (baseDeCalculoIrrf - (baseDeCalculoIrrf * 0.225 - 651.73));
        } else {
            baseDeCalculoIrrf = (float) (baseDeCalculoIrrf - (baseDeCalculoIrrf * 0.275 - 884.96));
        }
        return baseDeCalculoIrrf;
    }

    public float valorIrrfRetido () {
        if (baseDeCalculoIrrf <= 2112.00) {
            irrfRetido = 0.00F;
        } else if (baseDeCalculoIrrf > 2112.00 && baseDeCalculoIrrf <= 2826.65) {
            irrfRetido = (float) (baseDeCalculoIrrf * 0.075 - 158.40);
        } else if (baseDeCalculoIrrf > 2826.65 && baseDeCalculoIrrf <= 3751.05) {
            irrfRetido = (float) (baseDeCalculoIrrf * 0.15 - 370.40);
        } else if (baseDeCalculoIrrf > 3751.05 && baseDeCalculoIrrf <= 4664.68) {
            irrfRetido = (float) (baseDeCalculoIrrf * 0.225 - 651.73);
        } else {
            irrfRetido = (float) (baseDeCalculoIrrf * 0.275 - 884.96);
        }
        return irrfRetido;
    }
}
