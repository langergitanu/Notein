package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ74 implements Cloneable {
    private boolean zzHc;
    private boolean zzYgR;
    private int zzYgS;
    private boolean zzYgT;
    private boolean zzYgU;
    private int zzYgV;

    public zzZ74(int i, boolean z, boolean z2, boolean z3, int i2, boolean z4) {
        if (i == 4094) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: styleIdentifier");
        }
        this.zzYgV = i;
        this.zzYgS = i2;
        this.zzHc = z;
        this.zzYgT = z3;
        this.zzYgR = z4;
        this.zzYgU = z2;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean getLocked() {
        return this.zzHc;
    }

    public final boolean getSemiHidden() {
        return this.zzYgT;
    }

    public final int getStyleIdentifier() {
        return this.zzYgV;
    }

    public final boolean getUnhideWhenUsed() {
        return this.zzYgR;
    }

    public final void zzYUh() {
        this.zzYgR = false;
    }

    public final int zzYUi() {
        return this.zzYgS;
    }

    public final void zzYUj() {
        this.zzYgT = false;
    }

    public final void zzYUk() {
        this.zzYgU = false;
    }

    public final boolean zzYUl() {
        return this.zzYgU;
    }

    public final zzZ74 zzYUm() {
        return (zzZ74) memberwiseClone();
    }

    public final boolean zzZ(zzZ74 zzz74) {
        return zzz74.zzHc == this.zzHc && zzz74.zzYgU == this.zzYgU && zzz74.zzYgT == this.zzYgT && zzz74.zzYgS == this.zzYgS && zzz74.zzYgR == this.zzYgR;
    }
}
