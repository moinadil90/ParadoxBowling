package ca.moinadil.paradoxbowling.utilities;

/**
 * Created by Moin Adil on 2018-08-03. Provides a method for handling a click on the floating action button.
 */
public interface FloatingActionButtonHandler {

    /**
     * Invoked when the floating action button is clicked.
     */
    void onFabClick();

    /**
     * Invoked when the secondary floating action button is clicked.
     */
    void onSecondaryFabClick();
}
