package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZFN extends Reader {
    protected char[] zzWMF = null;
    private final boolean zzWMG;
    protected int zzWMH;
    protected int zzWMI;
    protected byte[] zzWMJ;
    private InputStream zzWMK;
    protected final zzZHC zzWML;

    public zzZFN(zzZHC zzzhc, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.zzWML = zzzhc;
        this.zzWMK = inputStream;
        this.zzWMJ = bArr;
        this.zzWMI = i;
        this.zzWMH = i2;
        this.zzWMG = z;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.lang.StringBuilder] */
    public static void zzT(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException(C21023OooO0Oo.OooO0OO("]", cArr.length, ByteArrayOutputStream.toByteArray()));
    }

    public static void zzXNC() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    public static void zzZT(int i, int i2, int i3) throws IOException {
        StringBuilder sb = new StringBuilder("Invalid character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(", can only be included in xml 1.1 using character entities (at char #");
        sb.append(i3);
        sb.append(", byte #");
        throw new CharConversionException(C21023OooO0Oo.OooO0OO(")", i2, sb));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.zzWMK;
        if (inputStream != null) {
            this.zzWMK = null;
            zzXND();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.zzWMF == null) {
            this.zzWMF = new char[1];
        }
        if (read(this.zzWMF, 0, 1) <= 0) {
            return -1;
        }
        return this.zzWMF[0];
    }

    public final void zzXND() {
        byte[] bArr;
        if (!this.zzWMG || (bArr = this.zzWMJ) == null) {
            return;
        }
        this.zzWMJ = null;
        zzZHC zzzhc = this.zzWML;
        if (zzzhc != null) {
            zzzhc.zzXt(bArr);
        }
    }

    public final int zzXNE() throws IOException {
        this.zzWMI = 0;
        this.zzWMH = 0;
        InputStream inputStream = this.zzWMK;
        if (inputStream == null) {
            return -1;
        }
        byte[] bArr = this.zzWMJ;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i > 0) {
            this.zzWMH = i;
        }
        return i;
    }

    public final boolean zzXNF() {
        return this.zzWMG;
    }

    public abstract void zzXNI();

    public final int zzgS(int i) throws IOException {
        InputStream inputStream = this.zzWMK;
        if (inputStream == null) {
            return -1;
        }
        byte[] bArr = this.zzWMJ;
        int i2 = inputStream.read(bArr, i, bArr.length - i);
        if (i2 > 0) {
            this.zzWMH += i2;
        }
        return i2;
    }
}
