package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHJ extends zzYFF {
    private boolean zzZGL;
    private char[] zzZGM;
    private String zzZGN;
    private String zzZGO;
    private boolean zzZGP;
    private int[] zzZGQ;
    private int zzZGR;

    public zzZHJ() {
        super(null);
        this.zzZGR = 0;
        this.zzZGQ = new int[]{0, 0, 0, 0};
        this.zzZGO = "\t";
        this.zzZGN = IOUtils.LINE_SEPARATOR_WINDOWS;
        this.zzZGM = null;
    }

    private void zzPr(int i) throws zzZQS {
        int length;
        int length2;
        if (!this.zzZGP || (length2 = (this.zzZGO.length() * i) + (length = this.zzZGN.length())) <= 0) {
            return;
        }
        if (this.zzZGM == null) {
            this.zzZGM = (this.zzZGN + this.zzZGO).toCharArray();
        }
        while (true) {
            char[] cArr = this.zzZGM;
            if (length2 <= cArr.length) {
                this.f50791fm.zzY(cArr, 0, length2);
                return;
            }
            char[] cArr2 = new char[androidx.core.graphics.OooO0OO.OooO00o(cArr.length, length, 2, length)];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            char[] cArr3 = this.zzZGM;
            System.arraycopy(cArr3, length, cArr2, cArr3.length, cArr3.length - length);
            this.zzZGM = cArr2;
        }
    }

    private void zzTJ(String str) {
        int[] iArr = this.zzZGQ;
        int i = this.zzZGR;
        iArr[i] = iArr[i] | 2;
        if (zzZKN.zzU3(str)) {
            return;
        }
        this.zzZGL = false;
    }

    private void zzc9() {
        this.zzZGQ[this.zzZGR] = 0;
    }

    private void zzca() {
        int i = this.zzZGR;
        if (i > 0) {
            this.zzZGR = i - 1;
        }
    }

    private void zzcb() {
        int i = this.zzZGR;
        if (i <= 0 || this.zzZGQ[i] != 1) {
            return;
        }
        try {
            zzPr(i - 1);
        } catch (Exception unused) {
        }
    }

    private void zzcc() {
        zzce();
        this.zzZGR++;
    }

    private void zzcd() {
        zzcf();
        int[] iArr = this.zzZGQ;
        if (iArr.length <= this.zzZGR + 1) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.zzZGQ = iArr2;
        }
        this.zzZGQ[this.zzZGR + 1] = 0;
    }

    private void zzce() {
        int[] iArr = this.zzZGQ;
        int i = this.zzZGR;
        iArr[i] = iArr[i] | 1;
    }

    private void zzcf() {
        int[] iArr = this.zzZGQ;
        int i = this.zzZGR;
        int i2 = iArr[i];
        if ((i2 & 2) == 0) {
            if (i > 0 || i2 != 0) {
                try {
                    zzPr(i);
                    if (this.zzZGR <= 0 || this.zzZGO.length() <= 0) {
                        return;
                    }
                    zzce();
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void setIndent(String str) {
        if (str.equals(this.zzZGO)) {
            return;
        }
        this.zzZGO = str;
        this.zzZGM = null;
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzO(String str, String str2, String str3) throws zzZQS {
        zzcd();
        this.f50791fm.zzO(str, str2, str3);
        zzcc();
        this.zzZGL = true;
    }

    public final void zzTK(String str) throws zzZQS {
        zzcf();
        this.f50791fm.zzX(str);
        zzce();
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzU(String str) throws zzZQS {
        zzcf();
        this.f50791fm.zzU(str);
        zzce();
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzVV(String str) throws zzZQS {
        this.f50791fm.zzVV(str);
        zzTJ(str);
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzVW(String str) throws zzZQS {
        this.f50791fm.zzVW(str);
        zzTJ(str);
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzVX(String str) throws zzZQS {
        zzcf();
        this.f50791fm.zzVX(str);
        zzce();
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzVY(String str) throws zzZQS {
        this.f50791fm.zzVY(str);
        zzTJ(str);
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzVZ(String str) throws zzZQS {
        zzcf();
        this.f50791fm.zzVZ(str);
        zzce();
    }

    @Override // com.aspose.words.internal.zzYFF, com.aspose.words.internal.zzYFV
    public final void zzW(String str, String str2, String str3, String str4) throws zzZQS {
        zzcf();
        this.f50791fm.zzW(str, str2, str3, str4);
        zzce();
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzW1(String str) throws zzZQS {
        zzcd();
        this.f50791fm.zzW1(str);
        zzcc();
        this.zzZGL = true;
    }

    @Override // com.aspose.words.internal.zzYFF, com.aspose.words.internal.zzYFV
    public final void zzX(String str) throws zzZQS {
        this.f50791fm.zzX(str);
        zzTJ(str);
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzY(char[] cArr, int i, int i2) throws zzZQS {
        this.f50791fm.zzY(cArr, i, i2);
        zzTJ(i2 > 0 ? " " : "");
    }

    public final void zzZ0(boolean z) {
        this.zzZGP = z;
    }

    @Override // com.aspose.words.internal.zzYFF, com.aspose.words.internal.zzYFV
    public final void zzf6() throws zzZQS {
        if (this.zzZGL) {
            zzPr(this.zzZGR - 1);
        } else {
            zzcb();
        }
        this.f50791fm.zzf6();
        zzca();
        this.zzZGL = false;
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzld() throws zzZQS {
        while (this.zzZGR > 0) {
            try {
                zzle();
            } catch (Exception unused) {
            }
        }
        zzc9();
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzle() throws zzZQS {
        zzcb();
        this.f50791fm.zzle();
        zzca();
        this.zzZGL = false;
    }

    @Override // com.aspose.words.internal.zzYFE, com.aspose.words.internal.zzZQQ
    public final void zzW(String str, String str2) throws zzZQS {
        zzcf();
        this.f50791fm.zzW(str, str2);
        zzce();
    }
}
