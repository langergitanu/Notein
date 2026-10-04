package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJS {
    private com.aspose.words.internal.zzZXH zzA4;
    private boolean zzYsV;
    private boolean[] zzYsW = new boolean[65536];

    public zzZJS(com.aspose.words.internal.zzGQ zzgq, String str) {
        this.zzA4 = zzgq.zzO(str, 0);
        this.zzYsV = "Symbol".equals(str);
        for (int i = 0; i < 65536; i++) {
            this.zzYsW[i] = zzzZ(i);
        }
    }

    private static boolean zzA0(int i) {
        if (i < 0 || i > 31) {
            return i >= 128 && i <= 159;
        }
        return true;
    }

    private boolean zzzY(int i) {
        if (this.zzA4.zzpA() && i >= 32 && i <= 255) {
            return this.zzA4.zzpP().zzC(i + 61440, false);
        }
        return false;
    }

    private boolean zzzZ(int i) {
        com.aspose.words.internal.zzZXH zzzxh;
        if (this.zzYsV && i == 160) {
            return false;
        }
        if (i == 8194 || i == 8195) {
            i = 32;
        }
        return zzA0(i) || (zzzxh = this.zzA4) == null || zzzxh.zzpP().zzC(i, false) || zzzY(i);
    }

    public final boolean zzA1(int i) {
        boolean[] zArr = this.zzYsW;
        return i < zArr.length ? zArr[i] : zzzZ(i);
    }

    public final String zzZ(int i, com.aspose.words.internal.zzGQ zzgq) {
        if (this.zzYsV && i == 160) {
            return "Times New Roman";
        }
        com.aspose.words.internal.zzZXH zzzxhZzZ = zzgq.zzZ(this.zzA4, i, false);
        if (zzzxhZzZ != null) {
            return zzzxhZzZ.zzPh();
        }
        return null;
    }
}
