package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTG extends zzYUF implements zzYUG {
    private byte[] zzVYE;
    private int zzVYT;
    private byte[] zzVYa;
    private final zzYV8 zzW67;
    private byte[] zzWg5;
    private final int zzZNm;

    public zzYTG(zzYV8 zzyv8) {
        super(zzyv8);
        this.zzW67 = zzyv8;
        int blockSize = zzyv8.getBlockSize();
        this.zzZNm = blockSize;
        this.zzWg5 = new byte[blockSize];
        this.zzVYE = new byte[blockSize];
        this.zzVYa = new byte[blockSize];
        this.zzVYT = 0;
    }

    private void zzXCy() {
        for (int length = this.zzVYE.length - 1; length >= 0; length--) {
            byte[] bArr = this.zzVYE;
            byte b = (byte) (bArr[length] + 1);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    private void zzXCz() {
        if (this.zzWg5.length == this.zzZNm) {
            return;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.zzWg5;
            if (i == bArr.length) {
                return;
            }
            if (this.zzVYE[i] != bArr[i]) {
                throw new IllegalStateException("Counter in CTR mode out of range.");
            }
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return this.zzW67.getBlockSize();
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void reset() {
        zzYGU.fill(this.zzVYE, (byte) 0);
        byte[] bArr = this.zzWg5;
        System.arraycopy(bArr, 0, this.zzVYE, 0, bArr.length);
        this.zzW67.reset();
        this.zzVYT = 0;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return this.zzW67.zzXGi() + "/SIC";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        zzY(bArr, i, this.zzZNm, bArr2, i2);
        return this.zzZNm;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        if (!(zzyv3 instanceof zzYS4)) {
            throw new IllegalArgumentException("CTR mode requires ParametersWithIV");
        }
        zzYS4 zzys4 = (zzYS4) zzyv3;
        byte[] bArrZzVI = zzYGU.zzVI(zzys4.getIV());
        this.zzWg5 = bArrZzVI;
        int i = this.zzZNm;
        int i2 = 8 > i / 2 ? i / 2 : 8;
        if (i - bArrZzVI.length <= i2) {
            if (zzys4.zzXC6() != null) {
                this.zzW67.zzZ(true, zzys4.zzXC6());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR mode requires IV of at least: " + (this.zzZNm - i2) + " bytes.");
        }
    }

    @Override // com.aspose.words.internal.zzYUF
    public final byte zzd(byte b) throws IllegalStateException, zzYV0 {
        int i = this.zzVYT;
        if (i == 0) {
            this.zzW67.zzY(this.zzVYE, 0, this.zzVYa, 0);
            byte[] bArr = this.zzVYa;
            int i2 = this.zzVYT;
            this.zzVYT = i2 + 1;
            return (byte) (b ^ bArr[i2]);
        }
        byte[] bArr2 = this.zzVYa;
        int i3 = i + 1;
        this.zzVYT = i3;
        byte b2 = (byte) (b ^ bArr2[i]);
        if (i3 == this.zzVYE.length) {
            this.zzVYT = 0;
            zzXCy();
            zzXCz();
        }
        return b2;
    }
}
