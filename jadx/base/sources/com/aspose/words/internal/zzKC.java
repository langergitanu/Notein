package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzKC implements zzH0 {
    private zzZVP zzBO;
    private zzKO zzBP;
    private int zzDt;
    private zzC1 zzRl;
    private zzKO zzi;

    public static class zzZ implements Iterable {
        private Iterable zzBN;
        private int zzDt;
        private zzC1 zzRl;
        private int zzZF;

        /* JADX INFO: renamed from: com.aspose.words.internal.zzKC$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19083zzZ implements Iterator {
            private boolean zzBK;
            private zzKW zzBL;
            private zzZ zzBM;
            private int zzTL;

            public C19083zzZ(zzZ zzz) {
                this.zzBM = zzz;
                reset();
            }

            private void reset() {
                this.zzBL = new zzKW(this.zzBM.zzBN.iterator());
                this.zzBK = this.zzBM.zzDt == 1;
                this.zzTL = -1;
            }

            private boolean zzId() {
                try {
                    return this.zzBM.zzRl != null ? ((Boolean) zzC0.zzZ(this.zzBM.zzRl, this.zzBL.getCurrent())).booleanValue() : this.zzTL < this.zzBM.zzZF;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (this.zzBK && this.zzBM.zzDt == 0) {
                    return false;
                }
                while (this.zzBL.moveNext()) {
                    this.zzTL++;
                    int i = this.zzBM.zzDt;
                    if (i == 0) {
                        if (!zzId()) {
                            this.zzBK = true;
                        }
                        return !this.zzBK;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException();
                        }
                        if (zzId()) {
                            return true;
                        }
                    } else {
                        if (!this.zzBK) {
                            return true;
                        }
                        if (!zzId()) {
                            this.zzBK = false;
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                return this.zzBL.getCurrent();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public zzZ(Iterable iterable, zzC1 zzc1, int i, int i2) {
            this.zzBN = iterable;
            this.zzRl = zzc1;
            this.zzZF = i;
            this.zzDt = i2;
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return new C19083zzZ(this);
        }
    }

    private zzKC(zzKO zzko, zzC1 zzc1, zzKO zzko2, int i, zzZVP zzzvp) {
        this.zzi = zzko;
        this.zzRl = zzc1;
        this.zzBP = zzko2;
        this.zzDt = i;
        this.zzBO = zzzvp;
    }

    private static zzH0 zzZ(zzKO zzko, zzKO zzko2, zzKO zzko3, zzGY zzgy, int i) {
        zzC1 zzc1;
        Iterable.class.isAssignableFrom(zzko.getType());
        if (zzko2 != null) {
            zzC1 zzc1ZzO = zzC0.zzO(zzko2);
            if (zzc1ZzO == null) {
                return null;
            }
            zzc1 = zzc1ZzO;
        } else {
            zzc1 = null;
        }
        if (zzko3 == null || zzko3.zzIM()) {
            return new zzKC(zzko, zzc1, zzko3, i, zzRE.zzX(zzko, zzgy));
        }
        return null;
    }

    public static zzH0 zzh(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, null, zzgy, 2);
    }

    public static zzH0 zzi(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, null, zzgy, 1);
    }

    public static zzH0 zzj(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, null, zzko2, zzgy, 1);
    }

    public static zzH0 zzk(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, null, zzgy, 0);
    }

    public static zzH0 zzl(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, null, zzko2, zzgy, 0);
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class getType() {
        return this.zzBO.getType();
    }

    @Override // com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return false;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzBO.zzu();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzBO.zzv();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class zzw() {
        return this.zzBO.zzw();
    }

    @Override // com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Iterable iterable = (Iterable) this.zzi.zzx();
        zzKO zzko = this.zzBP;
        return new zzZ(iterable, this.zzRl, zzko != null ? zz7F.zzT(zzko.zzx(), this.zzBP.zznw()) : 0, this.zzDt);
    }
}
