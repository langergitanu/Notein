package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class KnownTypeSet implements Iterable<Class> {
    private com.aspose.words.internal.zzZZJ zzYh1;

    public KnownTypeSet(com.aspose.words.internal.zzZZJ zzzzj) {
        this.zzYh1 = zzzzj;
    }

    public void add(Class cls) {
        this.zzYh1.zzrx().add(cls);
    }

    public void clear() {
        this.zzYh1.zzrx().clear();
    }

    public int getCount() {
        return this.zzYh1.zzrx().getCount();
    }

    @Override // java.lang.Iterable
    public Iterator<Class> iterator() {
        return this.zzYh1.zzrx().iterator();
    }

    public void remove(Class cls) {
        this.zzYh1.zzrx().remove(cls);
    }
}
