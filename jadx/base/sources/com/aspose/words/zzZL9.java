package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZL9 implements Comparable<zzZL9> {
    int zzCu;
    private int zzYuk;
    int zzYul;
    int zzYum;
    int zzYun;
    int zzYuo;
    int zzYup;
    int zzYuq;
    boolean zzYur;
    PreferredWidth zzYus;
    int zzYut;
    int zzYuu;

    public zzZL9(zzWV zzwv, int i, int i2, int i3) {
        this.zzYus = PreferredWidth.AUTO;
        this.zzYuu = i;
        this.zzYuk = i2;
        this.zzYur = zzwv.zz6o() != null;
        zzZ3B zzz3b = (zzZ3B) zzwv.zzYTt();
        if (i3 == 0) {
            this.zzYut = zzwv.zz6q();
            this.zzYus = zzz3b.zzYMZ();
            this.zzYum = zzz3b.getLeftPadding() / 50;
            this.zzYul = zzz3b.getRightPadding() / 50;
            this.zzYuo = (zzz3b.zzYMV().zzwz(1).zzYN3() / 50) / 2;
            this.zzYun = (zzz3b.zzYMV().zzwz(2).zzYN3() / 50) / 2;
            return;
        }
        if (i3 < 0) {
            zzwv.zzYTm();
            zzwv.zza5();
            this.zzYut = zzwv.zza5().zzYka();
            this.zzYus = PreferredWidth.AUTO;
            this.zzYum = 0;
            this.zzYul = 0;
            this.zzYuo = 0;
            this.zzYun = (zzz3b.zzYMV().zzwz(1).zzYN3() / 50) / 2;
            return;
        }
        ((zzWV) zzwv.zzYTp()).zzYTn();
        zzwv.zza5();
        this.zzYut = zzwv.zza5().zzYk8();
        this.zzYus = PreferredWidth.AUTO;
        this.zzYum = 0;
        this.zzYul = 0;
        this.zzYuo = (zzz3b.zzYMV().zzwz(2).zzYN3() / 50) / 2;
        this.zzYun = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzZL9 zzzl9) {
        int i = this.zzYut;
        int i2 = zzzl9.zzYut;
        if (i != i2) {
            return com.aspose.words.internal.zzZKR.zzZ7(i, i2);
        }
        int i3 = this.zzYuk;
        int i4 = zzzl9.zzYuk;
        return i3 != i4 ? com.aspose.words.internal.zzZKR.zzZ7(i3, i4) : com.aspose.words.internal.zzZKR.zzZ7(this.zzYuu, zzzl9.zzYuu);
    }
}
