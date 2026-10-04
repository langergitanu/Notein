package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz2O extends zz2J {
    private zz0J zzZ3g;
    private int zzZFz;

    public zz2O(int i) {
        if (i != 0 && i != 8 && i != 1) {
            throw new IllegalArgumentException("DmlShape cannot be created with the specified DmlNodeType");
        }
        this.zzZFz = i;
    }

    @Override // com.aspose.words.zz2J, com.aspose.words.zz7S, com.aspose.words.zz53
    public final zz53 zzY(boolean z, zzZA5 zzza5) {
        zz2O zz2o = (zz2O) super.zzY(z, zzza5);
        zz0J zz0j = this.zzZ3g;
        if (zz0j != null) {
            zz2o.zzZ3g = zz0j.zzZsy();
        }
        return zz2o;
    }

    public final zz0J zzZAk() {
        return this.zzZ3g;
    }

    @Override // com.aspose.words.zz53
    public final int zzZHY() {
        return this.zzZFz;
    }

    public final zz10 zzZTl() {
        zz0J zz0j = this.zzZ3g;
        return zz0j != null ? zz0j.zzZCZ().zzZtK() : new zz10();
    }

    public final boolean zzZvu() {
        return zzZTl().zzZtH() instanceof zz2K;
    }

    public final boolean zzZvv() {
        return zzZTl().zzZts() == 2;
    }

    @Override // com.aspose.words.zz2J
    public final boolean zzZvw() {
        return com.aspose.words.internal.zzZYD.zzXk(zzZTf().zzZAO()) || zzZyb().zzY9o();
    }

    @Override // com.aspose.words.zz53
    public final boolean zzZyo() {
        if (!zzZyb().zzY9o()) {
            return true;
        }
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(zzZTh().zzZCC().zzZQQ());
        return !(com.aspose.words.internal.zzAN.zzL(dZzZJ, 45.0d) || com.aspose.words.internal.zzAN.zzL(dZzZJ, 90.0d) || com.aspose.words.internal.zzAN.zzL(dZzZJ, 270.0d)) || zzZTl().zzZtv();
    }

    public final void zzY(zz0J zz0j) {
        this.zzZ3g = zz0j;
    }
}
