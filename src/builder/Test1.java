package builder;
public class Test1 {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .bulidPcCase("fullTower")
                .buidCPU("Ryzen 9")
                .buildGPU("RTX 4070")
                .bulidTypeOfMemory("SSD")
                .bulidMemoryCapacity(2000)
                .bulidPSU(1000)
                .bulidRAM(32)
                .build();


        System.out.println(gamingPC.toString());
    }
}
