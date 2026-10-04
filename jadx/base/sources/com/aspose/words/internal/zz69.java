package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz69 {
    private zzZOP zzN5;

    public zz69(zzZOP zzzop) {
        this.zzN5 = zzzop;
    }

    private void writeFloat(float f) throws Exception {
        byte[] bytes = zzZQK.getBytes(Float.floatToRawIntBits(f));
        zzL(bytes, bytes.length);
    }

    private void writeInt(int i) throws Exception {
        byte[] bytes = zzZQK.getBytes(i);
        zzL(bytes, bytes.length);
    }

    private void writeShort(short s) throws Exception {
        byte[] bArrZzL = zzZQK.zzL(s);
        zzL(bArrZzL, bArrZzL.length);
    }

    private void zzL(byte[] bArr, int i) throws Exception {
        for (int i2 = 0; i2 < i; i2++) {
            this.zzN5.writeByte(bArr[i2]);
        }
    }

    private void zzR(short s) throws Exception {
        byte[] bArrZzL = zzZQK.zzL(s);
        zzL(bArrZzL, bArrZzL.length);
    }

    private void zzX(short s, short s2) throws Exception {
        this.zzN5.writeByte((byte) -45);
        writeShort(s);
        writeShort(s2);
    }

    private void zzXC(int i) throws Exception {
        byte[] bytes = zzZQK.getBytes(i);
        zzL(bytes, bytes.length);
    }

    public final void write(String str) throws Exception {
        for (int i = 0; i < str.length(); i++) {
            this.zzN5.writeByte((byte) str.charAt(i));
        }
    }

    public final void writeByte(byte b) throws Exception {
        this.zzN5.writeByte(b);
    }

    public final void writeStreamHeader() throws Exception {
        writeByte((byte) 41);
        write(" ");
        write("HP-PCL XL;");
        write("2;");
        write("0");
        writeByte((byte) 10);
    }

    public final void zz9(float f) throws Exception {
        this.zzN5.writeByte((byte) -59);
        writeFloat(f);
    }

    public final void zzK(byte b) throws Exception {
        this.zzN5.writeByte((byte) -8);
        this.zzN5.writeByte(b);
    }

    public final void zzM(byte b) throws Exception {
        writeByte(b);
    }

    public final void zzO(float f, float f2) throws Exception {
        this.zzN5.writeByte((byte) -43);
        writeFloat(f);
        writeFloat(f2);
    }

    public final void zzP(short s) throws Exception {
        this.zzN5.writeByte((byte) -63);
        zzR(s);
    }

    public final void zzUc(int i) throws Exception {
        this.zzN5.writeByte((byte) -62);
        zzXC(i);
    }

    public final void zzW(zzZOR zzzor) throws Exception {
        int length = (int) zzzor.getLength();
        writeByte((byte) -6);
        writeInt(length + 16);
        writeStreamHeader();
        zzL(zzzor.zziA(), length);
    }

    public final void zzY(short s, short s2) throws Exception {
        this.zzN5.writeByte((byte) -47);
        zzR(s);
        zzR(s2);
    }

    public final void zzY3(String str) throws Exception {
        zzZ((byte) -56, (short) str.length());
        write(str);
    }

    public final void zzZ(short[] sArr) throws Exception {
        zzZ((byte) -55, (short) sArr.length);
        for (short s : sArr) {
            zzR(s);
        }
    }

    public final void zzZa(long j) throws Exception {
        zzY(zzZQB.zzRs(zzZQB.zzZk(Float.intBitsToFloat((int) j))), zzZQB.zzRs(zzZQB.zzZk(zzZPW.zzYz(j))));
    }

    public final void zzZb(long j) throws Exception {
        zzX(zzZQB.zzRt(zzZQB.zzZk(Float.intBitsToFloat((int) j))), zzZQB.zzRt(zzZQB.zzZk(zzZPY.zzYC(j))));
    }

    public final void zzZl(byte[] bArr) throws Exception {
        this.zzN5.writeByte((byte) -6);
        writeInt(bArr.length);
        for (byte b : bArr) {
            writeByte(b);
        }
    }

    public final void zzZm(byte[] bArr) throws Exception {
        zzZ((byte) -56, (short) 3);
        for (int i = 0; i < 3; i++) {
            writeByte(bArr[i]);
        }
    }

    public final void zzwG() throws Exception {
        this.zzN5.writeByte((byte) -61);
        writeShort((short) 1);
    }

    public final void zzL(byte b) throws Exception {
        this.zzN5.writeByte((byte) -64);
        this.zzN5.writeByte(b);
    }

    private void zzZ(byte b, short s) throws Exception {
        this.zzN5.writeByte(b);
        this.zzN5.writeByte((byte) -63);
        zzR(s);
    }
}
