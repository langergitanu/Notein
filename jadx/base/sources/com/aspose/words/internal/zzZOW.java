package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZOW {
    private zzZO0 zzMW;
    private zzZOP zzN5;
    private byte[] zzUD;

    public zzZOW(zzZOP zzzop) {
        this.zzMW = zzZO0.zzhU();
        this.zzN5 = zzzop;
        this.zzUD = new byte[16];
    }

    public final void close() throws IOException {
        this.zzN5.close();
    }

    public final void flush() throws Exception {
        this.zzN5.flush();
    }

    public final void writeBoolean(boolean z) throws Exception {
        byte[] bArr = this.zzUD;
        bArr[0] = z ? (byte) 1 : (byte) 0;
        this.zzN5.write(bArr, 0, 1);
    }

    public final void writeByte(byte b) throws Exception {
        byte[] bArr = this.zzUD;
        bArr[0] = b;
        this.zzN5.write(bArr, 0, 1);
    }

    public final void writeBytes(byte[] bArr) throws Exception {
        this.zzN5.write(bArr, 0, bArr.length);
    }

    public final void writeDouble(double d) throws Exception {
        zzQ(Double.doubleToLongBits(d));
    }

    public final void writeFloat(float f) throws Exception {
        zzl(Float.floatToIntBits(f));
    }

    public final void zzJ(short s) throws Exception {
        zzK(s);
    }

    public final void zzK(short s) throws Exception {
        byte[] bArr = this.zzUD;
        bArr[0] = (byte) s;
        bArr[1] = (byte) (s >>> 8);
        this.zzN5.write(bArr, 0, 2);
    }

    public final void zzQ(long j) throws Exception {
        zzl((int) j);
        zzl((int) (j >>> 32));
    }

    public final void zzV(byte[] bArr, int i, int i2) throws Exception {
        this.zzN5.write(bArr, i, i2);
    }

    public final void zzY(char[] cArr) throws Exception {
        if (cArr.length == 0) {
            return;
        }
        writeBytes(this.zzMW.zzX(cArr));
    }

    public final long zzZa(int i, int i2) throws Exception {
        return this.zzN5.zzU(i, i2);
    }

    public final void zzk(int i) throws Exception {
        zzl(i);
    }

    public final void zzl(int i) throws Exception {
        byte[] bArr = this.zzUD;
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >>> 8);
        bArr[2] = (byte) (i >>> 16);
        bArr[3] = (byte) (i >>> 24);
        this.zzN5.write(bArr, 0, 4);
    }

    public final zzZOP zzq() {
        return this.zzN5;
    }

    public zzZOW(zzZOP zzzop, zzZO0 zzzo0) {
        this(zzzop);
        this.zzMW = zzzo0;
    }
}
