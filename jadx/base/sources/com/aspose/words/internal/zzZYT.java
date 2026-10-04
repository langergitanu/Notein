package com.aspose.words.internal;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYT<TValue> extends zzZQH<String, TValue> {
    public zzZYT() {
        this(true);
    }

    @Override // com.aspose.words.internal.zzZQH
    public final void zzT(int i, TValue tvalue) {
        set(getKeys().get(i), tvalue);
    }

    @Override // com.aspose.words.internal.zzZQH
    /* JADX INFO: renamed from: zzV5, reason: merged with bridge method [inline-methods] */
    public final String zzV4(int i) {
        return getKeys().get(i);
    }

    @Override // com.aspose.words.internal.zzZQH
    public final TValue zzVY(int i) {
        return zzl9().get(i);
    }

    public final void zzZ(zzZYT<TValue> zzzyt) {
        for (Map.Entry<String, TValue> entry : zzzyt) {
            zzB(entry.getKey(), entry.getValue());
        }
    }

    public zzZYT(Comparator<String> comparator) {
        super(comparator);
    }

    public zzZYT(boolean z) {
        super(z ? zzZYO.zzca : zzZYN.zzc9);
    }

    public final TValue zzZ(String str, TValue tvalue) {
        return containsKey(str) ? get(str) : tvalue;
    }
}
