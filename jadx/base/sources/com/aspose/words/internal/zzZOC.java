package com.aspose.words.internal;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZOC extends zzZNY {
    private final Map<String, Integer> zzZWJ = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final Map<Integer, zzZO0> zzZWK;

    public zzZOC() {
        Map<Integer, zzZO0> mapZzii = zzii();
        this.zzZWK = mapZzii;
        for (zzZO0 zzzo0 : mapZzii.values()) {
            this.zzZWJ.put(zzzo0.zzhY(), Integer.valueOf(zzzo0.getCodePage()));
        }
        this.zzZWJ.putAll(zzij());
    }

    @Override // com.aspose.words.internal.zzZNY
    public zzZO0 zzQz(int i) {
        return this.zzZWK.get(Integer.valueOf(i));
    }

    @Override // com.aspose.words.internal.zzZNY
    public Integer zzV5(String str) {
        return this.zzZWJ.get(str);
    }

    public abstract Map<Integer, zzZO0> zzii();

    public Map<String, Integer> zzij() {
        return Collections.EMPTY_MAP;
    }
}
