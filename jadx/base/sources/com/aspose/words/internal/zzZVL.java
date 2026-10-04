package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZVL {
    private int zz7A;
    public zzZVK[] zz7B;
    private int zz7z;

    public static zzZVL zzn(zzY0 zzy0) throws Exception {
        zzZVL zzzvl = new zzZVL();
        int iZzX9 = zzy0.zzX9() & 65535;
        zzzvl.zz7B = new zzZVK[iZzX9];
        zzzvl.zz7A = zzy0.readByte() & 255;
        zzzvl.zz7z = zzy0.readByte() & 255;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < iZzX9; i3++) {
            zzzvl.zz7B[i3] = zzZVK.zzm(zzy0);
            zzZVK zzzvk = zzzvl.zz7B[i3];
            int i4 = zzzvk.zzBj << 16;
            short s = zzzvk.zz7y;
            i += (((s & 65535) / 2) + i4) / (s & 65535);
            i2 += ((zzzvk.zzBl << 16) - ((s & 65535) / 2)) / (s & 65535);
        }
        int i5 = iZzX9 / 2;
        zzzvl.zz7A = (((i + i5) / iZzX9) + 16) >> 5;
        zzzvl.zz7z = ((-((i2 - i5) / iZzX9)) + 16) >> 5;
        return zzzvl;
    }

    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzi(this.zz7B.length);
        zzxz.writeByte((byte) (this.zz7B[0].zz7y & 65535));
        zzxz.writeByte((byte) (this.zz7B[r0.length - 1].zz7y & 65535));
        for (zzZVK zzzvk : this.zz7B) {
            zzzvk.zzX(zzxz);
        }
    }

    public final int zzni() {
        return this.zz7z;
    }

    public final int zznj() {
        return this.zz7A;
    }
}
