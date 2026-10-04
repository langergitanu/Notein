package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYI {
    private zzTI zzZD4;
    private int zzoJ;
    private boolean zzqt = true;
    private String zzZD3 = "";
    private String zzZD2 = "";
    private String zzZD1 = "";
    private String zzZD0 = "";
    private String zzZCZ = "";

    public final void close() {
        this.zzqt = false;
    }

    public final int getAction() {
        return this.zzoJ;
    }

    public final int getIndex() {
        if (this.zzZD4 == null) {
            return -1;
        }
        for (int i = 0; i < this.zzZD4.getCount(); i++) {
            if (this.zzZD4.zzMH(i) == this) {
                return i;
            }
        }
        return -1;
    }

    public int getLength() {
        return this.zzZCZ.length() + this.zzZD0.length() + this.zzZD1.length() + this.zzZD2.length() + this.zzZD3.length();
    }

    public String getText() {
        return this.zzZD1;
    }

    public final boolean isOpened() {
        return this.zzqt;
    }

    public final void open() {
        this.zzqt = true;
    }

    public final void remove() {
        zzTI zzti = this.zzZD4;
        if (zzti != null) {
            zzti.zzX(this);
        }
    }

    public final void setAction(int i) {
        this.zzoJ = i;
    }

    public final String zz9A() {
        return this.zzZD1;
    }

    public final String zz9B() {
        return this.zzZD0;
    }

    public final String zz9C() {
        return this.zzZD2;
    }

    public final String zz9D() {
        return this.zzZD3;
    }

    public final boolean zz9E() {
        return zzYE(26, 27) != null;
    }

    public final boolean zz9F() {
        return zzz((byte) 18) != null;
    }

    public final zzYI zz9G() {
        int index = getIndex() + 1;
        if (index < this.zzZD4.getCount()) {
            return this.zzZD4.zzMH(index);
        }
        return null;
    }

    public final zzYI zz9H() {
        int index = getIndex() - 1;
        if (index < 0) {
            return null;
        }
        return this.zzZD4.zzMH(index);
    }

    public final boolean zz9I() {
        zzTI zzti = this.zzZD4;
        return zzti != null && zzti.zzMH(0) == this;
    }

    public final zzTI zz9J() {
        return this.zzZD4;
    }

    public final void zz9K() {
        this.zzqt = !this.zzqt;
    }

    public final void zz9L() {
        this.zzZD3 = null;
        this.zzZD2 = null;
        this.zzZD1 = null;
        this.zzZD0 = null;
        this.zzZCZ = null;
    }

    public final void zz9M() {
        for (zzTI zzti = this.zzZD4; zzti != null; zzti = zzti.zzZD4) {
            if (zzti.zzkz() == 18) {
                zzti.zz9K();
            }
        }
    }

    public final void zz9N() {
        for (zzTI zzti = this.zzZD4; zzti != null && zzti.zzkz() == 18; zzti = zzti.zzZD4) {
            zzti.zzqt = false;
        }
    }

    public final void zz9O() {
        for (zzTI zzti = this.zzZD4; zzti != null; zzti = zzti.zzZD4) {
            if (zzti.zzkz() == 18) {
                zzti.zzqt = true;
            }
        }
    }

    public boolean zz9v() {
        return false;
    }

    public int zz9w() {
        return Integer.MAX_VALUE;
    }

    public final int zz9x() {
        int iZzXf = com.aspose.words.internal.zzZYD.zzXf(this.zzZD1);
        return iZzXf == -1 ? this.zzZD1.length() : zzZ1N.zzIx(this.zzZD1.substring(0, iZzXf));
    }

    public final int zz9y() {
        return zzZ1N.zzIx(this.zzZD3);
    }

    public final int zz9z() {
        return zzZ1N.zzIx(this.zzZD2);
    }

    public String zzL(String str, int i, int i2) {
        int i3 = (i2 - i) + 1;
        return i3 > 0 ? str.substring(i, i3 + i) : "";
    }

    public String zzM(String str, int i, int i2) {
        int i3;
        int i4 = i2;
        while (i4 >= i && zzZv(str.charAt(i4))) {
            i4--;
        }
        if (i4 < 0 || !com.aspose.words.internal.zzZYD.zzZ1(str.charAt(i4)) || (i3 = i2 - i4) <= 0) {
            return "";
        }
        int i5 = i4 + 1;
        return str.substring(i5, i3 + i5);
    }

    public final void zzTm(String str) {
        this.zzZD3 = str;
    }

    public final zzYI zzYC(byte... bArr) {
        zzTI zzti = this.zzZD4;
        while (zzti != null) {
            for (int index = (zzti == this.zzZD4 ? getIndex() : zzti.getCount()) - 1; index >= 0; index--) {
                zzYI zzyiZzMH = zzti.zzMH(index);
                if (zzyiZzMH.zzYD(bArr) && zzyiZzMH.zzqt) {
                    return zzyiZzMH;
                }
            }
            zzti = zzti.zzZD4;
        }
        return null;
    }

    public final boolean zzYD(byte... bArr) {
        for (byte b : bArr) {
            if (zzkz() == b) {
                return true;
            }
        }
        return false;
    }

    public final zzTI zzYE(byte... bArr) {
        for (zzTI zzti = this.zzZD4; zzti != null; zzti = zzti.zzZD4) {
            if (zzti.zzYD(bArr)) {
                return zzti;
            }
        }
        return null;
    }

    public final zzTI zzYS(boolean z) {
        zzTI zzti = null;
        for (zzTI zzti2 = this.zzZD4; zzti2 != null; zzti2 = zzti2.zzZD4) {
            if (zzti2.zzkz() == 18 && zzti2.zzqt == z) {
                zzti = zzti2;
            }
        }
        return zzti;
    }

    public final zzTI zzYT(boolean z) {
        for (zzTI zzti = this.zzZD4; zzti != null; zzti = zzti.zzZD4) {
            if (zzti.zzkz() == 18 && zzti.zzqt == z) {
                return zzti;
            }
        }
        return null;
    }

    public void zzZ(zzZ1T zzz1t) throws Exception {
        zzz1t.zzZ3K().write(getText());
    }

    public abstract boolean zzZ(zzYI zzyi);

    public boolean zzZt(char c) {
        return c == ' ' || c == '\t';
    }

    public boolean zzZv(char c) {
        return false;
    }

    public String zzb(String str, int i) {
        int iZzYA = 0;
        int i2 = i;
        while (i2 < str.length() && zzZv(str.charAt(i2))) {
            iZzYA += zzZ1N.zzYA(str.charAt(i2));
            i2++;
            if (iZzYA == zz9w()) {
                break;
            }
        }
        return iZzYA > 0 ? C22241OooO0Oo.OooO00o(i2, i, i, i, str) : "";
    }

    public abstract int zzb4();

    public String zzc(String str, int i) {
        if (i >= str.length()) {
            return "";
        }
        int length = str.length() - 1;
        while (length >= i && zzZt(str.charAt(length))) {
            length--;
        }
        int length2 = (str.length() - 1) - length;
        if (length2 <= 0) {
            return "";
        }
        int i2 = length + 1;
        return str.substring(i2, length2 + i2);
    }

    public String zzd(String str, int i) {
        int i2 = i;
        while (i2 < str.length() && zzZt(str.charAt(i2))) {
            i2++;
        }
        int i3 = i2 - i;
        return i3 > 0 ? str.substring(i, i3 + i) : "";
    }

    public final boolean zze(String str, int i) {
        if (str == null) {
            return false;
        }
        String strZzd = zzd(str, i);
        this.zzZD3 = strZzd;
        int length = strZzd.length() + i;
        String strZzb = zzb(str, length);
        this.zzZD2 = strZzb;
        int length2 = strZzb.length() + length;
        this.zzZCZ = zzc(str, length2);
        int length3 = (str.length() - 1) - this.zzZCZ.length();
        String strZzM = (com.aspose.words.internal.zzZYD.zzXk(this.zzZD2) || zz9v()) ? zzM(str, length2, length3) : "";
        this.zzZD0 = strZzM;
        int length4 = length3 - strZzM.length();
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZD0)) {
            this.zzZCZ = "";
            length4 = str.length() - 1;
        }
        this.zzZD1 = zzL(str, length2, length4);
        return true;
    }

    public abstract boolean zzf(String str, int i);

    public int zzfa() {
        return zzZ1N.zzIx(this.zzZD3);
    }

    public abstract byte zzkz();

    public final zzTI zzz(byte b) {
        for (zzTI zzti = this.zzZD4; zzti != null; zzti = zzti.zzZD4) {
            if (zzti.zzkz() == b) {
                return zzti;
            }
        }
        return null;
    }

    public final void zzZ(zzTI zzti) {
        this.zzZD4 = zzti;
    }
}
