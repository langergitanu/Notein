package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzAS extends zzAU {
    private byte[] zzTZ;
    private zzD3<zzIN> zzsg;

    public zzAS(byte[] bArr, zzXV zzxv) {
        super(bArr.length, zzxv);
        this.zzsg = new zzD3<>();
        this.zzTZ = new byte[bArr.length + 7168];
        System.arraycopy(zzAZ(), 0, this.zzTZ, 0, zzAZ().length);
        System.arraycopy(bArr, 0, this.zzTZ, 7168, bArr.length);
        for (int i = 1; i < 7168; i++) {
            zzVg(i);
        }
    }

    public final zzD3<zzIN> zzAN() {
        return this.zzsg;
    }

    public final int zzL(int i, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            byte[] bArr = this.zzTZ;
            int i5 = i + 1;
            int i6 = i2 + 1;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }

    public final int zzVe(int i) {
        byte[] bArr = this.zzTZ;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public final byte zzVf(int i) {
        return this.zzTZ[i];
    }

    public final void zzVg(int i) {
        if (i <= 0) {
            return;
        }
        byte[] bArr = this.zzTZ;
        byte b = bArr[i];
        int i2 = i - 1;
        int i3 = ((((short) (bArr[i2] & 255)) & 65535) << 8) | (b & 255);
        this.zzsg.set(i3, new zzIN(i2, this.zzsg.get(i3)));
    }

    public final void zzZ(int i, zzIN zzin, zzIN zzin2) {
        if (this.zzsg.get(i) == zzin2) {
            this.zzsg.zzVG(i);
        } else if (zzin != null) {
            zzin.zzGs();
        }
        while (zzin2 != null) {
            zzIN zzinZzGt = zzin2.zzGt();
            zzin2.zzGs();
            zzin2 = zzinZzGt;
        }
    }
}
