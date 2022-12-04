public enum Animals {
    ELEFANT(2), DOG(3), CAT(4), GIRAFFE(1), FOX(5), DEER(6), CROCODILE(7);
    int old;

    Animals(int old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return "Назва тварини - " + super.toString() + ", вік тварини - " + getOld();
    }

    public int getOld() {
        return old;
    }
}
