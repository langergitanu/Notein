package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz8N {
    private int zzVL;
    private int zzVN;
    private int zzZ5c;

    private zz8N(int i, int i2, int i3) {
        this.zzVL = i;
        this.zzVN = i2;
        this.zzZ5c = i3;
    }

    public static zz8N zzX(zz07 zz07Var) {
        return new zz8N((int) zz07Var.getWidth(), (int) zz07Var.getHeight(), (int) zz07Var.zzZCC().getValue());
    }

    public static zz8N zzZ(long j, zzHK zzhk) {
        return new zz8N(com.aspose.words.internal.zzSA.zzo(Float.intBitsToFloat((int) j)), com.aspose.words.internal.zzSA.zzo(com.aspose.words.internal.zzZPW.zzYz(j)), (int) zzhk.getValue());
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zz8N.class) {
            return false;
        }
        return zzZ((zz8N) obj);
    }

    public final int hashCode() {
        return (((this.zzVL * 397) ^ this.zzVN) * 397) ^ this.zzZ5c;
    }

    private boolean zzZ(zz8N zz8n) {
        return this.zzVL == zz8n.zzVL && this.zzVN == zz8n.zzVN && this.zzZ5c == zz8n.zzZ5c;
    }
}
