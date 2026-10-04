package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzKG {
    private static zzKG zzZjK = new zzKG(new byte[0], "");
    private byte[] zzTZ;
    private String zzZjL;

    private zzKG(byte[] bArr, String str) {
        this.zzTZ = bArr;
        this.zzZjL = str;
    }

    public static zzKG zzRT(String str) {
        if (str == null) {
            return null;
        }
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str);
        if (!com.aspose.words.internal.zzZKN.zzS(strZzTX, "data:", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            return null;
        }
        int iIndexOf = strZzTX.indexOf(44, 5);
        if (iIndexOf < 0) {
            return zzZjK;
        }
        String strSubstring = strZzTX.substring(iIndexOf + 1);
        if (strSubstring.length() == 0) {
            return zzZjK;
        }
        String strZzWt = com.aspose.words.internal.zzZVR.zzWt(strSubstring);
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(strZzTX.substring(5, iIndexOf), ';');
        boolean z = false;
        String strZzU2 = "";
        for (int i = 1; i < strArrZzR.length; i++) {
            String str2 = strArrZzR[i];
            if (com.aspose.words.internal.zzZKN.zzX(com.aspose.words.internal.zzZKN.zzTX(str2), "base64", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                z = true;
            } else {
                int iIndexOf2 = str2.indexOf(61);
                if (iIndexOf2 < 0) {
                    continue;
                } else {
                    if (iIndexOf2 > 0 && iIndexOf2 == str2.length() - 1) {
                        return zzZjK;
                    }
                    if ("".equals(strZzU2) && "charset".equals(com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZVR.zzWt(str2.substring(0, iIndexOf2))))) {
                        strZzU2 = com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZVR.zzWt(str2.substring(iIndexOf2 + 1)));
                    }
                }
            }
        }
        return z ? zzZp(strZzWt, strZzU2) : zzZo(strZzWt, strZzU2);
    }

    private static com.aspose.words.internal.zzZO0 zzV3(String str) {
        try {
            return com.aspose.words.internal.zzZO0.zzV3(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static zzKG zzZo(String str, String str2) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 255) {
                return zzZjK;
            }
            bArr[i] = (byte) cCharAt;
        }
        return new zzKG(bArr, str2);
    }

    private static zzKG zzZp(String str, String str2) {
        byte[] bArrZzX5 = com.aspose.words.internal.zzZYD.zzX5(str);
        return bArrZzX5.length == 0 ? zzZjK : new zzKG(bArrZzX5, str2);
    }

    public final byte[] getData() {
        return this.zzTZ;
    }

    public final byte[] zzZTv() {
        com.aspose.words.internal.zzZO0 zzzo0ZzV3;
        byte[] bArr = this.zzTZ;
        return (!com.aspose.words.internal.zzZYD.zzXk(this.zzZjL) || (zzzo0ZzV3 = zzV3(this.zzZjL)) == null || zzzo0ZzV3.equals(com.aspose.words.internal.zzZO0.zzhV())) ? bArr : com.aspose.words.internal.zzZO0.zzZ(zzzo0ZzV3, com.aspose.words.internal.zzZO0.zzhV(), bArr);
    }
}
