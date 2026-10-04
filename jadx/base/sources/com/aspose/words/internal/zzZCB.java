package com.aspose.words.internal;

import java.io.IOException;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCB extends zzZDF {
    public zzZCB(byte[] bArr) {
        super(bArr);
    }

    private byte[] zzXKs() {
        byte[] bArr = this.zzWIu;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!zzXKQ()) {
            byte[] bArr2 = this.zzWIu;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(zzYGI.zzwb("0000Z"), 0, bArr3, this.zzWIu.length - 1, 5);
            return bArr3;
        }
        if (!zzXKR()) {
            byte[] bArr4 = this.zzWIu;
            byte[] bArr5 = new byte[bArr4.length + 2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(zzYGI.zzwb("00Z"), 0, bArr5, this.zzWIu.length - 1, 3);
            return bArr5;
        }
        if (!zzXKS()) {
            return this.zzWIu;
        }
        int length = this.zzWIu.length - 2;
        while (length > 0 && this.zzWIu[length] == 48) {
            length--;
        }
        byte[] bArr6 = this.zzWIu;
        if (bArr6[length] == 46) {
            byte[] bArr7 = new byte[length + 1];
            System.arraycopy(bArr6, 0, bArr7, 0, length);
            bArr7[length] = 90;
            return bArr7;
        }
        byte[] bArr8 = new byte[length + 2];
        int i = length + 1;
        System.arraycopy(bArr6, 0, bArr8, 0, i);
        bArr8[i] = 90;
        return bArr8;
    }

    @Override // com.aspose.words.internal.zzZDF, com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        int length = zzXKs().length;
        return zzZBC.zzg4(length) + 1 + length;
    }

    @Override // com.aspose.words.internal.zzZDF, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(24, zzXKs());
    }

    public zzZCB(Date date) {
        super(date);
    }

    public zzZCB(String str) {
        super(str);
    }
}
