package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZL extends zzZ07 {
    private long zzWbi;
    private long zzWbj;
    private long zzWbk;
    private long zzWbl;
    private long zzWbm;
    private long zzWbn;
    private long zzWbo;
    private long zzWbp;
    private final int zzWbq;

    public zzYZL(int i) {
        if (i >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i2 = i / 8;
        this.zzWbq = i2;
        zzfy(i2 * 8);
        reset();
    }

    private static void zzY(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            zzZ((int) (j >>> 32), bArr, i, i2);
            if (i2 > 4) {
                zzZ((int) (j & 4294967295L), bArr, i + 4, i2 - 4);
            }
        }
    }

    private static void zzZ(int i, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(4, i3);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return;
            } else {
                bArr[i2 + iMin] = (byte) (i >>> ((3 - iMin) * 8));
            }
        }
    }

    private void zzfy(int i) {
        this.zzWbZ = -3482333909917012819L;
        this.zzWbY = 2216346199247487646L;
        this.zzWbX = -7364697282686394994L;
        this.zzWbW = 65953792586715988L;
        this.zzWbV = -816286391624063116L;
        this.zzWbU = 4512832404995164602L;
        this.zzWbT = -5033199132376557362L;
        this.zzWbS = -124578254951840548L;
        update((byte) 83);
        update((byte) 72);
        update((byte) 65);
        update(PatternStyle.DottedGrid);
        update(PatternStyle.UpwardDiagonal);
        update(PatternStyle.Horizontal);
        update(PatternStyle.Vertical);
        update(PatternStyle.Shingle);
        if (i > 100) {
            update((byte) ((i / 100) + 48));
            int i2 = i % 100;
            update((byte) ((i2 / 10) + 48));
            i = i2 % 10;
        } else if (i > 10) {
            update((byte) ((i / 10) + 48));
            i %= 10;
        }
        update((byte) (i + 48));
        finish();
        this.zzWbp = this.zzWbZ;
        this.zzWbo = this.zzWbY;
        this.zzWbn = this.zzWbX;
        this.zzWbm = this.zzWbW;
        this.zzWbl = this.zzWbV;
        this.zzWbk = this.zzWbU;
        this.zzWbj = this.zzWbT;
        this.zzWbi = this.zzWbS;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        finish();
        zzY(this.zzWbZ, bArr, i, this.zzWbq);
        zzY(this.zzWbY, bArr, i + 8, this.zzWbq - 8);
        zzY(this.zzWbX, bArr, i + 16, this.zzWbq - 16);
        zzY(this.zzWbW, bArr, i + 24, this.zzWbq - 24);
        zzY(this.zzWbV, bArr, i + 32, this.zzWbq - 32);
        zzY(this.zzWbU, bArr, i + 40, this.zzWbq - 40);
        zzY(this.zzWbT, bArr, i + 48, this.zzWbq - 48);
        zzY(this.zzWbS, bArr, i + 56, this.zzWbq - 56);
        reset();
        return this.zzWbq;
    }

    @Override // com.aspose.words.internal.zzZ07, com.aspose.words.internal.zzYUX
    public final void reset() {
        super.reset();
        this.zzWbZ = this.zzWbp;
        this.zzWbY = this.zzWbo;
        this.zzWbX = this.zzWbn;
        this.zzWbW = this.zzWbm;
        this.zzWbV = this.zzWbl;
        this.zzWbU = this.zzWbk;
        this.zzWbT = this.zzWbj;
        this.zzWbS = this.zzWbi;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzQI() {
        return this.zzWbq;
    }

    @Override // com.aspose.words.internal.zzYGP
    public final zzYGP zzXE2() {
        return new zzYZL(this);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return "SHA-512/" + Integer.toString(this.zzWbq * 8);
    }

    @Override // com.aspose.words.internal.zzYGP
    public final void zzZ(zzYGP zzygp) {
        zzYZL zzyzl = (zzYZL) zzygp;
        if (this.zzWbq == zzyzl.zzWbq) {
            zzZ((zzZ07) zzyzl);
            this.zzWbp = zzyzl.zzWbp;
            this.zzWbo = zzyzl.zzWbo;
            this.zzWbn = zzyzl.zzWbn;
            this.zzWbm = zzyzl.zzWbm;
            this.zzWbl = zzyzl.zzWbl;
            this.zzWbk = zzyzl.zzWbk;
            this.zzWbj = zzyzl.zzWbj;
            this.zzWbi = zzyzl.zzWbi;
            return;
        }
        throw new zzYGO("digestLength inappropriate in other");
    }

    public zzYZL(zzYZL zzyzl) {
        super(zzyzl);
        this.zzWbq = zzyzl.zzWbq;
        zzZ((zzYGP) zzyzl);
    }
}
