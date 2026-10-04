package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMZ extends zzTI {
    private int zzYwC;
    private int zzYwD;

    @Override // com.aspose.words.zzYI
    public final int zz9w() {
        return 2;
    }

    @Override // com.aspose.words.zzYI
    public final String zzL(String str, int i, int i2) {
        int i3;
        if ("".equals(zz9C()) || (i3 = this.zzYwD) == -1) {
            return "";
        }
        int i4 = this.zzYwC;
        return C22241OooO0Oo.OooO00o(i3, i4, i4, i4, str);
    }

    @Override // com.aspose.words.zzYI
    public final String zzM(String str, int i, int i2) {
        return ("".equals(zz9C()) || this.zzYwD == -1) ? "" : "]:";
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final void zzZ(zzZ1T zzz1t) {
    }

    @Override // com.aspose.words.zzYI
    public final String zzb(String str, int i) {
        int i2 = i + 2;
        if (i2 > str.length() || com.aspose.words.internal.zzZKN.zzZ(str, "[^", i, 2, com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8) == -1) {
            return "";
        }
        this.zzYwC = i2;
        return "[^";
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 3;
    }

    @Override // com.aspose.words.zzYI
    public final String zzc(String str, int i) {
        int i2;
        int iZzA;
        if ("".equals(zz9C())) {
            return "";
        }
        int iZzW = com.aspose.words.internal.zzZKN.zzW(str, "]:", this.zzYwC, com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8);
        this.zzYwD = iZzW;
        return (iZzW != -1 && (iZzA = zzZ1N.zzA(str, (i2 = iZzW + 2), str.length() + (-1))) > i2) ? C22241OooO0Oo.OooO00o(iZzA, i2, i2, i2, str) : "";
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        return zze(str, i) && !"".equals(zz9C()) && !"".equals(zz9B()) && zz9A().length() > 0 && zz9y() <= 3 && zzZMV.zzS(zz9A(), 0, zz9A().length() - 1);
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 22;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 22) {
            close();
            return false;
        }
        if (bZzkz != 24) {
            if (zzyi.zzkz() == 12) {
                zzyi = new zzZUF();
            }
            zzY(zzyi);
            return true;
        }
        if (isEmpty() || zzyi.zz9x() <= 3) {
            zzyi.setAction(2);
            return false;
        }
        zzY(zzyi);
        return true;
    }
}
