package fr.theobosse.shotcaveapi.chemistry;

public record Element (int id, String name) {
    @Override
    public String toString() {
        return String.format("element:%s[id %d]", getName(), getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
