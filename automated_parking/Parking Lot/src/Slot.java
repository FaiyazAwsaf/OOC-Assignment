
public class Slot {
    private final int slotNumber;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public Slot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isOccupied = false;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public int getSlotNumber() {
        return slotNumber;
    }
}