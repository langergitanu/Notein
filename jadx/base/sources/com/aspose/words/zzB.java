package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzB {
    private ArrayList<com.aspose.words.internal.zzQG> zzKB = new ArrayList<>();
    protected com.aspose.words.internal.zzOU zzYs;
    private com.aspose.words.internal.zzQG zzZFH;
    private float zzZFI;
    protected float zzZFJ;
    protected float zzZFK;
    protected com.aspose.words.internal.zzPY zzZFL;

    public zzB(float f, float f2) {
        this.zzZFK = f;
        this.zzZFJ = f2;
    }

    private void flush() {
        com.aspose.words.internal.zzQG zzqg = this.zzZFH;
        if (zzqg != null) {
            zzV(zzqg);
            com.aspose.words.internal.zzZQG.zzZ(this.zzKB, this.zzZFH);
        }
    }

    private static void zzV(com.aspose.words.internal.zzQG zzqg) {
        boolean[] zArr = new boolean[zzqg.getCount()];
        zzZ(zzqg, zArr);
        for (int i = 0; i < zzqg.getCount(); i++) {
            com.aspose.words.internal.zzQD zzqdZzYi = zzqg.zzYi(i);
            if (zArr[i]) {
                zzqdZzYi.zzQq();
            } else {
                zzqdZzYi.zzQr();
            }
        }
    }

    public final void zz4(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zz0Q zz0q = new com.aspose.words.internal.zz0Q();
        zz0q.add(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()));
        zz0q.add(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo()));
        zz0q.add(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()));
        zz0q.add(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn()));
        zzY(zz0q, false);
    }

    public final void zzQ(com.aspose.words.internal.zzPY zzpy) {
        this.zzZFL = zzpy;
    }

    public final com.aspose.words.internal.zzQG[] zzQ9() {
        flush();
        this.zzZFH = null;
        com.aspose.words.internal.zzQG[] zzqgArr = (com.aspose.words.internal.zzQG[]) this.zzKB.toArray(new com.aspose.words.internal.zzQG[0]);
        this.zzKB = new ArrayList<>();
        return zzqgArr;
    }

    public final void zzX(com.aspose.words.internal.zzOU zzou) {
        this.zzYs = zzou;
    }

    public final void zzY(com.aspose.words.internal.zz0Q zz0q, boolean z) {
        com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD(zz0q.getCount(), z);
        for (int i = 0; i < zz0q.getCount(); i++) {
            long j = zz0q.get(i);
            zzqd.zzZ(new com.aspose.words.internal.zzQ9(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPY.zzYC(j), this.zzZFI));
        }
        if (this.zzZFH == null) {
            zzZ(0.0f, null, null);
        }
        this.zzZFH.zzZ(zzX(zzqd));
    }

    public final void zzZ(float f, com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzPY zzpy) {
        flush();
        this.zzZFI = f;
        com.aspose.words.internal.zzQG zzqg = new com.aspose.words.internal.zzQG(this.zzKB.size(), zzou, zzpy);
        this.zzZFH = zzqg;
        zzqg.zzY(this.zzZFL);
    }

    public final void zzZJ(float f) {
        zzZ(f, null, null);
    }

    private static com.aspose.words.internal.zzQD zzX(com.aspose.words.internal.zzQD zzqd) {
        if (zzqd.getCount() > 1) {
            com.aspose.words.internal.zzQ9 zzq9ZzYi = zzqd.zzYi(0);
            com.aspose.words.internal.zzQ9 zzq9ZzYi2 = zzqd.zzYi(zzqd.getCount() - 1);
            if (zzq9ZzYi.zzQb() == zzq9ZzYi2.zzQb() && zzq9ZzYi.zzYm() == zzq9ZzYi2.zzYm() && zzq9ZzYi.zzQa() == zzq9ZzYi2.zzQa()) {
                zzqd.removeAt(zzqd.getCount() - 1);
            }
        }
        return zzqd;
    }

    private static void zzZ(com.aspose.words.internal.zzQG zzqg, boolean[] zArr) {
        for (int i = 0; i < zzqg.getCount(); i++) {
            if (!zArr[i]) {
                com.aspose.words.internal.zzQD zzqdZzYi = zzqg.zzYi(i);
                for (int i2 = 0; i2 < zzqg.getCount(); i2++) {
                    zzZ(i, i2, zArr, zzqg, zzqdZzYi);
                }
            }
        }
    }

    private static void zzZ(int i, int i2, boolean[] zArr, com.aspose.words.internal.zzQG zzqg, com.aspose.words.internal.zzQD zzqd) {
        if (i == i2 || zArr[i2]) {
            return;
        }
        com.aspose.words.internal.zzQD zzqdZzYi = zzqg.zzYi(i2);
        if (zzqdZzYi.getCount() == 0) {
            return;
        }
        zArr[i2] = com.aspose.words.internal.zzJ6.zzZ(zzqdZzYi.zzYi(0), zzqd);
        for (int i3 = 1; i3 < zzqdZzYi.getCount() && zArr[i2]; i3++) {
            zArr[i2] = com.aspose.words.internal.zzJ6.zzZ(zzqdZzYi.zzYi(i3), zzqd);
        }
    }
}
