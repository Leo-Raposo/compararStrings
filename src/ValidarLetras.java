public class ValidarLetras implements CompararLetras {
    private String palavra1;
    private String palavra2;

    @Override
    public boolean compararLetra() {
        if (getPalavra1().length() < 2 || getPalavra2().length() < 2) {
            throw new IllegalArgumentException("Você digitou menos de 2 letras. Tente Novamente!");
        }

        String ultimasLetras = getPalavra1().substring(getPalavra1().length() - 2);
        String primeirasLetras = getPalavra2().substring(0, 2);
        return ultimasLetras.equals(primeirasLetras);
    }

    @Override
    public void setPalavra1(String palavra1) {
        this.palavra1 = palavra1;
    }

    @Override
    public void setPalavra2(String palavra2) {
        this.palavra2 = palavra2;
    }

    @Override
    public String getPalavra1() {
        return palavra1;
    }

    @Override
    public String getPalavra2() {
        return palavra2;
    }
}
