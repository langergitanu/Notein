package com.nimbusds.jose.shaded.json.parser;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class FakeContainerFactory implements ContainerFactory {
    public FackList list;
    public FackMap map;

    public static class FackList extends ArrayList<Object> {
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public Object get(int i) {
            return null;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return 0;
        }
    }

    public static class FackMap extends AbstractMap<String, Object> {
        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, Object>> entrySet() {
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(String str, Object obj) {
            return null;
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
    public List<Object> createArrayContainer() {
        if (this.list == null) {
            this.list = new FackList();
        }
        return this.list;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
    public Map<String, Object> createObjectContainer() {
        if (this.map == null) {
            this.map = new FackMap();
        }
        return this.map;
    }
}
