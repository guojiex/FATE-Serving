package com.webank.ai.fate.serving.core.cache;

import java.util.List;

public interface Cache<K, V> {

    void put(K key, V value);

    V get(K key);

    List<DataWrapper> get(K... keys);

    void put(List<DataWrapper> dataWrappers);

    public static class DataWrapper<K, V> {
        K key;
        V value;

        public DataWrapper(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }


}
