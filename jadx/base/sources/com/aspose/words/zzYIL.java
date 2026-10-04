package com.aspose.words;

import com.google.firebase.firestore.local.SQLitePersistence;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
class zzYIL extends zzY4K {
    private int zzPm;
    private char zzYCT;
    private char[] zzYeZ;
    private com.aspose.words.internal.zzZNR zzZFn;

    public zzYIL(char[] cArr, char c, int i) {
        super(false, false, i);
        if (cArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: letterSet");
        }
        this.zzYeZ = cArr;
        this.zzYCT = c;
        this.zzPm = i;
        if (i == 1) {
            this.zzZFn = new com.aspose.words.internal.zzZNR("(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})", 0);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("numberStyle");
            }
            this.zzZFn = new com.aspose.words.internal.zzZNR("(?=[mdclxvi])m*(c[md]|d?c{0,3})(x[cl]|l?x{0,3})(i[xv]|v?i{0,3})", 0);
        }
    }

    private static int zzCF(String str) {
        HashMap map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String upperCase = str.toUpperCase();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < upperCase.length(); i3++) {
            int iIntValue = ((Integer) map.get(Character.valueOf(upperCase.charAt(i3)))).intValue() - i2;
            if (i3 >= upperCase.length() - 1 || i2 + iIntValue >= ((Integer) map.get(Character.valueOf(upperCase.charAt(i3 + 1)))).intValue()) {
                i += iIntValue;
                i2 = 0;
            } else {
                i2 = iIntValue;
            }
        }
        return i;
    }

    private String zzCG(String str) {
        return zzpk(zzCF(str) + 1);
    }

    private boolean zzCH(String str) {
        return this.zzZFn.zzUV(str);
    }

    private zzY4L zzT(String str, int i, String str2) {
        if (zzCH(str2)) {
            return new zzY4L(str2, com.aspose.words.internal.zzZKN.zzTX(str.substring(0, i + 1)));
        }
        return null;
    }

    private String zzpk(int i) {
        int[] iArr = {1000, SQLitePersistence.MAX_ARGS, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strArr = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int i2 = i;
        for (int i3 = 0; i3 < 13 && i2 != 0; i3++) {
            while (true) {
                int i4 = iArr[i3];
                if (i2 >= i4) {
                    i2 -= i4;
                    com.aspose.words.internal.zzZNH.zzU(sb, strArr[i3]);
                }
            }
        }
        return this.zzPm == 1 ? sb.toString() : sb.toString().toLowerCase();
    }

    @Override // com.aspose.words.zzY4K
    public final String zzPm(int i) {
        return "\u0000" + this.zzYCT;
    }

    @Override // com.aspose.words.zzY4K
    public final zzY4L zzTD(String str) {
        if (str.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == this.zzYCT) {
                return zzT(str, i, sb.toString());
            }
            char[] cArr = this.zzYeZ;
            if (com.aspose.words.internal.zzZKV.zzZ(cArr, cCharAt, 0, cArr.length) == -1) {
                return null;
            }
            sb.append(cCharAt);
        }
        return null;
    }

    @Override // com.aspose.words.zzY4K
    public final String zzTE(String str) {
        return zzCH(str) ? zzCG(str) : "";
    }

    @Override // com.aspose.words.zzY4K
    public final boolean zzTF(String str) {
        return str.length() != 0 && str.charAt(0) == this.zzYeZ[0];
    }
}
