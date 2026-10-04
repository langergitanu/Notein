package com.aspose.words;

import com.aspose.words.ref.RefInt;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDA {
    com.aspose.words.internal.zzZO0 zzYjM;
    private zzZ zzYjN;
    private zzZ zzYjO;
    private zzZ zzYjP;
    private int zzYjR;
    private int zzYjS;
    private int zzYjT;
    private int zzYjU;
    private char[] zzYjV;
    private HashMap<String, String> zzYjW;
    private HashMap<String, String> zzYjX;
    static zzZDA zzYjY = new zzZDA();
    private static char[] zzYjQ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static class zzZ {
        private int zzYjR;
        private int zzYjS;
        private int zzYjT;
        private int zzYjU;
        private char[] zzYjV;
        private HashMap<String, String> zzYjW;
        private HashMap<String, String> zzYjX;

        public zzZ(HashMap<String, String> map, HashMap<String, String> map2, int i, int i2, int i3, int i4, char[] cArr) {
            this.zzYjX = map;
            this.zzYjW = map2;
            this.zzYjU = i;
            this.zzYjT = i2;
            this.zzYjS = i3;
            this.zzYjR = i4;
            this.zzYjV = cArr;
        }

        public final char[] zzYWY() {
            return this.zzYjV;
        }

        public final int zzYWZ() {
            return this.zzYjR;
        }

        public final int zzYX0() {
            return this.zzYjS;
        }

        public final int zzYX1() {
            return this.zzYjT;
        }

        public final int zzYX2() {
            return this.zzYjU;
        }

        public final HashMap<String, String> zzYX3() {
            return this.zzYjX;
        }

        public final HashMap<String, String> zzYX4() {
            return this.zzYjW;
        }
    }

    public zzZDA(String[] strArr, com.aspose.words.internal.zzZO0 zzzo0, IWarningCallback iWarningCallback) {
        this.zzYjX = new HashMap<>();
        this.zzYjM = zzzo0;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        boolean z2 = false;
        for (String str : strArr) {
            RefInt refInt = new RefInt(this.zzYjU);
            RefInt refInt2 = new RefInt(this.zzYjT);
            RefInt refInt3 = new RefInt(this.zzYjS);
            RefInt refInt4 = new RefInt(this.zzYjR);
            int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
            boolean z3 = com.aspose.words.internal.zzZKN.zzS(str, "%", i) || com.aspose.words.internal.zzZKN.zzS(str, "#", i) || zzZ(str, "LEFTHYPHENMIN", refInt) || zzZ(str, "RIGHTHYPHENMIN", refInt2) || zzZ(str, "COMPOUNDLEFTHYPHENMIN", refInt3) || zzZ(str, "COMPOUNDRIGHTHYPHENMIN", refInt4);
            this.zzYjU = refInt.get();
            this.zzYjT = refInt2.get();
            this.zzYjS = refInt3.get();
            this.zzYjR = refInt4.get();
            if (!z3) {
                if (com.aspose.words.internal.zzZKN.zzS(str, "NEXTLEVEL", i)) {
                    if (z) {
                        throw new IllegalArgumentException("Dictionary has an invalid format.");
                    }
                    this.zzYjW = this.zzYjX;
                    this.zzYjX = new HashMap<>();
                    z = true;
                } else if (com.aspose.words.internal.zzZKN.zzS(str, "NOHYPHEN", i)) {
                    String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzV(str.substring(8), ControlChar.SPACE_CHAR, '\t'), ',');
                    this.zzYjV = new char[strArrZzR.length];
                    for (int i2 = 0; i2 < strArrZzR.length; i2++) {
                        this.zzYjV[i2] = com.aspose.words.internal.zzZKN.zzX(strArrZzR[i2], new char[]{ControlChar.SPACE_CHAR, '\t'}).charAt(0);
                    }
                } else if (!str.contains("/")) {
                    String strZzY = zzY(str, sb);
                    if (!this.zzYjX.containsKey(strZzY)) {
                        com.aspose.words.internal.zzZQF.zzY(this.zzYjX, strZzY, str);
                    } else if (!z2 && iWarningCallback != null) {
                        iWarningCallback.warning(zzY20.zzM("Hyphenation dictionary contains duplicate patterns. The only first found pattern will be used. Content can be wrapped differently.", null));
                        z2 = true;
                    }
                }
            }
        }
        if (!z) {
            this.zzYjW = new HashMap<>();
            if (this.zzYjS == 0) {
                int i3 = this.zzYjU;
                this.zzYjS = i3 <= 0 ? 0 : i3;
            }
            if (this.zzYjR == 0) {
                int i4 = this.zzYjT;
                this.zzYjR = i4 <= 0 ? 0 : i4;
            }
            boolean zEquals = zzzo0.equals(com.aspose.words.internal.zzZO0.zzhV());
            char[] cArr = zEquals ? new char[4] : new char[2];
            this.zzYjV = cArr;
            cArr[0] = '\'';
            cArr[1] = '-';
            com.aspose.words.internal.zzZQF.zzY(this.zzYjW, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "1-1");
            com.aspose.words.internal.zzZQF.zzY(this.zzYjW, "'", "1'1");
            if (zEquals) {
                char[] cArr2 = this.zzYjV;
                cArr2[2] = 8211;
                cArr2[3] = 8217;
                com.aspose.words.internal.zzZQF.zzY(this.zzYjW, Character.toString((char) 8211), com.aspose.words.internal.zzZKN.format("1{0}1", (char) 8211));
                com.aspose.words.internal.zzZQF.zzY(this.zzYjW, Character.toString((char) 8217), com.aspose.words.internal.zzZKN.format("1{0}1", (char) 8217));
            }
        }
        if (this.zzYjU == 0) {
            this.zzYjU = 2;
        }
        if (this.zzYjT == 0) {
            this.zzYjT = 2;
        }
        this.zzYjP = new zzZ(this.zzYjX, this.zzYjW, this.zzYjU, this.zzYjT, this.zzYjS, this.zzYjR, this.zzYjV);
        this.zzYjO = new zzZ(this.zzYjX, this.zzYjW, 2, 3, 2, 2, null);
        this.zzYjN = new zzZ(this.zzYjX, this.zzYjW, 2, 2, 2, 2, null);
    }

    private static int[] zzY(String str, zzZ zzz, boolean z, boolean z2) {
        int iZzYX0 = zzz.zzYX0();
        int iZzYWZ = zzz.zzYWZ();
        int[] iArrZzZ = zzZ(str, zzz.zzYX3());
        if (!z) {
            for (int i = 0; i < iZzYX0 - 1 && i < iArrZzZ.length; i++) {
                iArrZzZ[i] = 0;
            }
        }
        if (!z2) {
            int length = str.length() - iZzYWZ;
            if (length <= 0) {
                length = 0;
            }
            while (length < str.length()) {
                iArrZzZ[length] = 0;
                length++;
            }
        }
        return iArrZzZ;
    }

    private static void zzZ(StringBuilder sb, zzZ zzz, int[] iArr, int i, boolean z) {
        if (sb.length() == 0) {
            return;
        }
        int i2 = 0;
        boolean z2 = true;
        boolean z3 = true;
        for (int i3 = 0; i3 < sb.length(); i3++) {
            z2 = z2 && Character.isLowerCase(sb.charAt(i3));
            z3 = z3 && Character.isUpperCase(sb.charAt(i3));
        }
        if (z && z3) {
            return;
        }
        String string = sb.toString();
        if (!z2) {
            string = string.toLowerCase();
        }
        int[] iArrZzYX5 = zzZ(string, zzz).zzYX5();
        int length = iArrZzYX5.length;
        while (i2 < length) {
            iArr[i] = iArrZzYX5[i2];
            i2++;
            i++;
        }
    }

    private zzZDB zzk(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        int[] iArr = new int[str.length()];
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            boolean zIsLetter = Character.isLetter(cCharAt);
            if (zIsLetter) {
                if (sb.length() == 0) {
                    i = i2;
                }
                sb.append(cCharAt);
            }
            if (!zIsLetter || i2 == str.length() - 1) {
                zzZ(sb, this.zzYjO, iArr, i, z);
                sb.setLength(0);
            }
        }
        return new zzZDB(str, iArr);
    }

    private zzZDB zzl(String str, boolean z) {
        int[] iArr = new int[str.length()];
        StringBuilder sb = new StringBuilder(str.length());
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isLetter(cCharAt) || cCharAt == '\'') {
                sb.append(cCharAt);
                z2 = true;
            } else {
                if (z2) {
                    break;
                }
                i++;
            }
        }
        zzZ(sb, this.zzYjN, iArr, i, z);
        return new zzZDB(str, iArr);
    }

    public final zzZDB zzQ(String str, boolean z, boolean z2) {
        return z ? zzk(str, z2) : zzl(str, z2);
    }

    public final boolean zzZk2() {
        return this == zzYjY;
    }

    private static String zzY(String str, StringBuilder sb) {
        sb.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private static zzZDB zzZ(String str, zzZ zzz) {
        int[] iArrZzZ = zzZ(str, zzz, true, true);
        for (int i = 0; i < zzz.zzYX2() - 1 && i < iArrZzZ.length; i++) {
            iArrZzZ[i] = 0;
        }
        int length = str.length() - zzz.zzYX1();
        if (length <= 0) {
            length = 0;
        }
        while (length < str.length()) {
            iArrZzZ[length] = 0;
            length++;
        }
        if (zzz.zzYWY() != null) {
            for (char c : zzz.zzYWY()) {
                int iIndexOf = str.indexOf(c);
                while (iIndexOf >= 0) {
                    iArrZzZ[iIndexOf] = 0;
                    if (iIndexOf > 0) {
                        iArrZzZ[iIndexOf - 1] = 0;
                    }
                    iIndexOf = str.indexOf(c, iIndexOf + 1);
                }
            }
        }
        return new zzZDB(str, iArrZzZ);
    }

    private static int[] zzZ(String str, HashMap<String, String> map) {
        String str2 = com.aspose.words.internal.zzZKN.format(".{0}.", str);
        int[] iArr = new int[str.length()];
        int i = 0;
        while (i < str2.length() - 1) {
            for (int i2 = i == 0 ? 2 : 1; i2 <= str2.length() - i; i2++) {
                String strSubstring = str2.substring(i, i + i2);
                if (map.containsKey(strSubstring)) {
                    String str3 = (String) com.aspose.words.internal.zzQW.zzZ(map, strSubstring);
                    for (int iZzW = com.aspose.words.internal.zzZKN.zzW(str2, strSubstring, 0, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8); iZzW != -1; iZzW = com.aspose.words.internal.zzZKN.zzW(str2, strSubstring, iZzW + 1, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                        int iZzZ = com.aspose.words.internal.zzZKN.zzZ(str3, zzYjQ, 0);
                        int i3 = 0;
                        while (iZzZ != -1) {
                            i3++;
                            int i4 = (iZzW + iZzZ) - i3;
                            if (i4 > 0) {
                                int iCharAt = str3.charAt(iZzZ) - '0';
                                int i5 = i4 - 1;
                                if (iArr[i5] < iCharAt) {
                                    iArr[i5] = iCharAt;
                                }
                            } else {
                                iZzZ = 1;
                            }
                            iZzZ = com.aspose.words.internal.zzZKN.zzZ(str3, zzYjQ, iZzZ + 1);
                        }
                    }
                }
            }
            i++;
        }
        return iArr;
    }

    private static int[] zzZ(String str, zzZ zzz, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        int[] iArrZzZ = zzZ(str, zzz.zzYX4());
        int i = 0;
        boolean z3 = false;
        for (int i2 = 0; i2 < iArrZzZ.length; i2++) {
            sb.append(str.charAt(i2));
            if (iArrZzZ[i2] % 2 == 1) {
                if (i2 == iArrZzZ.length - 1) {
                    break;
                }
                String string = sb.toString();
                if (string.length() > 1) {
                    int[] iArrZzZ2 = zzZ(string, zzz, z && i == 0, false);
                    for (int i3 = i; i3 < i2; i3++) {
                        iArrZzZ[i3] = iArrZzZ2[i3 - i];
                    }
                }
                sb.setLength(0);
                i = i2 + 1;
                z = false;
                z3 = true;
            }
        }
        if (!z3) {
            return zzY(str, zzz, z, z2);
        }
        String string2 = sb.toString();
        if (string2.length() > 1) {
            int[] iArrZzZ3 = zzZ(string2, zzz, false, z2);
            for (int i4 = i; i4 < iArrZzZ.length - 1; i4++) {
                iArrZzZ[i4] = iArrZzZ3[i4 - i];
            }
        }
        return iArrZzZ;
    }

    private static boolean zzZ(String str, String str2, RefInt refInt) {
        if (!com.aspose.words.internal.zzZKN.zzS(str, str2, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return false;
        }
        refInt.set(com.aspose.words.internal.zzJB.parseInt(str.substring(str2.length())));
        return true;
    }

    private zzZDA() {
        this.zzYjX = new HashMap<>();
    }
}
