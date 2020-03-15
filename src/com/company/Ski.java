package com.company;
import java.math.BigDecimal;

class Ski extends Item {
    private final int size;
    private final int tipWidth;
    private final int waistWidth;
    private final int tailWidth;

    public enum Manufacturer {
        ARMADA("Armada"),
        Faction("Faction"),
        Rossignol("Rossignol");
        public String manufacturer;

        private Manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }

    public Ski(BigDecimal price, Manufacturer manufacturer, SkiBuilder builder) {
        super(price, manufacturer.name());
        this.size = builder.size;
        this.tipWidth = builder.tipWidth;
        this.waistWidth = builder.waistWidth;
        this.tailWidth = builder.tailWidth;
    }

    public static class SkiBuilder {
        private int size;
        private int tipWidth;
        private int waistWidth;
        private int tailWidth;


        public SkiBuilder() {

        }

        public SkiBuilder size(int val) {
            this.size = val;
            return this;
        }

        public SkiBuilder tipWidth(int val) {
            this.tipWidth = val;
            return this;
        }

        public SkiBuilder waistWidth(int val) {
            this.waistWidth = val;
            return this;
        }

        public SkiBuilder tailWidth(int val) {
            this.tailWidth = val;
            return this;
        }
    }

    @Override
    void setPrice(BigDecimal price) {
    }

    @Override
    void setManufacturer(BigDecimal price) {

    }
}
