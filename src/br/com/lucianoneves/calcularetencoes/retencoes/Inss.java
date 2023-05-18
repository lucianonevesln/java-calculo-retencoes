package br.com.lucianoneves.calcularetencoes.retencoes;

public class Inss {
    private float baseDeCalculoInss = 0;
    private float inssRetido = 0;

    public void setBaseDeCalculoInss(float baseDeCalculoInss) {
        this.baseDeCalculoInss = baseDeCalculoInss;
    }

    public float getBaseDeCalculoInss() {
        return baseDeCalculoInss;
    }

    public float calculaInss () {
        if (baseDeCalculoInss <= 1320.00) {
            baseDeCalculoInss = (float) (baseDeCalculoInss - (baseDeCalculoInss * 0.075));
        } else if (baseDeCalculoInss > 1320.00 && baseDeCalculoInss <= 2571.29) {
            baseDeCalculoInss = (float) (baseDeCalculoInss - (baseDeCalculoInss * 0.09 - 19.80));
        } else if (baseDeCalculoInss > 2571.29 && baseDeCalculoInss <= 3856.94) {
            baseDeCalculoInss = (float) (baseDeCalculoInss - (baseDeCalculoInss * 0.12 - 96.94));
        } else if (baseDeCalculoInss > 3856.94 && baseDeCalculoInss <= 7507.49) {
            baseDeCalculoInss = (float) (baseDeCalculoInss - (baseDeCalculoInss * 0.14 - 174.08));
        } else {
            baseDeCalculoInss = (float) (baseDeCalculoInss - 876.95);
        }
        return baseDeCalculoInss;
    }

    public float valorInssRetido () {
        if (baseDeCalculoInss <= 1320.00) {
            inssRetido = (float) (baseDeCalculoInss * 0.075);
        } else if (baseDeCalculoInss > 1320.00 && baseDeCalculoInss <= 2571.29) {
            inssRetido = (float) (baseDeCalculoInss * 0.09 - 19.80);
        } else if (baseDeCalculoInss > 2571.29 && baseDeCalculoInss <= 3856.94) {
            inssRetido = (float) (baseDeCalculoInss * 0.12 - 96.94);
        } else if (baseDeCalculoInss > 3856.94 && baseDeCalculoInss <= 7507.49) {
            inssRetido = (float) (baseDeCalculoInss * 0.14 - 174.08);
        } else {
            inssRetido = (float) (876.95);
        }
        return inssRetido;
    }
}
