/*
 * Parking Lot Problem You are given a parking lot represented 
as a character array arr of size n, where each element can 
either be 'S' (indicating an empty slot) or 'X' (indicating an occupied slot). 
Find the maximum number of cars that can be parked consecutively in the parking lot. 
Cars can only park in empty slots and must park in consecutive empty slots.
Example: Input: n: 16 arr: XXXSSSXXSXXSSXXSXX Output: 3
 */



/*
*Finds the maximum number of cars that can be parked consecutively in empty slots.
* parkingLot Character array representing the parking lot.
* n Size of the parking lot.
return Maximum consecutive empty slots available.
Input: n: 16 arr: XXXSSSXXSXXSSXXS Output: 3

*/
import java.util.Scanner; // Dynamic import for user input

public class ParkingLot {
    public static int maxConsecutiveParking(String parkingLot, int n) {
        int maxSlots = 0, currentSlots = 0;
        for (int i = 0; i < n; i++) {
            if (parkingLot.charAt(i) == 'S') {
                currentSlots++; // Increase count for consecutive 'S'
                maxSlots = Math.max(maxSlots, currentSlots); // Update max if needed
            }
            else {
                currentSlots = 0; // Reset counter if 'X' is found
            }
        }
        return maxSlots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Taking user input dynamically
        System.out.print("Enter the size of the parking lot (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the parking lot layout: ");
        String parkingLot = scanner.next(); // Read as a string

        int result = maxConsecutiveParking(parkingLot, n);
        System.out.println("Maximum consecutive parking slots: " + result);
        scanner.close();
    }
}