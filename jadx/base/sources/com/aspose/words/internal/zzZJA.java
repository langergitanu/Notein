package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJA {
    short zzZJX;
    byte[] zzZK0 = new byte[4096];
    short[] zzZJZ = new short[4096];
    int[] zzZJW = new int[4096];
    short[] zzZJY = new short[9973];

    private static int zzX(short s, byte b) {
        return ((s ^ ((short) (b << 8))) & 65535) % 9973;
    }

    public final void zzPH(int i) {
        this.zzZJX = (short) 0;
        for (int i2 = 0; i2 < 9973; i2++) {
            this.zzZJY[i2] = -1;
        }
        int i3 = (1 << i) + 2;
        for (int i4 = 0; i4 < i3; i4++) {
            zzZ((short) -1, (byte) i4);
        }
    }

    public final short zzY(short s, byte b) {
        if (s == -1) {
            return (short) (b & 255);
        }
        int iZzX = zzX(s, b);
        while (true) {
            short s2 = this.zzZJY[iZzX];
            if (s2 == -1) {
                return (short) -1;
            }
            if (this.zzZJZ[s2] == s && this.zzZK0[s2] == b) {
                return s2;
            }
            iZzX = (iZzX + 2039) % 9973;
        }
    }

    public final int zzZ(short s, byte b) {
        short[] sArr;
        if (this.zzZJX >= 4096) {
            return 65535;
        }
        int iZzX = zzX(s, b);
        while (true) {
            sArr = this.zzZJY;
            if (sArr[iZzX] == -1) {
                break;
            }
            iZzX = (iZzX + 2039) % 9973;
        }
        short s2 = this.zzZJX;
        sArr[iZzX] = s2;
        this.zzZK0[s2] = b;
        if (s == -1) {
            this.zzZJZ[s2] = -1;
            this.zzZJW[s2] = 1;
        } else {
            this.zzZJZ[s2] = s;
            int[] iArr = this.zzZJW;
            iArr[s2] = iArr[s] + 1;
        }
        this.zzZJX = (short) (s2 + 1);
        return s2;
    }
}
