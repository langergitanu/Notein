package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJH implements Cloneable {
    private zzJI zzZip;
    private zzJI zzZiq;

    public zzJH(String str, String str2) {
        this.zzZiq = new zzJI(str);
        this.zzZip = new zzJI(str2);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final zzJI zzZSo() {
        return this.zzZip;
    }

    public final zzJI zzZSp() {
        return this.zzZiq;
    }

    public final zzJH zzZSq() {
        zzJH zzjh = (zzJH) memberwiseClone();
        zzjh.zzZiq = this.zzZiq.zzZSr();
        zzjh.zzZip = this.zzZip.zzZSr();
        return zzjh;
    }

    public zzJH(double d, double d2) {
        this.zzZiq = new zzJI(d);
        this.zzZip = new zzJI(d2);
    }

    public zzJH() {
        this.zzZiq = new zzJI(0.0d);
        this.zzZip = new zzJI(0.0d);
    }
}
