package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYR implements Iterable<zzXYS> {
    private com.aspose.words.internal.zzZYT<zzXYS> zzmQ = new com.aspose.words.internal.zzZYT<>();

    public final void add(String str, String str2) {
        com.aspose.words.internal.zzZ4.zzU(str, "uri");
        if (this.zzmQ.containsKey(str)) {
            throw new IllegalStateException("Document already has attached schema with such Uri.");
        }
        this.zzmQ.zzB(str, new zzXYS(str, str2));
    }

    public final void clear() {
        this.zzmQ.clear();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzXYS> iterator() {
        return this.zzmQ.zzl9().iterator();
    }

    public final zzXYR zzXQz() {
        zzXYR zzxyr = new zzXYR();
        for (zzXYS zzxys : this) {
            zzxyr.add(zzxys.getUri(), zzxys.getLocation());
        }
        return zzxyr;
    }
}
