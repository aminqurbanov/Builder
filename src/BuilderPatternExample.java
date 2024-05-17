public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .withStorage(512)
                .withGraphicsCard(true)
                .withBluetooth(true)
                .withWifi(true)
                .build();

        Computer officeComputer = new Computer.Builder("Intel i5", "8GB")
                .withStorage(256)
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
