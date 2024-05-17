public class Computer {

    private final String CPU;
    private final String RAM;


    private final int storage;
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;
    private final boolean hasWifi;


    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWifi = builder.hasWifi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage=" + storage +
                ", hasGraphicsCard=" + hasGraphicsCard +
                ", hasBluetooth=" + hasBluetooth +
                ", hasWifi=" + hasWifi +
                '}';
    }


    public static class Builder {

        private final String CPU;
        private final String RAM;

        private int storage = 256;
        private boolean hasGraphicsCard = false;
        private boolean hasBluetooth = false;
        private boolean hasWifi = true;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder withStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder withGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder withBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder withWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }


        public Computer build() {
            return new Computer(this);
        }
    }
}