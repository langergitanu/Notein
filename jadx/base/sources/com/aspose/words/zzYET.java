package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYET {
    private int zzXi;
    private byte[] zzXr3;
    private boolean zzXr5;
    private int zzXr6;
    private boolean zzXr7;
    private String zzXr8;
    private int zzXra;
    private com.aspose.words.internal.zzZOR zzXrb = new com.aspose.words.internal.zzZOR();
    private StringBuilder zzXr9 = new StringBuilder();
    private StringBuilder zzXr4 = new StringBuilder();

    public zzYET() {
    }

    private void zzRd(String str) {
        this.zzXr4.setLength(0);
        com.aspose.words.internal.zzZNH.zzU(this.zzXr4, str);
    }

    private String zzVT(int i, int i2) {
        return this.zzXr4.substring(i, i2 + i);
    }

    private void zzXT(char c) {
        this.zzXr4.setLength(0);
        this.zzXr4.append(c);
    }

    public final int getLength() throws Exception {
        return (int) this.zzXrb.getLength();
    }

    public final String getName() throws Exception {
        if (this.zzXi != 1) {
            return "";
        }
        String str = this.zzXr8;
        if (str != null) {
            return str;
        }
        this.zzXrb.zzH(0L);
        this.zzXr9.setLength(0);
        int length = ((int) this.zzXrb.getLength()) - this.zzXra;
        for (int i = 0; i < length; i++) {
            this.zzXr9.append((char) this.zzXrb.zzRI());
        }
        String string = this.zzXr9.toString();
        this.zzXr8 = string;
        return string;
    }

    public final void reset(int i) throws Exception {
        this.zzXi = i;
        this.zzXrb.setLength(0L);
        this.zzXra = 0;
        this.zzXr8 = null;
        this.zzXr7 = false;
        this.zzXr6 = 0;
        this.zzXr4.setLength(0);
        this.zzXr3 = null;
        this.zzXr5 = false;
    }

    public final void writeByte(int i) throws Exception {
        this.zzXrb.writeByte((byte) i);
    }

    public final int zz0R() {
        return this.zzXr4.length();
    }

    public final void zzBG(String str) {
        com.aspose.words.internal.zzZNH.zzU(this.zzXr4, str);
    }

    public final void zzBH(String str) throws Exception {
        reset(1);
        for (int i = 0; i < str.length(); i++) {
            this.zzXrb.writeByte((byte) str.charAt(i));
        }
    }

    public final void zzJ(com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        zzRd(zzzo0.zzZn(this.zzXrb.zzWy()));
    }

    public final void zzRg(boolean z) {
        this.zzXr5 = z;
    }

    public final byte[] zzVU(int i, int i2) {
        return com.aspose.words.internal.zzZYD.zzXb(zzVT(i, i2));
    }

    public final void zzXM(byte[] bArr) {
        this.zzXr3 = bArr;
    }

    public final void zzXU(char c) throws Exception {
        reset(4);
        zzXT(c);
    }

    public final String zzYR() {
        return this.zzXr4.toString();
    }

    public final int zzYb() {
        return this.zzXi;
    }

    public final boolean zzYeS() {
        return this.zzXr5;
    }

    public final int zzYeT() throws Exception {
        int i;
        if (this.zzXr7) {
            return this.zzXr6;
        }
        this.zzXr7 = true;
        this.zzXr6 = 0;
        if (this.zzXra == 0) {
            return 0;
        }
        com.aspose.words.internal.zzZOR zzzor = this.zzXrb;
        zzzor.zzH(zzzor.getLength() - ((long) this.zzXra));
        boolean z = this.zzXrb.zzRI() == 45;
        if (z) {
            i = this.zzXra - 1;
        } else {
            i = this.zzXra;
            com.aspose.words.internal.zzZOR zzzor2 = this.zzXrb;
            zzzor2.zzH(zzzor2.getPosition() - 1);
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int iZzRI = this.zzXrb.zzRI();
            if (iZzRI == 46) {
                break;
            }
            int i3 = iZzRI - 48;
            int i4 = this.zzXr6;
            if (i4 > 214748364) {
                break;
            }
            int i5 = i4 * 10;
            this.zzXr6 = i5;
            if (i5 + i3 > Integer.MAX_VALUE) {
                break;
            }
            this.zzXr6 = i5 + i3;
        }
        if (z) {
            this.zzXr6 = -this.zzXr6;
        }
        return this.zzXr6;
    }

    public final boolean zzYeU() {
        return com.aspose.words.internal.zzZKN.zzW(this.zzXr4.toString(), ";", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    public final boolean zzYeV() {
        return this.zzXi == 1;
    }

    public final boolean zzYeW() {
        return ";".equals(this.zzXr4.toString());
    }

    public final String zzYeX() {
        String string = this.zzXr4.toString();
        return !zzYeU() ? string : androidx.core.content.OooO0OO.OooO00o(1, 0, string);
    }

    public final boolean zzYeY() throws Exception {
        if (this.zzXra != 1) {
            return true;
        }
        com.aspose.words.internal.zzZOR zzzor = this.zzXrb;
        zzzor.zzH(zzzor.getLength() - 1);
        return this.zzXrb.zzRI() != 48;
    }

    public final byte[] zzYeZ() {
        return com.aspose.words.internal.zzZYD.zzXb(this.zzXr4.toString());
    }

    public final void zzYf0() {
        this.zzXr8 = null;
        this.zzXr5 = false;
    }

    public final byte[] zzYf1() {
        return this.zzXr3;
    }

    public final int zzYf2() {
        return this.zzXra;
    }

    public final int zznH(int i) {
        return com.aspose.words.internal.zzZQK.zzA(zzVU(i, 8), 0);
    }

    public final void zznI(int i) {
        this.zzXra = i;
    }

    public zzYET(int i) {
        this.zzXi = i;
    }
}
