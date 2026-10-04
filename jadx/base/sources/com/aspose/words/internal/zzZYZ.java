package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZYZ {
    public int zzci;
    public int zzcj;
    public String zzck;
    public int zzdZ;

    public static int zzF(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i / 4;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = bArr[i6] & 255;
            int i10 = bArr[i6 + 1] & 255;
            int i11 = i6 + 3;
            int i12 = bArr[i6 + 2] & 255;
            i6 += 4;
            i7 += (i10 << 16) | (i12 << 8) | (bArr[i11] & 255) | (i9 << 24);
        }
        if (i6 < i) {
            i2 = bArr[i6] & 255;
            i6++;
        } else {
            i2 = 0;
        }
        if (i6 < i) {
            i3 = i6 + 1;
            i4 = bArr[i6] & 255;
        } else {
            i3 = i6;
            i4 = 0;
        }
        return i7 + (((i3 < i ? bArr[i3] & 255 : 0) << 8) | (i4 << 16) | (i2 << 24));
    }

    public static zzZYZ zzu(zzY0 zzy0) throws Exception {
        zzZYZ zzzyz = new zzZYZ();
        zzzyz.zzck = new String(zzy0.zzm(4));
        zzzyz.zzcj = zzy0.zzXc();
        zzzyz.zzdZ = zzy0.zzXb();
        zzzyz.zzci = zzy0.zzXb();
        return zzzyz;
    }

    public final void zzX(zzXZ zzxz) throws Exception {
        for (int i = 0; i < this.zzck.length(); i++) {
            zzxz.writeByte((byte) this.zzck.charAt(i));
        }
        zzxz.zzl(this.zzcj);
        zzxz.zzk(this.zzdZ);
        zzxz.zzk(this.zzci);
    }
}
