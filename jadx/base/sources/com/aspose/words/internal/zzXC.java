package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXC {
    public static zzXC zzV3 = new zzXC(new byte[0]);
    private zzZOZ zzV0;
    private int zzV1;
    private byte[] zzV2;

    public zzXC(byte[] bArr) {
        this(bArr, 0, bArr != null ? bArr.length : 0);
    }

    private static int zzP(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 1;
        for (byte b : bArr) {
            i = (i * 31) + (b & 255);
        }
        return i;
    }

    private static zzZOZ zzQ(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            bArr2[i2] = bArr[i];
            i += 4;
            i2++;
        }
        return new zzZOZ(bArr2);
    }

    public static boolean zzZ(zzXC zzxc, zzXC zzxc2) {
        if (!zzxc.equals(zzxc2) || zzxc.zzV2.length != zzxc2.zzV2.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = zzxc.zzV2;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != zzxc2.zzV2[i]) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof zzXC) && this.zzV1 == obj.hashCode();
    }

    public final int hashCode() {
        return this.zzV1;
    }

    public final byte[] zzWw() {
        return this.zzV0.toByteArray();
    }

    public zzXC(byte[] bArr, int i, int i2) {
        byte[] bArrZzZ = bArr != null ? zzIL.zzZ(zzS1.zzYu(5), bArr, i, i2) : zzV3.zzV2;
        this.zzV2 = bArrZzZ;
        this.zzV1 = zzP(bArrZzZ);
        this.zzV0 = zzQ(this.zzV2);
    }
}
