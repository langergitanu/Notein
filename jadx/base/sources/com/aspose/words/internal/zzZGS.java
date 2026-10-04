package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGS extends zzZH1 {
    public zzZGS(zzZDZ zzzdz, zzZGH zzzgh, int i, boolean z, boolean z2) {
        super(zzzdz, zzzgh, i, z, z2);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final int getValueType() {
        return 3;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final String zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2, boolean z) throws zzZQS {
        int i3 = i;
        while (i3 < i2 && zzZF3.isSpaceChar(cArr[i3])) {
            i3++;
        }
        if (i3 >= i2) {
            return zzZ(zzzgj, "Empty IDREF value");
        }
        do {
            i2--;
            if (i2 <= i3) {
                break;
            }
        } while (zzZF3.isSpaceChar(cArr[i2]));
        char c = cArr[i3];
        if (!zzZF3.zzY(c, this.zzWOC, this.zzWOB)) {
            return zzZ(zzzgj, c, "not valid as the first IDREF character");
        }
        int i4 = c;
        for (int i5 = i3 + 1; i5 <= i2; i5++) {
            char c2 = cArr[i5];
            if (!zzZF3.zzX(c2, this.zzWOC, this.zzWOB)) {
                return zzZ(zzzgj, c2, "not valid as an IDREF character");
            }
            i4 = (i4 * 31) + c2;
        }
        zzZE3 zzze3ZzZ = zzzgj.zzXOw().zzZ(cArr, i3, (i2 - i3) + 1, i4, zzzgj.zzlj(), zzzgj.zzXOu(), this.zzWOF);
        if (z) {
            return zzze3ZzZ.getId();
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final zzZH1 zzgY(int i) {
        return new zzZGS(this.zzWOF, this.zzWOD, i, this.zzWOC, this.zzWOB);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final void zzZ(zzZEV zzzev) throws zzZQS {
        this.zzWOD.setValue(zzZ(zzzev, true));
    }
}
