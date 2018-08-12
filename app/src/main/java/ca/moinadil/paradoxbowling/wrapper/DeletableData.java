package ca.moinadil.paradoxbowling.wrapper;

/**
 * Created by Moin Adil on 2018-08-03. Offers method for setting an item's status to "deleted".
 */
public interface DeletableData {

    /**
     * Sets the object's "deleted" status.
     *
     * @param deleted true if the object is deleted, false otherwise
     */
    void setIsDeleted(boolean deleted);

    /**
     * Checks if the object has been deleted and returns true if so.
     *
     * @return true if the object is deleted, false otherwise
     */
    boolean wasDeleted();
}
