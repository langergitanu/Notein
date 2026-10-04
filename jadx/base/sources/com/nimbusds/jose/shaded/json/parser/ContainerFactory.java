package com.nimbusds.jose.shaded.json.parser;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface ContainerFactory {
    public static final ContainerFactory FACTORY_SIMPLE = new ContainerFactory() { // from class: com.nimbusds.jose.shaded.json.parser.ContainerFactory.1
        @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
        public List<Object> createArrayContainer() {
            return new JSONArray();
        }

        @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
        public Map<String, Object> createObjectContainer() {
            return new JSONObject();
        }
    };
    public static final ContainerFactory FACTORY_ORDERED = new ContainerFactory() { // from class: com.nimbusds.jose.shaded.json.parser.ContainerFactory.2
        @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
        public List<Object> createArrayContainer() {
            return new JSONArray();
        }

        @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
        public Map<String, Object> createObjectContainer() {
            return new LinkedHashMap();
        }
    };

    List<Object> createArrayContainer();

    Map<String, Object> createObjectContainer();
}
