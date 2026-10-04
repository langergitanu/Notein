package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz0G implements zzH0 {
    private boolean zze4;
    private zzC1 zzh;
    private zzKO zzi;
    private zzZVP zzrA;

    public static class zzZ implements Iterable {
        private Iterable zzBN;
        private boolean zze4;
        private zzC1 zzh;

        /* JADX INFO: renamed from: com.aspose.words.internal.zz0G$zzZ$zzZ, reason: collision with other inner class name */
        public static abstract class AbstractC19079zzZ implements Iterator {
            private zzKW zzBL;
            private zzZ zze3;

            /* JADX INFO: renamed from: com.aspose.words.internal.zz0G$zzZ$zzZ$zzY */
            public static class zzY extends AbstractC19079zzZ implements Iterator {
                private zzKW zze1;

                public zzY(zzZ zzz) {
                    super(zzz);
                }

                @Override // com.aspose.words.internal.zz0G.zzZ.AbstractC19079zzZ, java.util.Iterator
                public final boolean hasNext() {
                    while (true) {
                        zzKW zzkw = this.zze1;
                        if (zzkw != null && zzkw.moveNext()) {
                            return true;
                        }
                        if (!super.hasNext()) {
                            return false;
                        }
                        this.zze1 = new zzKW(((Iterable) zzsb()).iterator());
                    }
                }

                @Override // java.util.Iterator
                public final Object next() {
                    return this.zze1.getCurrent();
                }

                @Override // com.aspose.words.internal.zz0G.zzZ.AbstractC19079zzZ, java.util.Iterator
                public final void remove() {
                    throw new UnsupportedOperationException();
                }
            }

            /* JADX INFO: renamed from: com.aspose.words.internal.zz0G$zzZ$zzZ$zzZ, reason: collision with other inner class name */
            public static class C19080zzZ extends AbstractC19079zzZ implements Iterator {
                private Object zze2;

                public C19080zzZ(zzZ zzz) {
                    super(zzz);
                }

                @Override // com.aspose.words.internal.zz0G.zzZ.AbstractC19079zzZ, java.util.Iterator
                public final boolean hasNext() {
                    boolean zHasNext = super.hasNext();
                    this.zze2 = zHasNext ? zzsb() : null;
                    return zHasNext;
                }

                @Override // java.util.Iterator
                public final Object next() {
                    return this.zze2;
                }

                @Override // com.aspose.words.internal.zz0G.zzZ.AbstractC19079zzZ, java.util.Iterator
                public final void remove() {
                    throw new UnsupportedOperationException();
                }

                @Override // com.aspose.words.internal.zz0G.zzZ.AbstractC19079zzZ
                public final void reset() {
                    super.reset();
                    this.zze2 = null;
                }
            }

            public AbstractC19079zzZ(zzZ zzz) {
                this.zze3 = zzz;
                reset();
            }

            public static AbstractC19079zzZ zzW(zzZ zzz) {
                return new zzY(zzz);
            }

            public static AbstractC19079zzZ zzX(zzZ zzz) {
                return new C19080zzZ(zzz);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.zzBL.moveNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            public void reset() {
                this.zzBL = new zzKW(this.zze3.zzBN.iterator());
            }

            public final Object zzsb() {
                try {
                    return zzC0.zzZ(this.zze3.zzh, this.zzBL.getCurrent());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public zzZ(Iterable iterable, zzC1 zzc1, boolean z) {
            this.zzBN = iterable;
            this.zzh = zzc1;
            this.zze4 = z;
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return this.zze4 ? AbstractC19079zzZ.zzW(this) : AbstractC19079zzZ.zzX(this);
        }
    }

    private zz0G(zzKO zzko, zzC1 zzc1, zzZVP zzzvp, boolean z) {
        this.zzi = zzko;
        this.zzh = zzc1;
        this.zzrA = zzzvp;
        this.zze4 = z;
    }

    public static zzH0 zz5(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzY(zzko, zzko2, zzgy, true);
    }

    public static zzH0 zz6(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzY(zzko, zzko2, zzgy, false);
    }

    private static zzH0 zzY(zzKO zzko, zzKO zzko2, zzGY zzgy, boolean z) {
        zzC1 zzc1ZzM = zzC0.zzM(zzko2);
        if (zzc1ZzM == null) {
            return null;
        }
        zzZVP zzzvpZzX = z ? zzRE.zzX(zzc1ZzM.zzBN(), zzgy) : zzRE.zzY(zzc1ZzM.zzBN(), zzgy);
        if (zzzvpZzX == null) {
            return null;
        }
        return new zz0G(zzko, zzc1ZzM, zzzvpZzX, z);
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
        return new zzZ((Iterable) this.zzi.zzx(), this.zzh, this.zze4);
    }
}
