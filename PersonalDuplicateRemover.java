package week11;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> uniqueCharacterStrings;
    private int duplicates;

    public PersonalDuplicateRemover() {
        this.uniqueCharacterStrings = new HashSet<>();
        this.duplicates = 0;
    }

    @Override
    public void add(String characterString) {
        // If the character string is already in the set, increment the duplicates counter
        if (!uniqueCharacterStrings.add(characterString)) {
            duplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniqueCharacterStrings;
    }

    @Override
    public void empty() {
        uniqueCharacterStrings.clear();
        duplicates = 0;
    }
}
