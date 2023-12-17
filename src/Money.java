public class Money {
    private long grivnas;
    private byte kopiykas;

    public Money(long grivnas, byte kopiykas) {
        this.grivnas = grivnas;
        this.kopiykas = kopiykas;
    }

    public long getGrivnas() {
        return grivnas;
    }

    public byte getKopiykas() {
        return kopiykas;
    }

    public void setGrivnas(long grivnas) {
        this.grivnas = grivnas;
    }

    public void setKopiykas(byte kopiykas) {
        this.kopiykas = kopiykas;
    }

    public void display() {
        System.out.println(grivnas + "," + kopiykas);
    }

    public Money add(Money other) {
        long sumGrivnas = this.grivnas + other.grivnas;
        int sumKopiykas = this.kopiykas + other.kopiykas;

        if (sumKopiykas >= 100) {
            sumGrivnas += sumKopiykas / 100;
            sumKopiykas %= 100;
        }

        return new Money(sumGrivnas, (byte) sumKopiykas);
    }

    public Money subtract(Money other) {
        long diffGrivnas = this.grivnas - other.grivnas;
        int diffKopiykas = this.kopiykas - other.kopiykas;

        if (diffKopiykas < 0) {
            diffGrivnas--;
            diffKopiykas += 100;
        }

        return new Money(diffGrivnas, (byte) diffKopiykas);
    }

    public Money divide(double divisor) {
        double totalAmount = this.grivnas + this.kopiykas / 100.0;
        double resultAmount = totalAmount / divisor;

        long resultGrivnas = (long) resultAmount;
        byte resultKopiykas = (byte) ((resultAmount - resultGrivnas) * 100);

        return new Money(resultGrivnas, resultKopiykas);
    }

    public Money multiply(double multiplier) {
        double totalAmount = this.grivnas + this.kopiykas / 100.0;
        double resultAmount = totalAmount * multiplier;

        long resultGrivnas = (long) resultAmount;
        byte resultKopiykas = (byte) ((resultAmount - resultGrivnas) * 100);

        return new Money(resultGrivnas, resultKopiykas);
    }

    public int compare(Money other) {
        double thisAmount = this.grivnas + this.kopiykas / 100.0;
        double otherAmount = other.grivnas + other.kopiykas / 100.0;

        if (thisAmount < otherAmount) {
            return -1;
        } else if (thisAmount > otherAmount) {
            return 1;
        } else {
            return 0;
        }
    }
}
