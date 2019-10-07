package kihons;

import framework.bases.MapKihonBase;
import framework.exceptions.NotImplementedYetException;

import java.util.*;

public class MapKihon extends MapKihonBase {

    @Override
    protected Map<String, String> createMapOfStringToString() {
        return new HashMap<>();
    }

    @Override
    protected void addKeyAndValueToMap(Map<String, String> inputMap, String key, String value) {
        inputMap.put(key,value);
    }

    @Override
    protected String getTheValueAtThisKey(Map<String, String> inputMap, String key) {
        return inputMap.get(key);
    }

    @Override
    protected boolean doesMapContainKey(Map<String, String> inputMap, String input) {
        return inputMap.containsKey(input);
    }

    @Override
    protected void removeKeyFromMap(Map<String, String> inputMap, String key) {
        inputMap.remove(key);
    }

    @Override
    protected int countUniqueWordsInList(List<String> inputWords) {
        Set<String> count = new HashSet<>();
        for ( var member : inputWords){
            count.add(member);
        }
        return count.size();
    }

}
