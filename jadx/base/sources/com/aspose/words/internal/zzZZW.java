package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZW {
    private int zzdu = -1;
    private byte[] zzUD = new byte[4];

    public final int getIntValue() {
        int i = this.zzdu;
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3 += 8) {
            i2 |= (this.zzUD[i] & 255) << i3;
            i = i == 0 ? 3 : i - 1;
        }
        return i2;
    }

    public final void zzF(byte b) {
        int i = this.zzdu;
        int i2 = i < 3 ? i + 1 : 0;
        this.zzdu = i2;
        this.zzUD[i2] = b;
    }
}
