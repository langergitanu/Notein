package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGT extends zzZH1 {
    public zzZGT(zzZDZ zzzdz, zzZGH zzzgh, int i, boolean z, boolean z2) {
        super(zzzdz, zzzgh, i, z, z2);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final int getValueType() {
        return 2;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final String zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2, boolean z) throws zzZQS {
        int i3 = i;
        while (i3 < i2 && zzZF3.isSpaceChar(cArr[i3])) {
            i3++;
        }
        if (i3 >= i2) {
            return zzZ(zzzgj, "Empty ID value");
        }
        do {
            i2--;
            if (i2 <= i3) {
                break;
            }
        } while (zzZF3.isSpaceChar(cArr[i2]));
        char c = cArr[i3];
        if (!zzZF3.zzY(c, this.zzWOC, this.zzWOB)) {
            return zzZ(zzzgj, c, "not valid as the first ID character");
        }
        int i4 = c;
        for (int i5 = i3 + 1; i5 <= i2; i5++) {
            char c2 = cArr[i5];
            if (!zzZF3.zzX(c2, this.zzWOC, this.zzWOB)) {
                return zzZ(zzzgj, c2, "not valid as an ID character");
            }
            i4 = (i4 * 31) + c2;
        }
        zzZE2 zzze2ZzXOw = zzzgj.zzXOw();
        zzZDZ zzzdzZzXOu = zzzgj.zzXOu();
        zzZQY zzzqyZzlj = zzzgj.zzlj();
        zzZE3 zzze3ZzY = zzze2ZzXOw.zzY(cArr, i3, (i2 - i3) + 1, i4, zzzqyZzlj, zzzdzZzXOu, this.zzWOF);
        if (zzze3ZzY.zzlj() == zzzqyZzlj) {
            if (z) {
                return zzze3ZzY.getId();
            }
            return null;
        }
        return zzZ(zzzgj, "Duplicate id '" + zzze3ZzY.getId() + "', first declared at " + zzze3ZzY.zzlj());
    }

    @Override // com.aspose.words.internal.zzZH1
    public final zzZH1 zzgY(int i) {
        return new zzZGT(this.zzWOF, this.zzWOD, i, this.zzWOC, this.zzWOB);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final void zzZ(zzZEV zzzev) {
        throw new IllegalStateException(zzZH9.zzWPK);
    }
}
