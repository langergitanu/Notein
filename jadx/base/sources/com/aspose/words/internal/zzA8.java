package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzA8 implements zzH0 {
    private zzZVP zzrA;
    private zzKO zzrB;
    private zzKO zzrC;
    private boolean zzrz;

    public static class zzZ implements Iterable {
        private Iterable zzrx;
        private Iterable zzry;
        private boolean zzrz;

        /* JADX INFO: renamed from: com.aspose.words.internal.zzA8$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19081zzZ implements Iterator {
            private zzKW zzrr;
            private boolean zzrs;
            private HashMap zzrt;
            private zzKW zzru;
            private zzKW zzrv;
            private zzZ zzrw;

            public C19081zzZ(zzZ zzz) {
                this.zzrw = zzz;
                reset();
            }

            private void reset() {
                this.zzrv = new zzKW(this.zzrw.zzry.iterator());
                this.zzru = this.zzrw.zzrx != null ? new zzKW(this.zzrw.zzrx.iterator()) : null;
                this.zzrt = this.zzrw.zzrz ? new HashMap() : null;
                this.zzrs = false;
                this.zzrr = this.zzrv;
            }

            private boolean zzHb() {
                while (this.zzrr.moveNext()) {
                    if (this.zzrt == null) {
                        return true;
                    }
                    Object current = this.zzrr.getCurrent();
                    if (current == null && !this.zzrs) {
                        this.zzrs = true;
                        return true;
                    }
                    if (current != null && !this.zzrt.containsKey(current)) {
                        this.zzrt.put(current, null);
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                zzKW zzkw;
                if (zzHb()) {
                    return true;
                }
                if (this.zzrr != this.zzrv || (zzkw = this.zzru) == null) {
                    return false;
                }
                this.zzrr = zzkw;
                return zzHb();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return this.zzrr.getCurrent();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public zzZ(Iterable iterable, Iterable iterable2, boolean z) {
            this.zzry = iterable;
            this.zzrx = iterable2;
            this.zzrz = z;
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return new C19081zzZ(this);
        }
    }

    private zzA8(zzKO zzko, zzKO zzko2, zzZVP zzzvp, boolean z) {
        this.zzrC = zzko;
        this.zzrB = zzko2;
        this.zzrA = zzzvp;
        this.zzrz = z;
    }

    public static zzH0 zzV(zzKO zzko, zzGY zzgy) {
        return zzY(zzko, null, zzgy, true);
    }

    private static zzH0 zzY(zzKO zzko, zzKO zzko2, zzGY zzgy, boolean z) {
        Iterable.class.isAssignableFrom(zzko.getType());
        if (zzko2 != null && !Iterable.class.isAssignableFrom(zzko2.getType())) {
            return null;
        }
        zzZVP zzzvpZzZ = zzRE.zzZ(zzko, zzgy);
        if (zzko2 != null) {
            zzZVP zzzvpZzZ2 = zzRE.zzZ(zzko2, zzgy);
            if (zzSC.zzT(zzzvpZzZ, zzzvpZzZ2)) {
                zzzvpZzZ = zzzvpZzZ2;
            } else if (!zzSC.zzT(zzzvpZzZ2, zzzvpZzZ)) {
                return null;
            }
        }
        return new zzA8(zzko, zzko2, zzRE.zzY(zzzvpZzZ, zzgy), z);
    }

    public static zzH0 zzf(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzY(zzko, zzko2, zzgy, false);
    }

    public static zzH0 zzg(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzY(zzko, zzko2, zzgy, true);
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class getType() {
        return this.zzrA.getType();
    }

    @Override // com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return false;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzrA.zzu();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzrA.zzv();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class zzw() {
        return this.zzrA.zzw();
    }

    @Override // com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Iterable iterable = (Iterable) this.zzrC.zzx();
        zzKO zzko = this.zzrB;
        return new zzZ(iterable, zzko != null ? (Iterable) zzko.zzx() : null, this.zzrz);
    }
}
