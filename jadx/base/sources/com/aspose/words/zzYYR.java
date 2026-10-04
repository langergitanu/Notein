package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYR {
    private int mLength;
    private boolean zzXYx;
    private boolean zzZW9;
    private String zzZR = "";
    private int zzXYJ = 0;
    private String zzXYI = "";
    private String zzXYF = "";
    private String zzXYH = "";
    private String zzXYG = "";
    private String zzXYE = "";
    private String zzXYD = "";
    private String zzXYC = "";
    private String zzXYB = "";
    private String zzXYA = "";
    private String zzXYz = "";
    private String zzXYy = "";

    public zzYYR(int i) {
        this.mLength = i;
    }

    private static boolean zzYF(String str, String str2) {
        if (com.aspose.words.internal.zzZKN.zzS(str, str2, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return str.length() == str2.length() || str.charAt(str2.length()) == '/';
        }
        return false;
    }

    public final String getContentType() {
        return this.zzZR;
    }

    public final int getLength() {
        return this.mLength;
    }

    public final boolean isImage() {
        return zzYF(this.zzZR, "image") || zzYF(this.zzXYF, "image");
    }

    public final boolean isMixed() {
        return this.zzXYJ == 3;
    }

    public final boolean isSigned() {
        return this.zzXYJ == 4;
    }

    public final void setContentType(String str) {
        this.zzZR = str;
    }

    public final void zzHT(String str) {
        this.zzXYy = str;
    }

    public final void zzHU(String str) {
        this.zzXYz = str;
    }

    public final void zzHV(String str) {
        this.zzXYA = str;
    }

    public final void zzHW(String str) {
        this.zzXYB = str;
    }

    public final void zzHX(String str) {
        this.zzXYC = str;
    }

    public final void zzHY(String str) {
        this.zzXYD = str;
    }

    public final void zzHZ(String str) {
        this.zzXYE = str;
    }

    public final void zzI0(String str) {
        this.zzXYF = str;
    }

    public final void zzI1(String str) {
        this.zzXYG = str;
    }

    public final void zzI2(String str) {
        this.zzXYH = str;
    }

    public final void zzI3(String str) {
        this.zzXYI = str;
    }

    public final void zzSM(boolean z) {
        this.zzZW9 = z;
    }

    public final boolean zzYD1() {
        return "application/octet-stream".equals(this.zzZR);
    }

    public final boolean zzYD2() {
        return "text/plain".equals(this.zzZR);
    }

    public final boolean zzYD3() {
        return "text/html".equals(this.zzZR);
    }

    public final boolean zzYD4() {
        return zzYF(this.zzZR, "text");
    }

    public final void zzYD5() {
        this.zzXYx = true;
    }

    public final boolean zzYD6() {
        return this.zzXYJ == 1;
    }

    public final boolean zzYD7() {
        return this.zzXYJ == 2;
    }

    public final String zzYD8() {
        return this.zzXYy;
    }

    public final String zzYD9() {
        return this.zzXYz;
    }

    public final String zzYDa() {
        return this.zzXYA;
    }

    public final String zzYDb() {
        return this.zzXYB;
    }

    public final String zzYDc() {
        return this.zzXYC;
    }

    public final String zzYDd() {
        return this.zzXYD;
    }

    public final String zzYDe() {
        return this.zzXYE;
    }

    public final String zzYDf() {
        return this.zzXYH;
    }

    public final String zzYDg() {
        return this.zzXYI;
    }

    public final int zzYDh() {
        return this.zzXYJ;
    }

    public final boolean zzYDi() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzXYD) || this.zzXYx || com.aspose.words.internal.zzZYD.zzXk(this.zzXYC);
    }

    public final boolean zzYDj() {
        return (this.zzXYD.length() == 0 && this.zzXYC.length() == 0 && this.zzXYA.length() == 0) ? false : true;
    }

    public final boolean zzhL() {
        return this.zzZW9;
    }

    public final void zzub(int i) {
        this.zzXYJ = i;
    }
}
