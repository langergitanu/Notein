package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzQJ {
    private com.aspose.words.internal.zzZYG<zzKC> zzZqQ = new com.aspose.words.internal.zzZYG<>();

    private static int zzo(int i, boolean z) {
        if (i == 0) {
            return z ? 40 : 30;
        }
        if (i == 1) {
            return z ? 50 : 20;
        }
        if (i != 2) {
            return 0;
        }
        return z ? 60 : 10;
    }

    public final void clear() {
        this.zzZqQ.clear();
    }

    public final void zzY(zzPR zzpr) {
        for (zzKC zzkc : this.zzZqQ.zzCJ()) {
            zzpr.zzV(zzkc.zzZjD);
            String strZzZWo = zzkc.zzZjD.zzZWo();
            zzpr.zz7(strZzZWo, zzkc.zzZjA);
            if (zzkc.zzZjC == 2) {
                zzpr.zzSv(strZzZWo);
            }
        }
    }

    public final void zzZ(zzPS zzps, int i, zzMA zzma) {
        for (zzPT zzpt : zzps) {
            zzKC zzkc = this.zzZqQ.get(zzpt.zzZWo());
            boolean z = true;
            if (zzkc == null) {
                zzkc = new zzKC();
                this.zzZqQ.zzW(zzpt.zzZWo(), zzkc);
            } else {
                int iZzo = zzo(zzkc.zzZjC, zzkc.zzZjD.zzZWi());
                int iZzo2 = zzo(i, zzpt.zzZWi());
                if (iZzo2 <= iZzo && (iZzo2 != iZzo || zzma.zzY(zzkc.zzZjB) < 0)) {
                    z = false;
                }
            }
            if (z) {
                zzkc.zzZjD = zzpt;
                zzkc.zzZjC = i;
                zzkc.zzZjB = zzma;
                zzkc.zzZjA = zzps.zzSy(zzpt.zzZWo());
            }
        }
    }
}
