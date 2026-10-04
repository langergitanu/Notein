package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4Y {
    private byte zzX26 = 0;
    private int zzX25 = 0;
    private int zzX24 = 0;
    private ArrayList<zzYIM> zzZpR = new ArrayList<>();

    private void zzX(zzYIM zzyim) {
        if (this.zzZpR.size() >= 8) {
            throw new IllegalArgumentException();
        }
        this.zzX24++;
        com.aspose.words.internal.zzZQG.zzZ(this.zzZpR, zzyim);
    }

    private void zzY(zzYIM zzyim) {
        if (this.zzZpR.size() >= 8) {
            throw new IllegalArgumentException();
        }
        this.zzX26 = (byte) (this.zzX26 | ((byte) (1 << this.zzZpR.size())));
        this.zzX25++;
        com.aspose.words.internal.zzZQG.zzZ(this.zzZpR, zzyim);
    }

    public final byte[] getData() {
        int length = 1;
        byte[] bArr = new byte[(this.zzX25 * 2) + this.zzX24 + 1];
        bArr[0] = this.zzX26;
        for (zzYIM zzyim : this.zzZpR) {
            com.aspose.words.internal.zzZKV.zzZ(zzyim.getBytes(), 0, bArr, length, zzyim.getBytes().length);
            length += zzyim.getBytes().length;
        }
        return bArr;
    }

    public final int zzXUR() {
        return this.zzZpR.size();
    }

    public final void zzZ(zzYIM zzyim) {
        if (zzyim.zzTU()) {
            zzX(zzyim);
        } else {
            zzY(zzyim);
        }
    }
}
