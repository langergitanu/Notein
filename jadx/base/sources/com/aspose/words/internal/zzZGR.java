package com.aspose.words.internal;

import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGR extends zzZH1 {
    public zzZGR(zzZDZ zzzdz, zzZGH zzzgh, int i, boolean z, boolean z2) {
        super(zzzdz, zzzgh, i, z, z2);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final int getValueType() {
        return 4;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final String zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2, boolean z) throws zzZQS {
        int i3 = i2;
        int i4 = i;
        while (i4 < i3 && zzZF3.isSpaceChar(cArr[i4])) {
            i4++;
        }
        if (i4 >= i3) {
            return zzZ(zzzgj, "Empty IDREFS value");
        }
        do {
            i3--;
            if (i3 <= i4) {
                break;
            }
        } while (zzZF3.isSpaceChar(cArr[i3]));
        zzZE2 zzze2ZzXOw = zzzgj.zzXOw();
        zzZQY zzzqyZzlj = zzzgj.zzlj();
        int i5 = i4;
        StringBuilder sb = null;
        String id = null;
        while (i5 <= i3) {
            char c = cArr[i5];
            if (!zzZF3.zzY(c, this.zzWOC, this.zzWOB)) {
                return zzZ(zzzgj, c, "not valid as the first IDREFS character");
            }
            int i6 = c;
            int i7 = i5 + 1;
            while (i7 <= i3) {
                char c2 = cArr[i7];
                if (zzZF3.isSpaceChar(c2)) {
                    break;
                }
                if (!zzZF3.zzX(c2, this.zzWOC, this.zzWOB)) {
                    return zzZ(zzzgj, c2, "not valid as an IDREFS character");
                }
                i6 = (i6 * 31) + c2;
                i7++;
            }
            zzZE3 zzze3ZzZ = zzze2ZzXOw.zzZ(cArr, i5, i7 - i5, i6, zzzqyZzlj, zzzgj.zzXOu(), this.zzWOF);
            int i8 = i7 + 1;
            if (z) {
                if (id == null) {
                    id = zzze3ZzZ.getId();
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(id);
                    }
                    id = zzze3ZzZ.getId();
                    sb.append(ControlChar.SPACE_CHAR);
                    sb.append(id);
                }
            }
            i5 = i8;
            while (i5 <= i3 && zzZF3.isSpaceChar(cArr[i5])) {
                i5++;
            }
        }
        if (z) {
            return sb != null ? sb.toString() : id;
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final zzZH1 zzgY(int i) {
        return new zzZGR(this.zzWOF, this.zzWOD, i, this.zzWOC, this.zzWOB);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final void zzZ(zzZEV zzzev) throws zzZQS {
        this.zzWOD.setValue(zzY(zzzev, true));
    }
}
