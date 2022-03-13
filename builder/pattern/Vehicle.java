package builder.pattern;

class Vehicle {
    private String engine;
    private int wheel;
    private int airbags;
    private String color;
    private boolean ac;

    public String getEngine() {
       return this.engine;
    }

    public int getWheel() {
        return this.wheel;
    }

    public int getAirbags() {
        return this.airbags;
    }
    public String getColor()
    {
        return this.color;
    }
    public boolean isAc()
    {
        return this.ac;
    }

     private Vehicle(VehicleBuilder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airbags = builder.airbags;
        this.color=builder.color;
        this.ac=builder.ac;
    }

    public static class VehicleBuilder {
        private String engine;
        private int wheel;

        private int airbags=0;
        private String color="White";
        private boolean ac;
        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }


        public VehicleBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;
        }
        public VehicleBuilder setColor(String color) {
           this.color=color;
           return this;
        }
        public VehicleBuilder setAc(boolean ac)
        {
            this.ac=ac;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    public String toString()
    {
        return "Your vehicle is Created";
    }
}