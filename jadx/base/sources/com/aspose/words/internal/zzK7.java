package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
public final class zzK7 {
    private int zzBF;
    private int zzBG;
    private static zzZW0 zzBE = new zzZW0();
    private static zzXD zzBD = new zzXD();
    public static zzK7 zzBC = new zzK7(0, 0);

    static {
        zzZ(1, (byte) 0);
        zzZ(2, (byte) -18);
        zzZ(4, (byte) -52);
        zzZ(8, (byte) -95);
        zzZ(16, (byte) -94);
        zzZ(32, (byte) -79);
        zzZ(64, (byte) -78);
        zzZ(128, (byte) -70);
        zzZ(256, (byte) -93);
        zzZ(65536, (byte) -34);
        zzZ(131072, UnsignedBytes.MAX_POWER_OF_TWO);
        zzZ(262144, (byte) -122);
        zzZ(524288, (byte) -127);
        zzZ(1048576, (byte) -120);
        zzZ(2097152, (byte) -126);
        zzZ(536870912, (byte) 77);
        zzZ(1073741824, (byte) -1);
        zzZ(Integer.MIN_VALUE, (byte) 2);
    }

    public zzK7(int i, int i2) {
        this.zzBG = i;
        this.zzBF = i2;
    }

    private boolean zzZ(zzK7 zzk7) {
        return this.zzBG == zzk7.zzBG && this.zzBF == zzk7.zzBF;
    }

    public final boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzK7.class) {
            return false;
        }
        return zzZ((zzK7) obj);
    }

    public final int hashCode() {
        return (((int) (((long) this.zzBG) & 4294967295L)) * 397) ^ ((int) (((long) this.zzBF) & 4294967295L));
    }

    public final byte zzI4() {
        if (zzBE.zzVE(this.zzBG)) {
            return zzBE.get(this.zzBG);
        }
        return (byte) 1;
    }

    public final boolean zzI5() {
        return zzXU.zzM(this.zzBG, 64);
    }

    public final boolean zzI6() {
        return zzXU.zzM(this.zzBG, 1);
    }

    public final boolean zzI7() {
        return zzXU.zzM(this.zzBG, 1966080);
    }

    public final boolean zzI8() {
        return zzXU.zzM(this.zzBG, Integer.MIN_VALUE);
    }

    public final int zzI9() {
        return this.zzBF;
    }

    public final int zzIa() {
        return this.zzBG;
    }

    public final zzK7 zzR(byte b) {
        if (!zzBD.zzV(b)) {
            return this;
        }
        return new zzK7((int) ((((long) this.zzBG) & 4294967295L) | (4294967295L & ((long) zzBD.zzT(b)))), this.zzBF);
    }

    private static void zzZ(int i, byte b) {
        zzBE.zzY(i, b);
        zzBD.zzX(b, i);
    }

    public zzK7(byte[] bArr) {
        this.zzBG = zzZQK.zzA(bArr, 16);
        this.zzBF = zzZQK.zzA(bArr, 20);
    }
}
