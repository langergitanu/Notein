package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJJ {
    private int zzA0;
    private zzK7 zzAk;
    private zzJG zzAl;
    private zzJW zzAm;
    private int zzzX;
    private int zzzY;
    private int zzzZ;

    public zzJJ(zzJW zzjw, zzJG zzjg, zzK7 zzk7, int i, int i2, int i3, int i4) {
        this.zzAm = zzjw;
        this.zzAl = zzjg;
        this.zzAk = zzk7;
        this.zzA0 = i;
        this.zzzZ = i2;
        this.zzzY = i3;
        this.zzzX = i4;
    }

    private boolean zzY(zzJJ zzjj) {
        return this.zzAm.equals(zzjj.zzAm) && this.zzAl.equals(zzjj.zzAl) && this.zzAk.equals(zzjj.zzAk) && this.zzA0 == zzjj.zzA0 && this.zzzZ == zzjj.zzzZ && this.zzzY == zzjj.zzzY && this.zzzX == zzjj.zzzX;
    }

    public final boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzJJ.class) {
            return false;
        }
        return zzY((zzJJ) obj);
    }

    public final int getCharset() {
        return this.zzzY;
    }

    public final int getFamily() {
        return this.zzA0;
    }

    public final int getPitch() {
        return this.zzzZ;
    }

    public final int getWeight() {
        return this.zzzX;
    }

    public final int hashCode() {
        return (((((((((((this.zzAm.hashCode() * 397) ^ this.zzAl.hashCode()) * 397) ^ this.zzAk.hashCode()) * 397) ^ this.zzA0) * 397) ^ this.zzzZ) * 397) ^ this.zzzY) * 397) ^ this.zzzX;
    }

    public final zzK7 zzHB() {
        return this.zzAk;
    }

    public final zzJG zzHC() {
        return this.zzAl;
    }

    public final zzJW zzHD() {
        return this.zzAm;
    }
}
