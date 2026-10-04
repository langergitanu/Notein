package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzCB extends zz80 implements Cloneable {
    private int zzZ96;
    private zzEU zzZ97;
    private zzEU zzZ9r;
    private zzCE zzZaA;

    public zzCB(int i) {
        this.zzZaA = new zzCE(i);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzKd(int i) {
        this.zzZ96 = i;
    }

    public final int zzZFY() {
        return this.zzZ96;
    }

    public final zzEU zzZFZ() {
        if (this.zzZ97 == null) {
            this.zzZ97 = new zzEU();
        }
        return this.zzZ97;
    }

    public final boolean zzZG0() {
        zzEU zzeu = this.zzZ9r;
        return zzeu == null || !com.aspose.words.internal.zzZYD.zzXk(zzeu.getValue());
    }

    public final void zzZG1() {
        if (zzZG0()) {
            return;
        }
        this.zzZ9r = null;
        if (getExtensions() != null) {
            getExtensions().clear();
        }
    }

    public final zzCB zzZG2() {
        zzCB zzcb = (zzCB) memberwiseClone();
        zzcb.zzZaA = this.zzZaA.zzZGc();
        zzEU zzeu = this.zzZ9r;
        if (zzeu != null) {
            zzcb.zzZ9r = zzeu.zzZLO();
        }
        zzEU zzeu2 = this.zzZ97;
        if (zzeu2 != null) {
            zzcb.zzZ97 = zzeu2.zzZLO();
        }
        zzcb.setExtensions(zzZBz());
        return zzcb;
    }

    public final zzEU zzZGv() {
        if (this.zzZ9r == null) {
            this.zzZ9r = new zzEU();
        }
        return this.zzZ9r;
    }

    public final zzCE zzZN4() {
        return this.zzZaA;
    }

    public zzCB(zzCE zzce) {
        this.zzZaA = zzce;
    }
}
