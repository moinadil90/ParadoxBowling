package ca.moinadil.paradoxbowling.wrapper;

/**
 * Created by Moin Adil on 2018-08-03. Offers methods for retrieving a name, average and id from an object.
 */
public interface NameAverageId
        extends DeletableData {

    /**
     * Gets the name for this object.
     *
     * @return a name for the object
     */
    String getName();

    /**
     * Gets the average for this object.
     *
     * @return an average for this object
     */
    float getAverage();

    /**
     * Gets the id for this object.
     *
     * @return an id for this object
     */
    long getId();
}
