package laba_8;

public class Region{
        public int number;
        public double square_region;
        public int count_object;
        public double square_water;
        public double square_key;

        public Region(int number, double square_region, int count_object, double square_water, double square_key) {
            this.number = number;
            this.square_region = square_region;
            this.count_object = count_object;
            this.square_water = square_water;
            this.square_key = square_key;
        }

        public int getNumber() {
            return number;
        }

        public double getSquare_region() {
            return square_region;
        }

        public int getCount_object() {
            return count_object;
        }

        public double getSquare_water() {
            return square_water;
        }

        public double getSquare_key() {
            return square_key;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setSquare_region(double square_region) {
            this.square_region = square_region;
        }

        public void setCount_object(int count_object) {
            this.count_object = count_object;
        }

        public void setSquare_water(double square_water) {
            this.square_water = square_water;
        }

        public void setSquare_key(double square_key) {
            this.square_key = square_key;
        }
    }