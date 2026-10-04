package com.aspose.words.internal;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzZNX extends zzZOC {
    private final Map<Integer, String> zzZWc = new HashMap();
    private final Map<String, Integer> zzZWJ = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    public zzZNX() {
        Iterator<Charset> it = Charset.availableCharsets().values().iterator();
        int i = 65536;
        while (it.hasNext()) {
            String strDisplayName = it.next().displayName();
            this.zzZWc.put(Integer.valueOf(i), strDisplayName);
            this.zzZWJ.put(strDisplayName, Integer.valueOf(i));
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzZOC, com.aspose.words.internal.zzZNY
    public final zzZO0 zzQz(int i) {
        if (this.zzZWc.containsKey(Integer.valueOf(i))) {
            return new zzZOD(new zzZNZ(i, this.zzZWc.get(Integer.valueOf(i))));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZOC, com.aspose.words.internal.zzZNY
    public final Integer zzV5(String str) {
        return this.zzZWJ.get(str);
    }

    @Override // com.aspose.words.internal.zzZOC
    public final Map<Integer, zzZO0> zzii() {
        return Collections.EMPTY_MAP;
    }
}
