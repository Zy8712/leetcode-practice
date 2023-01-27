class ParkingSystem {
    int small, medium, big;
    public ParkingSystem(int big, int medium, int small) {
        this.small = small;
        this.medium = medium;
        this.big = big;
    }
    public boolean addCar(int carType) {
        if(big >= 1 && carType == 1){
            big--;
            return true;
        }
        if(medium >= 1 && carType ==2){
            medium--;
            return true;
        }
        if(small >= 1 && carType == 3){
            small--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */