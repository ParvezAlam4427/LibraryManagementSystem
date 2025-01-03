package com.library;

import com.library.controller.LibraryController;
import com.library.model.Library;
import com.library.view.LibraryView;

public class Main {
    public static void main(String[] args) {
        // Initialize the MVC components
        Library library = new Library();
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(library, view);

        // Start the application
        controller.run();
    }
}
