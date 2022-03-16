import java.util.ArrayList;
/**
 * This class represents a car lot object
 *
 * @author Hongxi Wen
 */
public class UsedCarLot {

    /**
     * The ArrayList of Cars stored
     */
    private ArrayList<Car> inventory;

    /**
     * Instantiates a UsedCarLot object
     */
    public UsedCarLot() {
        inventory = new ArrayList<>();
    }

    /**
     * Adds a Car to the inventory ArrayList
     * @param car Car to add to the inventory
     */
    public void addCar(Car car) {
        inventory.add(car);
    }

    /**
     * Returns the ArrayList of Cars stored in the inventory
     * @return The ArrayList of Cars
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Swaps the Cars located at the specified indexes in the inventory. Returns true or false if the swap succeeded
     * @param first The first index
     * @param second The second index
     * @return true or false depending on if the swap succeeded
     */
    public boolean swap(int first, int second) {
        if(first < 0 || first >= inventory.size() || second < 0 || second >= inventory.size()) {
            return false;
        }
        Car replaced = inventory.set(first, inventory.get(second));
        inventory.set(second, replaced);
        return true;
    }

    /**
     * Inserts a Car at the specified index in the inventory
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     * @param indexToAdd Index to insert the Car at
     * @param carToAdd Car to insert
     */
    public void addCar(int indexToAdd, Car carToAdd) {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Sells a car and removes it from the inventory ArrayList. Other Cars past its index will be moved down. Returns the Car to sell
     * <p>
     * PRECONDITION: 0 &lt;= indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell Index in the inventory of the Car to sell
     * @return Car to sell
     */
    public Car sellCarShift(int indexOfCarToSell) {
        return inventory.remove(indexOfCarToSell);
    }

    /**
     * Sells a Car and sets a null in its index in the inventory. Returns the Car to sell
     * <p>
     * PRECONDITION: 0 &lt;= indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell Index in the inventory of the Car to sell
     * @return Car to sell
     */
    public Car sellCarNoShift(int indexOfCarToSell) {
        return inventory.set(indexOfCarToSell, null);
    }

    /**
     * Moves the Car located at the specified index to a new index
     * <p>
     * PRECONDITION: 0 &lt;= indexOfCarToMove &lt; inventory.size()
     * <p>
     * PRECONDITION: o &lt;= destinationIndex &lt; inventory.size()
     * @param indexOfCarToMove Original index of the Car
     * @param destinationIndex Index to move the Car to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        inventory.add(destinationIndex, inventory.remove(indexOfCarToMove));
    }

}