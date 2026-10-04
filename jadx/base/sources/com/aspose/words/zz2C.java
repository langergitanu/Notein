package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz2C implements Cloneable, Iterable<zz2F> {
    private int zzYZ1;
    private String zzYZ2;
    private boolean zzYZ3;
    private com.aspose.words.internal.zzD3<zz2F> zzYZ4;
    private boolean zzYZr;

    public static final class zzZ implements Iterator<zz2F> {
        private com.aspose.words.internal.zzD3<zz2F>.zzZ zzuB;

        public zzZ(zz2C zz2c) {
            this.zzuB = zz2c.zzYZ4.zzCK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzZuT, reason: merged with bridge method [inline-methods] */
        public zz2F next() {
            return this.zzuB.zzCI();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.zzuB.moveNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public zz2C() {
        this(false, false);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getCount() {
        return this.zzYZ4.getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator<zz2F> iterator() {
        return new zzZ(this);
    }

    public final void zzH0(int i) {
        this.zzYZ1 = i;
    }

    public final zz2F zzH1(int i) {
        return this.zzYZ4.get(i);
    }

    public final void zzOl(String str) {
        this.zzYZ2 = str;
    }

    public final void zzZ(zz2F zz2f) {
        if (zz2f != null) {
            this.zzYZ4.set(zz2f.zzZvh(), zz2f);
        }
    }

    public final int zzZuU() {
        return this.zzYZ1;
    }

    public final String zzZuV() {
        return this.zzYZ2;
    }

    public final boolean zzZuW() {
        return this.zzYZ3;
    }

    public final zz2C zzZuX() {
        zz2C zz2c = (zz2C) memberwiseClone();
        zz2c.zzYZ4 = new com.aspose.words.internal.zzD3<>();
        Iterator<zz2F> it = this.zzYZ4.zzCJ().iterator();
        while (it.hasNext()) {
            zz2c.zzZ(it.next().zzZvi());
        }
        return zz2c;
    }

    public final boolean zzZvC() {
        return this.zzYZr;
    }

    public zz2C(boolean z, boolean z2) {
        this.zzYZ4 = new com.aspose.words.internal.zzD3<>();
        this.zzYZr = z;
        this.zzYZ3 = z2;
    }
}
