package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGX extends zzZH1 {
    public zzZGX(zzZDZ zzzdz, zzZGH zzzgh, int i, boolean z, boolean z2) {
        super(zzzdz, zzzgh, i, z, z2);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final int getValueType() {
        return 5;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final String zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2, boolean z) throws zzZQS {
        while (i < i2 && zzZF3.isSpaceChar(cArr[i])) {
            i++;
        }
        if (i >= i2) {
            return zzZ(zzzgj, "Empty ENTITY value");
        }
        do {
            i2--;
            if (i2 <= i) {
                break;
            }
        } while (zzZF3.isSpaceChar(cArr[i2]));
        char c = cArr[i];
        if (!zzZF3.zzY(c, this.zzWOC, this.zzWOB) && c != ':') {
            return zzZ(zzzgj, c, "not valid as the first ID character");
        }
        for (int i3 = i + 1; i3 <= i2; i3++) {
            char c2 = cArr[i3];
            if (!zzZF3.zzX(c2, this.zzWOC, this.zzWOB)) {
                return zzZ(zzzgj, c2, "not valid as an ID character");
            }
        }
        zzZG3 zzzg3ZzZ = zzZ(zzzgj, cArr, i, (i2 - i) + 1);
        if (z) {
            return zzzg3ZzZ.getName();
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final zzZH1 zzgY(int i) {
        return new zzZGX(this.zzWOF, this.zzWOD, i, this.zzWOC, this.zzWOB);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final void zzZ(zzZEV zzzev) throws zzZQS {
        String strZzZ = zzZ(zzzev, true);
        this.zzWOD.setValue(strZzZ);
        zzZH1.zzZ(zzzev, strZzZ, ((zzZGD) zzzev).zzy2(strZzZ));
    }
}
