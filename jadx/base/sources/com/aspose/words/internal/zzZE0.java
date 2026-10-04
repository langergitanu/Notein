package com.aspose.words.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZE0 extends LinkedHashMap<String, String> {
    private static final zzZE0 zzWJb = new zzZE0();

    private zzZE0() {
        super(64, 0.6666f, false);
    }

    public static zzZE0 zzXLD() {
        return zzWJb;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
        return size() > 660;
    }

    public final String zzx0(String str) {
        String str2;
        synchronized (this) {
            str2 = get(str);
        }
        if (str2 != null) {
            return str2;
        }
        String strIntern = str.intern();
        synchronized (this) {
            put(strIntern, strIntern);
        }
        return strIntern;
    }
}
