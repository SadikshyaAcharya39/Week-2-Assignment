package MainClasses;

// Base class for all deposit items
public class DepositItem {
    int number;  // Number of items
    float value;  // Monetary value of the item

    public DepositItem(int number, float value) {
        this.number = number;
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public float getValue() {
        return value;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setValue(float value) {
        this.value = value;
    }

    // Method to return the type of item
    public String getType() {
        return this.getClass().getSimpleName();
    }
}

// Subclass for Can
public class Can extends DepositItem {
    private float weight;  // Weight specific to Can

    public Can(int number, float value, float weight) {
        super(number, value);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

// Subclass for Bottle
public class Bottle extends DepositItem {
    private float size;  // Size specific to Bottle

    public Bottle(int number, float value, float size) {
        super(number, value);
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}

// Subclass for Crate
public class Crate extends DepositItem {
    private float size;  // Size specific to Crate

    public Crate(int number, float value) {
        super(number, value);
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}

