package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ5T extends zzY4K {
    private char zzYCT;
    private char[] zzYeZ;

    public zzZ5T(char[] cArr, char c, int i) {
        super(false, false, i);
        if (cArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: letterSet");
        }
        this.zzYeZ = cArr;
        this.zzYCT = c;
    }

    private int zzJt(String str) {
        if (str.length() != 1) {
            return -1;
        }
        int i = 0;
        while (true) {
            char[] cArr = this.zzYeZ;
            if (i >= cArr.length) {
                return -1;
            }
            if (cArr[i] == str.charAt(0)) {
                return i;
            }
            i++;
        }
    }

    @Override // com.aspose.words.zzY4K
    public final String zzPm(int i) {
        return "\u0000" + this.zzYCT;
    }

    @Override // com.aspose.words.zzY4K
    public final zzY4L zzTD(String str) {
        if (str.length() >= 2 && str.charAt(1) == this.zzYCT) {
            for (int i = 0; i < this.zzYeZ.length; i++) {
                char cCharAt = str.charAt(0);
                char c = this.zzYeZ[i];
                if (cCharAt == c) {
                    return new zzY4L(Character.toString(c), str.substring(0, 2));
                }
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzY4K
    public final String zzTE(String str) {
        int iZzJt = zzJt(str);
        if (iZzJt == -1) {
            return "";
        }
        char[] cArr = this.zzYeZ;
        return iZzJt == cArr.length + (-1) ? "" : Character.toString(cArr[iZzJt + 1]);
    }

    @Override // com.aspose.words.zzY4K
    public final boolean zzTF(String str) {
        return str.length() != 0 && str.charAt(0) == this.zzYeZ[0];
    }
}
