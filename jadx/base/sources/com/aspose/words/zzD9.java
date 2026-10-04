package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzD9 extends zz80 implements Cloneable {
    private zz2N zzZao;
    private zz2S zzZap;
    private zz2C zzZjd;
    private zz4G zzZje;
    private zz7X zzZjf;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        zz2C zz2c;
        zz2N zz2n;
        zz2S zz2s;
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zzD9 zzd9 = (zzD9) obj;
        return getFill().equals(zzd9.getFill()) && getOutline().equals(zzd9.getOutline()) && (com.aspose.words.internal.zzZ4.zzX(this.zzZap, zzd9.zzZap) || ((zz2s = this.zzZap) != null && zz2s.equals(zzd9.zzZap))) && ((com.aspose.words.internal.zzZ4.zzX(this.zzZao, zzd9.zzZao) || ((zz2n = this.zzZao) != null && zz2n.equals(zzd9.zzZao))) && (com.aspose.words.internal.zzZ4.zzX(this.zzZjd, zzd9.zzZjd) || ((zz2c = this.zzZjd) != null && zz2c.equals(zzd9.zzZjd))));
    }

    public final zz7X getFill() {
        zz7X zz7x = this.zzZjf;
        if (zz7x != null) {
            return zz7x;
        }
        zz19 zz19Var = new zz19();
        this.zzZjf = zz19Var;
        return zz19Var;
    }

    public final zz4G getOutline() {
        zz4G zz4g = this.zzZje;
        if (zz4g != null) {
            return zz4g;
        }
        zz4G zz4g2 = new zz4G();
        this.zzZje = zz4g2;
        return zz4g2;
    }

    public final int hashCode() {
        int iHashCode = getFill().hashCode() ^ getOutline().hashCode();
        zz2S zz2s = this.zzZap;
        if (zz2s != null) {
            iHashCode ^= zz2s.hashCode();
        }
        zz2N zz2n = this.zzZao;
        if (zz2n != null) {
            iHashCode ^= zz2n.hashCode();
        }
        zz2C zz2c = this.zzZjd;
        return zz2c != null ? iHashCode ^ zz2c.hashCode() : iHashCode;
    }

    public final boolean isEmpty() {
        zz7X zz7x = this.zzZjf;
        if (zz7x != null && zz7x.zzZQ4() != 6) {
            return false;
        }
        zz4G zz4g = this.zzZje;
        if (zz4g != null && zz4g.zzZxz() != 0) {
            return false;
        }
        zz2C zz2c = this.zzZjd;
        return zz2c == null || zz2c.getCount() == 0;
    }

    public final void setFill(zz7X zz7x) {
        this.zzZjf = zz7x;
    }

    public final void setOutline(zz4G zz4g) {
        this.zzZje = zz4g;
    }

    public final void zzY(zz2S zz2s) {
        this.zzZap = zz2s;
    }

    public final void zzZ(zz2C zz2c) {
        this.zzZjd = zz2c;
    }

    public final zz2N zzZI0() {
        return this.zzZao;
    }

    public final zz2S zzZI1() {
        return this.zzZap;
    }

    public final zz4G zzZI2() {
        return this.zzZje;
    }

    public final zz7X zzZI3() {
        return this.zzZjf;
    }

    public final zzD9 zzZI4() {
        zzD9 zzd9 = (zzD9) memberwiseClone();
        zz7X zz7x = this.zzZjf;
        if (zz7x != null) {
            zzd9.zzZjf = zz7x.zzZQ6();
        }
        zz4G zz4g = this.zzZje;
        if (zz4g != null) {
            zzd9.zzZje = zz4g.zzZxK();
        }
        zz2C zz2c = this.zzZjd;
        if (zz2c != null) {
            zzd9.zzZjd = zz2c.zzZuX();
        }
        zz2S zz2s = this.zzZap;
        if (zz2s != null) {
            zzd9.zzZap = zz2s.zzZvG();
        }
        zz2N zz2n = this.zzZao;
        if (zz2n != null) {
            zzd9.zzZao = zz2n.zzZvt();
        }
        zzd9.setExtensions(zzZBz());
        return zzd9;
    }

    public final zz2C zzZTe() {
        return this.zzZjd;
    }

    public final void zzY(zz2N zz2n) {
        this.zzZao = zz2n;
    }
}
