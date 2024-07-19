package model;



    public class Plane {
        private String model;
        private String country;
        private int year;
        private double hours;
        private boolean military;
        private double weight;
        private double wingspan;
        private double topSpeed;
        private int seats;
        private double cost;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if (year >1902 && year < 2025)
                this.year = year;
        }

        public double getHours() {
            return hours;
        }

        public void setHours(double hours) {
            if (hours >=0 && hours<10001);
            this.hours = hours;
        }

        public boolean isMilitary() {
            return military;
        }

        public boolean setMilitary(boolean military) {
            this.military = military;
            return military;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            if (weight >= 10000 && weight <= 160000 )
                this.weight = weight;
        }

        public double getWingspan() {
            return wingspan;
        }

        public void setWingspan(double wingspan) {
            if(wingspan>=10 && wingspan<=45)
                this.wingspan = wingspan;
        }

        public double getTopSpeed() {
            return topSpeed ;
        }

        public void setTopSpeed(double topSpeed) {
            if (topSpeed<=1000 && topSpeed >=0)
                this.topSpeed = topSpeed;
        }

        public int getSeats() {
            return seats;
        }

        public void setSeats(int seats) {
            if (seats >=0)
                this.seats = seats;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            if (cost>=0)
                this.cost = cost;
        }


    }


