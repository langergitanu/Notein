package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTN extends zzYUF {
    private static final byte[] zzVYN = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, PatternStyle.Plaid, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, PatternStyle.Sphere};
    private long zzVYK;
    private zzYS8 zzVYL;
    private final zzYTP zzVYM;
    private boolean zzWkw;

    public zzYTN(zzYV8 zzyv8) {
        super(zzyv8);
        this.zzVYK = 0L;
        this.zzVYM = new zzYTP(zzyv8, zzyv8.getBlockSize() * 8);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return this.zzVYM.getBlockSize();
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void reset() {
        this.zzVYK = 0L;
        this.zzVYM.reset();
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        String strZzXGi = this.zzVYM.zzXGi();
        return strZzXGi.substring(0, strZzXGi.indexOf(47) - 1) + "/G" + strZzXGi.substring(strZzXGi.indexOf(47) + 1);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        zzY(bArr, i, this.zzVYM.getBlockSize(), bArr2, i2);
        return this.zzVYM.getBlockSize();
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        this.zzVYK = 0L;
        this.zzVYM.zzZ(z, zzyv3);
        this.zzWkw = z;
        if (zzyv3 instanceof zzYS4) {
            zzyv3 = ((zzYS4) zzyv3).zzXC6();
        }
        if (zzyv3 instanceof zzYS3) {
            zzyv3 = ((zzYS3) zzyv3).zzXC6();
        }
        this.zzVYL = (zzYS8) zzyv3;
    }

    @Override // com.aspose.words.internal.zzYUF
    public final byte zzd(byte b) {
        long j = this.zzVYK;
        if (j > 0 && j % 1024 == 0) {
            zzYV8 zzyv8ZzXCK = this.zzVYM.zzXCK();
            zzyv8ZzXCK.zzZ(false, this.zzVYL);
            byte[] bArr = new byte[32];
            byte[] bArr2 = zzVYN;
            zzyv8ZzXCK.zzY(bArr2, 0, bArr, 0);
            zzyv8ZzXCK.zzY(bArr2, 8, bArr, 8);
            zzyv8ZzXCK.zzY(bArr2, 16, bArr, 16);
            zzyv8ZzXCK.zzY(bArr2, 24, bArr, 24);
            zzYS7 zzys7 = new zzYS7(bArr);
            this.zzVYL = zzys7;
            zzyv8ZzXCK.zzZ(true, zzys7);
            byte[] bArrZzXCE = this.zzVYM.zzXCE();
            zzyv8ZzXCK.zzY(bArrZzXCE, 0, bArrZzXCE, 0);
            this.zzVYM.zzZ(this.zzWkw, new zzYS4(this.zzVYL, bArrZzXCE));
        }
        this.zzVYK++;
        return this.zzVYM.zzd(b);
    }
}
