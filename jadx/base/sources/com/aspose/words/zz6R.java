package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz6R implements zzZCB, Cloneable {
    private com.aspose.words.internal.zzD3<Object> zzZ2Y = new com.aspose.words.internal.zzD3<>();
    private zzZCB zzZ2Z;
    private zzZCA zzZ30;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static boolean zzV(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzZCB
    public final int getCount() {
        return this.zzZ2Y.getCount();
    }

    @Override // com.aspose.words.zzZCB
    public final void remove(int i) {
        this.zzZ2Y.zzVG(i);
    }

    @Override // com.aspose.words.zzZCB
    public final void removeAll() {
        this.zzZ2Y.clear();
    }

    @Override // com.aspose.words.zzZCB
    public final void zzL(int i, Object obj) {
        if (obj != null) {
            this.zzZ2Y.set(i, obj);
        } else if (this.zzZ2Y.zzVE(i)) {
            remove(i);
        }
    }

    @Override // com.aspose.words.zzZCB
    public final boolean zzLh(int i) {
        return this.zzZ2Y.zzVE(i);
    }

    @Override // com.aspose.words.zzZCB
    public final Object zzLu(int i) {
        return this.zzZ2Y.get(i);
    }

    @Override // com.aspose.words.zzZCB
    public final Object zzLv(int i) {
        zzZCA zzzca;
        zzZCB zzzcbZzZOm;
        zzZCB zzzcb = this.zzZ2Z;
        Object objZzLu = zzzcb != null ? zzzcb.zzLu(i) : null;
        return (objZzLu != null || (objZzLu = this.zzZ2Y.get(i)) != null || (zzzca = this.zzZ30) == null || (zzzcbZzZOm = zzzca.zzZOm()) == null) ? objZzLu : zzzcbZzZOm.zzLv(i);
    }

    @Override // com.aspose.words.zzZCB
    public final void zzZ(zzZCA zzzca) {
        this.zzZ30 = zzzca;
    }

    @Override // com.aspose.words.zzZCB
    public final zzZCB zzZzW() {
        return this.zzZ2Z;
    }

    @Override // com.aspose.words.zzZCB
    public final zzZCA zzZzX() {
        return this.zzZ30;
    }

    @Override // com.aspose.words.zzZCB
    public final zzZCB zzZzY() {
        zz6R zz6r = (zz6R) memberwiseClone();
        zz6r.zzZ2Y = new com.aspose.words.internal.zzD3<>(this.zzZ2Y);
        zzZCA zzzca = this.zzZ30;
        if (zzzca != null) {
            zz6r.zzZ30 = zzzca.zzZOl();
        }
        return zz6r;
    }

    @Override // com.aspose.words.zzZCB
    public final void zzZ(zzZCB zzzcb) {
        this.zzZ2Z = zzzcb;
    }

    @Override // com.aspose.words.zzZCB
    public final boolean zzZ(int[] iArr, zzZCB zzzcb) {
        Object objZzLv;
        zzZCA zzzca;
        zzZCB zzzcb2;
        if (this.zzZ2Y.getCount() == 0 && ((zzzcb2 = this.zzZ2Z) == null || zzzcb2.getCount() == 0)) {
            return false;
        }
        if (zzzcb == null && ((zzzca = this.zzZ30) == null || zzzca.zzZOm() == null)) {
            return true;
        }
        if (zzzcb == null) {
            zzzcb = this.zzZ30.zzZOm();
        }
        com.aspose.words.internal.zzD3<Object>.zzZ zzzZzCK = this.zzZ2Y.zzCK();
        while (zzzZzCK.moveNext()) {
            if (!zzV(iArr, zzzZzCK.zzCM()) && (objZzLv = zzLv(zzzZzCK.zzCM())) != null && !objZzLv.equals(zzzcb.zzLv(zzzZzCK.zzCM()))) {
                return true;
            }
        }
        return false;
    }
}
