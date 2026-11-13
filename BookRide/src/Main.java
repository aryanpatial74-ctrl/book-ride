import ui.BookRideUI;

/**
 * Main application launcher for BookRide.
 * Acts solely as the entry point to instantiate and start the UI layer.
 */
public class Main {

    public static void main(String[] args) {
        BookRideUI ui = new BookRideUI();
        ui.start();
    }
}
