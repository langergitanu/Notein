package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import o00OooOO.C25159OooO0oO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO extends OutputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public byte[] f67197OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final FileOutputStream f67198OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f67199OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C25159OooO0oO f67200OooOoO0;

    public OooO0OO(FileOutputStream fileOutputStream, C25159OooO0oO c25159OooO0oO) {
        this.f67198OooOo0o = fileOutputStream;
        this.f67200OooOoO0 = c25159OooO0oO;
        this.f67197OooOo = (byte[]) c25159OooO0oO.OooO0Oo(byte[].class, 65536);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f67198OooOo0o;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f67197OooOo;
            if (bArr != null) {
                this.f67200OooOoO0.OooO0oo(bArr);
                this.f67197OooOo = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f67199OooOoO;
        FileOutputStream fileOutputStream = this.f67198OooOo0o;
        if (i > 0) {
            fileOutputStream.write(this.f67197OooOo, 0, i);
            this.f67199OooOoO = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f67197OooOo;
        int i2 = this.f67199OooOoO;
        int i3 = i2 + 1;
        this.f67199OooOoO = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f67198OooOo0o.write(bArr, 0, i3);
        this.f67199OooOoO = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f67199OooOoO;
            FileOutputStream fileOutputStream = this.f67198OooOo0o;
            if (i6 == 0 && i4 >= this.f67197OooOo.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f67197OooOo.length - i6);
            System.arraycopy(bArr, i5, this.f67197OooOo, this.f67199OooOoO, iMin);
            int i7 = this.f67199OooOoO + iMin;
            this.f67199OooOoO = i7;
            i3 += iMin;
            byte[] bArr2 = this.f67197OooOo;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f67199OooOoO = 0;
            }
        } while (i3 < i2);
    }
}
