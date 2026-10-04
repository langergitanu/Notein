package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGQ extends zzZH1 {
    public zzZGQ(zzZDZ zzzdz, zzZGH zzzgh, int i, boolean z, boolean z2) {
        super(zzzdz, zzzgh, i, z, z2);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final int getValueType() {
        return 8;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final String zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2, boolean z) throws zzZQS {
        int i3;
        int i4 = i2 - i;
        while (i < i2 && zzZF3.isSpaceChar(cArr[i])) {
            i++;
        }
        if (i >= i2) {
            return zzZ(zzzgj, "Empty NMTOKEN value");
        }
        do {
            i2--;
            if (i2 <= i) {
                break;
            }
        } while (zzZF3.isSpaceChar(cArr[i2]));
        for (int i5 = i; i5 <= i2; i5++) {
            char c = cArr[i5];
            if (!zzZF3.zzX(c, this.zzWOC, this.zzWOB)) {
                return zzZ(zzzgj, c, "not valid NMTOKEN character");
            }
        }
        if (!z || (i3 = (i2 - i) + 1) == i4) {
            return null;
        }
        return new String(cArr, i, i3);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final zzZH1 zzgY(int i) {
        return new zzZGQ(this.zzWOF, this.zzWOD, i, this.zzWOC, this.zzWOB);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final void zzZ(zzZEV zzzev) throws zzZQS {
        this.zzWOD.setValue(zzX(zzzev, true));
    }
}
