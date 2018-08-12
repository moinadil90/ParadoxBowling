package ca.moinadil.paradoxbowling.utilities;

/**
 * Created by Moin Adil on 2018-08-03. An object which can enable or disable navigation in the application.
 */
public interface NavigationController {

    /**
     * Enables or disables navigation within the controller.
     *
     * @param enable {@code true} to enable navigation, {@code false} to disable.
     */
    void setNavigationEnabled(boolean enable);
}
