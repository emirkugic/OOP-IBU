package week11;import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
  private Map<String, Set<String>> dictionary;

  public PersonalMultipleEntryDictionary() {
    dictionary = new HashMap<>();
  }

  @Override
  public void add(String word, String entry) {
    if (!dictionary.containsKey(word)) {
      dictionary.put(word, new HashSet<>());
    }
    dictionary.get(word).add(entry);
  }

  @Override
  public Set<String> translate(String word) {
    if (dictionary.containsKey(word)) {
      return dictionary.get(word);
    }
    return null;
  }

  @Override
  public void remove(String word) {
    dictionary.remove(word);
  }
}
