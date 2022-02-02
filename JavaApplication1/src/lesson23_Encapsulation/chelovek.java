package lesson23_Encapsulation;

public class chelovek {

    final String pol;
    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        // v dannom primere mi podstavlayem kopiju
        return sb;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }
    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        if (vozrast > 0) {
            this.vozrast = vozrast;
        }
    }
    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        if (ves > 0) {
            this.ves = ves;
        }
    }

    chelovek(String pol) {
        this.pol = pol;

    }
}

class test2 {

    public static void main(String[] args) {
        chelovek chel = new chelovek("man");
        chel.setName(new StringBuilder("Peter"));
        chel.getName().append("!!!!");
        chel.setVes(90);
        chel.setVozrast(40);

        System.out.println(chel.getName());
        System.out.println(chel.getVes());
        System.out.println(chel.getVozrast());

        chel.setVozrast(-50);

        System.out.println(chel.getVozrast());
    }
}
