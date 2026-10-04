package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz3Z {
    private double zzZ0h;
    private double zzZ0i;
    private double zzZ0j;
    private double zzZ0k;

    public zz3Z() {
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zz3Z.class) {
            return false;
        }
        return zzV((zz3Z) obj);
    }

    public int hashCode() {
        return (((((com.aspose.words.internal.zzZKP.zzZ9(this.zzZ0k) * 397) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ0j)) * 397) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ0i)) * 397) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ0h);
    }

    public final boolean isEmpty() {
        return com.aspose.words.internal.zzAN.zzZD(this.zzZ0k) && com.aspose.words.internal.zzAN.zzZD(this.zzZ0h) && com.aspose.words.internal.zzAN.zzZD(this.zzZ0j) && com.aspose.words.internal.zzAN.zzZD(this.zzZ0i);
    }

    public final boolean zzV(zz3Z zz3z) {
        if (com.aspose.words.internal.zzZKO.zzA(this, zz3z)) {
            return true;
        }
        return com.aspose.words.internal.zzAN.zzL(this.zzZ0j, zz3z.zzZ0j) && com.aspose.words.internal.zzAN.zzL(this.zzZ0h, zz3z.zzZ0h) && com.aspose.words.internal.zzAN.zzL(this.zzZ0i, zz3z.zzZ0i) && com.aspose.words.internal.zzAN.zzL(this.zzZ0k, zz3z.zzZ0k);
    }

    public final void zzXE(double d) {
        this.zzZ0i = d;
    }

    public final void zzXF(double d) {
        this.zzZ0j = d;
    }

    public final void zzXG(double d) {
        this.zzZ0h = d;
    }

    public final void zzXH(double d) {
        this.zzZ0k = d;
    }

    public final com.aspose.words.internal.zzZQ4 zzZu(com.aspose.words.internal.zzZQ4 zzzq4) {
        if (isEmpty()) {
            return zzzq4;
        }
        float width = zzzq4.getWidth();
        double d = width;
        double height = zzzq4.getHeight();
        return com.aspose.words.internal.zzZQ4.zzX((float) ((this.zzZ0j * d) + ((double) zzzq4.zzZm())), (float) ((this.zzZ0h * height) + ((double) zzzq4.zzZo())), (float) (((double) zzzq4.zzkw()) - (d * this.zzZ0i)), (float) (((double) zzzq4.zzZn()) - (height * this.zzZ0k)));
    }

    public final double zzZwE() {
        return this.zzZ0i;
    }

    public final double zzZwF() {
        return this.zzZ0j;
    }

    public final double zzZwG() {
        return this.zzZ0h;
    }

    public final double zzZwH() {
        return this.zzZ0k;
    }

    public final zz3Z zzZwI() {
        zz3Z zz3z = new zz3Z();
        zz3z.zzZ0h = this.zzZ0h;
        zz3z.zzZ0k = this.zzZ0k;
        zz3z.zzZ0j = this.zzZ0j;
        zz3z.zzZ0i = this.zzZ0i;
        return zz3z;
    }

    public zz3Z(double d, double d2, double d3, double d4) {
        this.zzZ0j = d;
        this.zzZ0h = d2;
        this.zzZ0i = d3;
        this.zzZ0k = d4;
    }

    public zz3Z(zz3Z zz3z) {
        this(zz3z.zzZ0j, zz3z.zzZ0h, zz3z.zzZ0i, zz3z.zzZ0k);
    }
}
