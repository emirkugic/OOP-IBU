package week11;

import java.util.Set;

public interface DuplicateRemover {
    /**
     * Stores a character string if it's not a duplicate.
     * @param characterString the character string to add
     */
    void add(String characterString);

    /**
     * Returns the number of detected duplicates.
     * @return the number of detected duplicates
     */
    int getNumberOfDetectedDuplicates();

    /**
     * Returns an object which implements the Set interface. Objects should have all unique
     * characterStrings (no duplicates!). If there are no unique characterStrings, the
     * method returns an empty set.
     * @return a set of unique character strings
     */
    Set<String> getUniqueCharacterStrings();

    /**
     * Removes stored characterStrings and resets the amount of detected duplicates.
     */
    void empty();
}
