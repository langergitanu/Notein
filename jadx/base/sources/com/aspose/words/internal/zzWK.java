package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzWK {
    private zzY0 zzTA;
    private long zzTz;

    public zzWK(zzY0 zzy0) throws Exception {
        this.zzTA = zzy0;
        this.zzTz = zzy0.zzq().getPosition();
    }

    public final short zzUR() throws Exception {
        return (short) (this.zzTA.readByte() & 255);
    }

    public final short zzUS() throws Exception {
        return this.zzTA.zzX9();
    }

    public final short zzUT() throws Exception {
        return this.zzTA.zzX9();
    }

    public final short zzUU() throws Exception {
        return (short) (this.zzTA.readByte() & 255);
    }

    public final int[] zzZ(short s, int i) throws Exception {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (s == 1) {
                iArr[i2] = this.zzTA.readByte() & 255;
            } else if (s == 2) {
                iArr[i2] = this.zzTA.zzX9() & 65535;
            } else if (s == 3) {
                iArr[i2] = this.zzTA.zzX7();
            } else {
                if (s != 4) {
                    throw new IllegalStateException("Unexpected offset size.");
                }
                iArr[i2] = (int) (((long) this.zzTA.zzXb()) & 4294967295L);
            }
        }
        return iArr;
    }

    public final void zzZp(int i) throws Exception {
        this.zzTA.zzq().zzH(this.zzTz + ((long) i));
    }

    public final byte[] zzn(int i) throws Exception {
        return this.zzTA.zzn(i);
    }

    public final zzZOP zzq() {
        return this.zzTA.zzq();
    }
}
