package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWS extends zzSR implements zzFI {
    private boolean zz90;
    private zzZZ9 zzoc;

    public static final class zzZ implements Iterable, Iterator {
        private zzKV<zzZZR> zz8Z;

        public zzZ(Iterable<zzZZR> iterable) {
            this.zz8Z = new zzKV<>(iterable.iterator());
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.zz8Z.moveNext();
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.zz8Z.getCurrent().zzEW();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public zzZWS(zzZZ9 zzzz9, boolean z) {
        super(new zzZZR(), null);
        this.zzoc = zzzz9;
        this.zz90 = z;
    }

    @Override // com.aspose.words.internal.zzFI
    public final boolean zzW(zzFS zzfs) throws Exception {
        zz0U zz0u = new zz0U(zzfs, this.zzoc);
        zzZ(zzfs, (Map) null, zz0u);
        zzfs.zzEQ();
        zzZ(zzfs, zz0u);
        return !this.zzoc.zzrm().contains(zzfs.zzEN());
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) {
        return 0;
    }

    private void zzZ(zzFS zzfs, zz0U zz0u) throws Exception {
        if (this.zzoc.zzrl()) {
            zzfs.zzZ((Iterable) new zzZ(zz0u.zzsu()), this.zz90);
            Iterator<zzZZR> it = zz0u.zzsu().iterator();
            while (it.hasNext()) {
                zz0V.zzZ(3, zzfs, it.next(), zz0u);
            }
        }
        if (zz0u.zzsw() != null) {
            Iterator<Object> it2 = zz0u.zzsw().iterator();
            while (it2.hasNext()) {
                zzfs.zzE(it2.next());
            }
        }
        zz0u.zzsv().zzVl();
    }
}
