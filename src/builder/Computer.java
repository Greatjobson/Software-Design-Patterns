package builder;

//product
public class Computer {
    private String CPU;
    private String GPU;
    private String pcCase;
    private String typeOfMemory;
    private int memoryCapacity;
    private int RAM;
    private int PSU; //Power Supply Unit

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", pcCase='" + pcCase + '\'' +
                ", typeOfMemory='" + typeOfMemory + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", RAM=" + RAM +
                ", PSU=" + PSU +
                '}';
    }

    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.pcCase = builder.pcCase;
        this.typeOfMemory = builder.typeOfMemory;
        this.memoryCapacity = builder.memoryCapacity;
        this.RAM = builder.RAM;
        this.PSU = builder.PSU;

    }
    public static class Builder {
        private String CPU;
        private String GPU;
        private String pcCase;
        private String typeOfMemory;
        private int memoryCapacity;
        private int RAM;
        private int PSU;
        public Builder buidCPU(String CPU) {
            this.CPU = CPU;
            return this ;
        }
        public Builder buildGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public Builder bulidPcCase(String pcCase) {
            this.pcCase = pcCase;
            return this;
        }
        public Builder bulidTypeOfMemory(String typeOfMemory) {
            this.typeOfMemory = typeOfMemory;
            return this;
        }
        public Builder bulidMemoryCapacity(int memoryCapacity) {
            this.memoryCapacity = memoryCapacity;
            return this;
        }
        public Builder bulidRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder bulidPSU(int PSU) {
            this.PSU = PSU;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}


