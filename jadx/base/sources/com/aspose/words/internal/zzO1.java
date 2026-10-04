package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzO1 {
    private zzZOW zzW5;

    public zzO1(zzZOW zzzow) {
        this.zzW5 = zzzow;
    }

    public final void writeByte(byte b) throws Exception {
        this.zzW5.writeByte(b);
    }

    public final void writeBytes(byte[] bArr) throws Exception {
        this.zzW5.writeBytes(bArr);
    }

    public final void writeFloat(float f) throws Exception {
        this.zzW5.writeFloat(f);
    }

    public final void writeFloatArray(float[] fArr) throws Exception {
        writeInt(fArr.length);
        for (float f : fArr) {
            writeFloat(f);
        }
    }

    public final void writeInt(int i) throws Exception {
        this.zzW5.zzl(i);
    }

    public final void writeShort(short s) throws Exception {
        this.zzW5.zzK(s);
    }

    public final void zzD(zzZQ4 zzzq4) throws Exception {
        writeFloat(zzzq4.getX());
        writeFloat(zzzq4.getY());
        writeFloat(zzzq4.getWidth());
        writeFloat(zzzq4.getHeight());
    }

    public final void zzI(zzPV zzpv) throws Exception {
        this.zzW5.zzl(zzpv.toArgb());
    }

    public final void zzK(zzP9 zzp9) throws Exception {
        writeFloat(zzp9.zzOf());
        writeFloat(zzp9.zzOe());
        writeFloat(zzp9.zzOd());
        writeFloat(zzp9.zzOc());
        writeFloat(zzp9.zzOb());
        writeFloat(zzp9.zzOa());
    }

    public final void zzMF() throws Exception {
        this.zzW5.zzl(-608169982);
    }

    public final void zzR(short s) throws Exception {
        this.zzW5.zzK(s);
    }

    public final void zzV(byte[] bArr, int i, int i2) throws Exception {
        this.zzW5.zzV(bArr, i, i2);
    }

    public final void zzXB(int i) throws Exception {
        int i2 = i % 4;
        int i3 = i2 == 0 ? 0 : 4 - i2;
        for (int i4 = 0; i4 < i3; i4++) {
            writeByte((byte) 0);
        }
    }

    public final void zzXC(int i) throws Exception {
        this.zzW5.zzl(i);
    }

    public final void zzj(long j) throws Exception {
        writeFloat(Float.intBitsToFloat((int) j));
        writeFloat(zzZPY.zzYC(j));
    }
}
