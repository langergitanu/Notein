package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzJD implements zzGW, Iterable, Iterator {
    private boolean zzPx;
    private int zzXn = -1;
    private zzJC zzzF;
    private zzKW zzzG;
    private static String zzzE = zzXF.zzI("IndexOf");
    private static String zzzD = zzXF.zzI("NumberOf");

    public static class zzZ implements zzH0 {
        private boolean zzzB;
        private zzJD zzzC;

        public zzZ(zzJD zzjd, boolean z) {
            this.zzzC = zzjd;
            this.zzzB = z;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class getType() {
            return Integer.TYPE;
        }

        @Override // com.aspose.words.internal.zzF6
        public final boolean zzs() {
            return false;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Object zzu() {
            return null;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Object zzv() {
            return null;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class zzw() {
            return Integer.TYPE;
        }

        @Override // com.aspose.words.internal.zzH0
        public final Object zzx() {
            return Integer.valueOf(this.zzzB ? this.zzzC.zzXn : this.zzzC.zzXn + 1);
        }
    }

    public zzJD(zzJC zzjc) {
        this.zzzF = zzjc;
    }

    private void zz6(boolean z) {
        this.zzzF.zzHa().zzFi();
        this.zzXn = -1;
        this.zzzG = null;
        this.zzPx = z;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return zzHb();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        zz6(false);
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zzzG.getCurrent();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final boolean zzHb() throws Exception {
        if (this.zzPx) {
            return false;
        }
        if (this.zzzG == null) {
            Iterable iterable = (Iterable) this.zzzF.zzH9().zzx();
            if (iterable == null) {
                this.zzPx = true;
                return false;
            }
            this.zzzG = new zzKW(iterable.iterator());
        }
        if (!this.zzzG.moveNext()) {
            zz6(true);
            return false;
        }
        this.zzzF.zzHa().setValue(this.zzzG.getCurrent());
        this.zzXn++;
        return true;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzY(zzF6 zzf6, zzGY zzgy) {
        return null;
    }

    public final boolean zzYC() {
        return this.zzPx;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzZ(zzF6 zzf6) {
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzZ(zzF6 zzf6, zzGY zzgy) {
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzH0 zzZ(zzH0 zzh0, String str) {
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzH0 zzZ(zzH0 zzh0, String str, zzH0[] zzh0Arr, zzGY zzgy) {
        if (zzh0 != this.zzzF.zzHa() || zzh0Arr.length != 0) {
            return null;
        }
        String str2 = zzzE;
        int i = zzZOF.ORDINAL$4894b8c8;
        if (zzZKN.zzX(str, str2, i)) {
            return new zzZ(this, true);
        }
        if (zzZKN.zzX(str, zzzD, i)) {
            return new zzZ(this, false);
        }
        return null;
    }
}
