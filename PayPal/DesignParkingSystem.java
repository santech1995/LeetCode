//Design Parking System
class ParkingSystem {

    private int big, medium, small; 
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch(carType) {
            case 1: {
                if(big > 0) {
                    big--;
                    return true;
                }
                break;
                // return false;
            }
            case 2: {
                if(medium > 0) {
                    medium--;
                    return true;
                }
                break;
                // return false; 
            }
            case 3: {
                if(small > 0) {
                    small--;
                    return true;
                }
                break;
                // return false;
            }
            default: return false;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */