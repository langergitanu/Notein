package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZPA {
    private int zzYBp;
    private boolean zzYBq;
    private boolean zzYBr;

    public zzZPA(int i) {
        this.zzYBp = i;
    }

    private boolean zzW(char c, int i, int i2) {
        if (!zzZP8.zzXG(this.zzYBp, 2)) {
            return false;
        }
        if (i == 0 || i == i2 - 1) {
            return zzZQT.zzk(c);
        }
        return false;
    }

    private zzYIU zzX(zzYIU zzyiu) {
        int length = zzyiu.getLength();
        zzYIS zzyisZzZ = null;
        for (int i = 0; i < length; i++) {
            zzYIV zzyivZzpn = zzyiu.zzpn(i);
            if (zzyivZzpn.zzFM() == '\\') {
                if (this.zzYBr || (!zzZP8.zzXG(this.zzYBp, 1) && this.zzYBq)) {
                    zzyisZzZ = zzZ(zzyisZzZ, zzyivZzpn, i);
                }
                this.zzYBr = !this.zzYBr;
            } else if (!zzZ(zzyivZzpn.zzFM(), i, length, false, false)) {
                zzYIS zzyisZzZ2 = zzZ(zzyisZzZ, zzyivZzpn, i);
                this.zzYBr = false;
                zzyisZzZ = zzyisZzZ2;
            }
        }
        return zzyisZzZ != null ? zzyisZzZ.zzYkq() : zzYIU.zzXxD;
    }

    public static String zzZ(String str, zzYWB zzywb, boolean z) {
        return zzZOO.zzM(zzywb) ? str : new zzZPA(zzZP8.zzO(1, 2, z)).zzV(str, false, false);
    }

    public final String zzV(String str, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int length = str.length();
        StringBuilder sbZzY = null;
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\\' || z) {
                z3 = z;
                z4 = z2;
                if (!zzZ(cCharAt, i, length, z3, z4)) {
                    StringBuilder sbZzY2 = zzY(sbZzY, cCharAt, i);
                    this.zzYBr = false;
                    sbZzY = sbZzY2;
                }
            } else {
                if (this.zzYBr || (!zzZP8.zzXG(this.zzYBp, 1) && this.zzYBq)) {
                    sbZzY = zzY(sbZzY, cCharAt, i);
                }
                this.zzYBr = !this.zzYBr;
                z3 = z;
                z4 = z2;
            }
            i++;
            z = z3;
            z2 = z4;
        }
        return sbZzY != null ? sbZzY.toString() : "";
    }

    public final void zzVS(boolean z) {
        this.zzYBr = false;
    }

    public StringBuilder zzY(StringBuilder sb, char c, int i) {
        if (sb == null) {
            sb = new StringBuilder();
        }
        zzZbE();
        sb.append(c);
        return sb;
    }

    public final boolean zzZbB() {
        return this.zzYBq;
    }

    public final boolean zzZbC() {
        return this.zzYBr;
    }

    public boolean zzZbD() {
        return false;
    }

    public final void zzZbE() {
        if (this.zzYBq || zzZbD()) {
            return;
        }
        this.zzYBq = true;
    }

    public static zzYIU zzZ(zzYIU zzyiu, zzYWB zzywb, boolean z) {
        return zzZOO.zzM(zzywb) ? zzyiu : new zzZPA(zzZP8.zzO(1, 2, z)).zzX(zzyiu);
    }

    public zzYIS zzZ(zzYIS zzyis, zzYIV zzyiv, int i) {
        if (zzyis == null) {
            zzyis = new zzYIS();
        }
        zzZbE();
        return zzyis.zzZ(zzyiv);
    }

    private boolean zzZ(char c, int i, int i2, boolean z, boolean z2) {
        if (this.zzYBr || z) {
            return false;
        }
        if (z2 && zzZP8.zzXG(this.zzYBp, 4)) {
            return false;
        }
        return zzW(c, i, i2);
    }
}
