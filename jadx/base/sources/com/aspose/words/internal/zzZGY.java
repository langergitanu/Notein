package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGY extends zzZH1 {
    public zzZGY(zzZDZ zzzdz, zzZGH zzzgh, int i, boolean z, boolean z2) {
        super(zzzdz, zzzgh, i, z, z2);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final int getValueType() {
        return 6;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final String zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2, boolean z) throws zzZQS {
        while (i < i2 && zzZF3.isSpaceChar(cArr[i])) {
            i++;
        }
        if (i >= i2) {
            return zzZ(zzzgj, "Empty ENTITIES value");
        }
        do {
            i2--;
            if (i2 <= i) {
                break;
            }
        } while (zzZF3.isSpaceChar(cArr[i2]));
        StringBuilder sb = null;
        String name = null;
        while (i <= i2) {
            char c = cArr[i];
            if (!zzZF3.zzY(c, this.zzWOC, this.zzWOB)) {
                return zzZ(zzzgj, c, "not valid as the first ENTITIES character");
            }
            int i3 = i + 1;
            while (i3 <= i2) {
                char c2 = cArr[i3];
                if (zzZF3.isSpaceChar(c2)) {
                    break;
                }
                if (!zzZF3.zzX(c2, this.zzWOC, this.zzWOB)) {
                    return zzZ(zzzgj, c2, "not valid as an ENTITIES character");
                }
                i3++;
            }
            zzZG3 zzzg3ZzZ = zzZ(zzzgj, cArr, i, i3 - i);
            int i4 = i3 + 1;
            if (z) {
                if (name == null) {
                    name = zzzg3ZzZ.getName();
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(name);
                    }
                    name = zzzg3ZzZ.getName();
                    sb.append(ControlChar.SPACE_CHAR);
                    sb.append(name);
                }
            }
            i = i4;
            while (i <= i2 && zzZF3.isSpaceChar(cArr[i])) {
                i++;
            }
        }
        if (z) {
            return sb != null ? sb.toString() : name;
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final zzZH1 zzgY(int i) {
        return new zzZGY(this.zzWOF, this.zzWOD, i, this.zzWOC, this.zzWOB);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final void zzZ(zzZEV zzzev) throws zzZQS {
        String strZzY = zzY(zzzev, true);
        this.zzWOD.setValue(strZzY);
        StringTokenizer stringTokenizer = new StringTokenizer(strZzY);
        zzZGD zzzgd = (zzZGD) zzzev;
        while (stringTokenizer.hasMoreTokens()) {
            zzZH1.zzZ(zzzev, strZzY, zzzgd.zzy2(stringTokenizer.nextToken()));
        }
    }
}
