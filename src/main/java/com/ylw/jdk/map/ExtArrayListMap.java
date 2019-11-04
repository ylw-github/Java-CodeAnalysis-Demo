package com.ylw.jdk.map;

import java.util.ArrayList;
import java.util.List;


public class ExtArrayListMap<Key, Value> {

    List<Entry<Key, Value>> tables = new ArrayList<Entry<Key, Value>>();

    public void put(Key key, Value value) {
        // 判断key是否已经重复
        Entry existEntry = getEntry(key);
        if (existEntry != null) {
            existEntry.value = value;
            return;
        }
        Entry entry = new Entry<Key, Value>(key, value);
        tables.add(entry);
    }

    public Value get(String key) {
        for (Entry<Key, Value> entry : tables) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(Key key) {
        Entry existEntry = getEntry(key);
        if (existEntry != null) {
            tables.remove(existEntry);
        }
    }

    public Entry<Key, Value> getEntry(Key key) {
        for (Entry<Key, Value> entry : tables) {
            if (entry.key.equals(key)) {
                return entry;
            }
        }
        return null;
    }

}

class Entry<Key, Value> {

    public Entry(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    Key key;
    Value value;

}
