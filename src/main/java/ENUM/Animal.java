package ENUM;

public enum Animal {
    FROG("лягушка"), CAT("кошка"), DOG("собака"), BIRD("птица");

    private String translation;

    // constructor
    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
