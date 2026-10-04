package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzJE extends zzKN {

    public static class zzZ implements Iterable {
        private zzJE zzzH;
        private Iterable zzzI;

        /* JADX INFO: renamed from: com.aspose.words.internal.zzJE$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19082zzZ implements Iterator {
            private zzKW zzzG;
            private zzJE zzzH;

            public C19082zzZ(Iterator it, zzJE zzje) {
                this.zzzG = new zzKW(it);
                this.zzzH = zzje;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                try {
                    return this.zzzG.moveNext();
                } catch (Exception e) {
                    throw this.zzzH.zzZ(e);
                }
            }

            @Override // java.util.Iterator
            public final Object next() {
                try {
                    return this.zzzG.getCurrent();
                } catch (Exception e) {
                    throw this.zzzH.zzZ(e);
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public zzZ(Iterable iterable, zzJE zzje) {
            this.zzzI = iterable;
            this.zzzH = zzje;
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return new C19082zzZ(this.zzzI.iterator(), this.zzzH);
        }
    }

    public zzJE(zzKO zzko, String str) {
        super(zzko, str);
    }

    @Override // com.aspose.words.internal.zzKN, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Iterable iterable = (Iterable) super.zzx();
        if (iterable == null) {
            return null;
        }
        return new zzZ(iterable, this);
    }
}
