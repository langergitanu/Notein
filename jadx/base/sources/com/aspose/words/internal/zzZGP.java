package com.aspose.words.internal;

import OooOo.C20485OooOoO;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGP extends zzZH1 {
    public zzZGP(zzZDZ zzzdz, zzZGH zzzgh, int i, boolean z, boolean z2) {
        super(zzzdz, zzzgh, i, z, z2);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final int getValueType() {
        return 9;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final String zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2, boolean z) throws zzZQS {
        while (i < i2 && zzZF3.isSpaceChar(cArr[i])) {
            i++;
        }
        if (i >= i2) {
            return zzZ(zzzgj, "Empty NMTOKENS value");
        }
        StringBuilder sb = null;
        if (!z) {
            while (i < i2) {
                char c = cArr[i];
                if (!zzZF3.isSpaceChar(c) && !zzZF3.zzX(c, this.zzWOC, this.zzWOB)) {
                    return zzZ(zzzgj, c, "not valid as NMTOKENS character");
                }
                i++;
            }
            return null;
        }
        do {
            i2--;
            if (i2 <= i) {
                break;
            }
        } while (zzZF3.isSpaceChar(cArr[i2]));
        while (i <= i2) {
            int i3 = i;
            while (i3 <= i2) {
                char c2 = cArr[i3];
                if (zzZF3.isSpaceChar(c2)) {
                    break;
                }
                if (!zzZF3.zzX(c2, this.zzWOC, this.zzWOB)) {
                    return zzZ(zzzgj, c2, "not valid as an NMTOKENS character");
                }
                i3++;
            }
            if (sb == null) {
                sb = new StringBuilder((i2 - i) + 1);
            } else {
                sb.append(ControlChar.SPACE_CHAR);
            }
            sb.append(cArr, i, i3 - i);
            i = i3 + 1;
            while (i <= i2 && zzZF3.isSpaceChar(cArr[i])) {
                i++;
            }
        }
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zzZH1
    public final zzZH1 zzgY(int i) {
        return new zzZGP(this.zzWOF, this.zzWOD, i, this.zzWOC, this.zzWOB);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final void zzZ(zzZEV zzzev) throws zzZQS {
        int i;
        String value = this.zzWOD.getValue();
        int length = value.length();
        StringBuilder sb = null;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i2 < length) {
            char cCharAt = value.charAt(i2);
            while (zzZF3.isSpaceChar(cCharAt)) {
                i2++;
                if (i2 >= length) {
                    break loop0;
                } else {
                    cCharAt = value.charAt(i2);
                }
            }
            int i4 = i2 + 1;
            while (true) {
                i = i4 + 1;
                if (i >= length || zzZF3.isSpaceChar(value.charAt(i))) {
                    break;
                } else {
                    i4 = i;
                }
            }
            i3++;
            String strSubstring = value.substring(i2, i);
            int iZzI = zzZF3.zzI(strSubstring, this.zzWOC, this.zzWOB);
            if (iZzI >= 0) {
                StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(iZzI, "Invalid default value '", value, "'; character #", " (");
                sbOooO0OO.append(zzZF3.zzXl(value.charAt(iZzI)));
                sbOooO0OO.append(") not a valid NMTOKENS character");
                zzZ(zzzev, sbOooO0OO.toString());
            }
            if (sb == null) {
                sb = new StringBuilder((i - i2) + 32);
            } else {
                sb.append(ControlChar.SPACE_CHAR);
            }
            sb.append(strSubstring);
            i2 = i4 + 2;
        }
        if (i3 == 0) {
            zzZ(zzzev, "Invalid default value '" + value + "'; empty String is not a valid NMTOKENS value");
            return;
        }
        this.zzWOD.setValue(sb.toString());
    }
}
