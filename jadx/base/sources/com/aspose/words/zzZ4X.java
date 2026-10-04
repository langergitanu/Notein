package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ4X extends zzTI {
    private static boolean zzD(String str, int i, int i2) {
        return (i2 - i) + 1 >= 2 && str.charAt(i2 + (-1)) != '\\' && str.charAt(i) == '<' && str.charAt(i2) == '>';
    }

    private static boolean zzE(String str, int i, int i2) {
        while (i2 >= 0 && zzZ1N.zzYz(str.charAt(i2))) {
            i2--;
        }
        int i3 = (i2 - i) + 1;
        if (i3 <= 0) {
            return true;
        }
        if (i3 < 2) {
            return false;
        }
        char cCharAt = str.charAt(i);
        if (!zzYI(cCharAt)) {
            return false;
        }
        int i4 = i2 - 1;
        if (str.charAt(i4) == '\\') {
            return false;
        }
        char cCharAt2 = str.charAt(i2);
        if (zzYH(cCharAt2)) {
            return cCharAt2 == (cCharAt == '(' ? ')' : cCharAt) && !zzZ1N.zzZ(str, i + 1, i4, cCharAt, cCharAt2);
        }
        return false;
    }

    private static boolean zzJd(String str) {
        zzKG zzkgZzRT = zzKG.zzRT(str);
        if (zzkgZzRT == null) {
            return false;
        }
        byte[] bArrZzZTv = zzkgZzRT.zzZTv();
        if (bArrZzZTv.length > 0) {
            return com.aspose.words.internal.zzEF.zzZD(bArrZzZTv);
        }
        return false;
    }

    private static boolean zzR(String str, int i, int i2) {
        return zzD(str, i, i2) ? !zzZ1N.zzZ(str, i + 1, i2 + (-1), '<', '>') && C22241OooO0Oo.OooO00o(i2, i, i, i, str).indexOf(11) < 0 : str.charAt(i) != '<' && zzZ1N.zzz(str, i, i2);
    }

    public static boolean zzS(String str, int i, int i2) {
        int iZzY = zzZ1N.zzY(str, '<', i, i2);
        int iZzY2 = iZzY == -1 ? -1 : zzZ1N.zzY(str, '>', iZzY, i2);
        int iZzA = zzZ1N.zzA(str, i, i2);
        int i3 = (iZzY < 0 || iZzY2 < 0 || iZzY > iZzA) ? iZzA : iZzY;
        if (i3 == -1) {
            return true;
        }
        if (iZzY < 0 || iZzY2 < 0 || iZzY > iZzA) {
            iZzY2 = zzZ1N.zzB(str, i3, i2);
        }
        if (iZzY2 == -1) {
            iZzY2 = i2;
        }
        if (!zzR(str, i3, iZzY2)) {
            return false;
        }
        int i4 = iZzY2 + 1;
        int iZzA2 = zzZ1N.zzA(str, i4, i2);
        if (iZzA2 != i4 || zzZ1N.zzB(str, i, i2) >= 0) {
            return iZzA2 == -1 || zzE(str, iZzA2, i2);
        }
        return false;
    }

    private static boolean zzYH(char c) {
        return c == '\"' || c == '\'' || c == ')';
    }

    private static boolean zzYI(char c) {
        return c == '\"' || c == '\'' || c == '(';
    }

    private String zzYPp() {
        String text = super.getText();
        int length = text.length() - 1;
        if (zzJd(text)) {
            return text.replace("\u000b", "%20");
        }
        int iZzY = zzZ1N.zzY(text, '<', 0, length);
        int iZzY2 = iZzY == -1 ? -1 : zzZ1N.zzY(text, '>', iZzY, length);
        int iZzA = zzZ1N.zzA(text, 0, length);
        if (iZzY >= 0 && iZzY2 >= 0 && iZzY <= iZzA) {
            int i = iZzY + 1;
            return text.substring(i, ((iZzY2 - iZzY) - 1) + i);
        }
        if (iZzA == -1) {
            return "";
        }
        int iZzB = zzZ1N.zzB(text, iZzA, length) - 1;
        if (iZzB >= 0) {
            length = iZzB;
        }
        if (zzD(text, iZzA, length)) {
            iZzA++;
            length--;
        }
        return text.substring(iZzA, (length - iZzA) + 1 + iZzA);
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final String getText() {
        return zzz((byte) 8) != null ? "" : super.getText();
    }

    public final String getTitle() {
        int iZzT;
        int iZzA;
        String text = super.getText();
        if (zzJd(text)) {
            return "";
        }
        String strZzYPp = zzYPp();
        if (strZzYPp.length() == 0 || (iZzT = com.aspose.words.internal.zzZKN.zzT(text, strZzYPp, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) < 0) {
            return "";
        }
        String strSubstring = text.substring((strZzYPp.length() + iZzT) - 1);
        int length = strSubstring.length() - 1;
        int iZzA2 = zzZ1N.zzA(strSubstring, 0, length);
        if (iZzA2 == -1) {
            return "";
        }
        int iZzB = zzZ1N.zzB(strSubstring, iZzA2, length);
        if (iZzB - 1 < 0 || (iZzA = zzZ1N.zzA(strSubstring, iZzB, length)) == -1) {
            return "";
        }
        while (zzZ1N.zzYz(strSubstring.charAt(length))) {
            length--;
        }
        int i = iZzA + 1;
        return com.aspose.words.internal.zzZKN.zzTX(zzZ1N.zzIv(strSubstring.substring(i, ((length - iZzA) - 1) + i)));
    }

    public final String getUri() {
        return com.aspose.words.internal.zzZVR.zzWv(zzZ1N.zzIt(zzYPp()));
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final void zzZ(zzZ1T zzz1t) {
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 1;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 10;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        zzY(zzyi);
        return true;
    }

    public static boolean zzZ(zzJZ zzjz, zzJZ zzjz2) {
        return zzJd(zzjz.getText().substring(zzjz.getEnd() + 1, ((zzjz2.getStart() - zzjz.getEnd()) + 1) + (zzjz.getEnd() + 1))) || zzS(zzjz.getText(), zzjz.getEnd() + 1, zzjz2.getStart() - 1);
    }
}
