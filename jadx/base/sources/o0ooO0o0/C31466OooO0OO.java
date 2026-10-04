package o0ooO0o0;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: o0ooO0o0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31466OooO0OO extends FilterOutputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f112537OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f112538OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public byte[] f112539OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public byte[] f112540OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f112541OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public char f112542OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f112543OooOoo0;

    public final void OooO00o() {
        byte[] bArr = this.f112540OooOoO0;
        long j = ((long) ((bArr[3] & 255) | (((bArr[0] << 8) | (bArr[1] & 255)) << 16) | ((bArr[2] & 255) << 8))) & 4294967295L;
        if (j == 0) {
            byte[] bArr2 = this.f112539OooOoO;
            bArr2[0] = 122;
            bArr2[1] = 0;
            return;
        }
        byte[] bArr3 = this.f112539OooOoO;
        bArr3[0] = (byte) (r11 + 33);
        long j2 = j - ((j / 52200625) * 52200625);
        bArr3[1] = (byte) (r9 + 33);
        long j3 = j2 - ((j2 / 614125) * 614125);
        bArr3[2] = (byte) (r9 + 33);
        long j4 = j3 - ((j3 / 7225) * 7225);
        bArr3[3] = (byte) ((j4 / 85) + 33);
        bArr3[4] = (byte) ((j4 % 85) + 33);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
            super.close();
        } finally {
            this.f112539OooOoO = null;
            this.f112540OooOoO0 = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f112543OooOoo0) {
            return;
        }
        int i = this.f112537OooOo;
        int i2 = this.f112541OooOoOO;
        if (i > 0) {
            while (i < 4) {
                this.f112540OooOoO0[i] = 0;
                i++;
            }
            OooO00o();
            if (this.f112539OooOoO[0] == 122) {
                for (int i3 = 0; i3 < 5; i3++) {
                    this.f112539OooOoO[i3] = 33;
                }
            }
            for (int i4 = 0; i4 < this.f112537OooOo + 1; i4++) {
                ((FilterOutputStream) this).out.write(this.f112539OooOoO[i4]);
                int i5 = this.f112538OooOo0o - 1;
                this.f112538OooOo0o = i5;
                if (i5 == 0) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f112538OooOo0o = i2;
                }
            }
        }
        int i6 = this.f112538OooOo0o - 1;
        this.f112538OooOo0o = i6;
        if (i6 == 0) {
            ((FilterOutputStream) this).out.write(10);
        }
        ((FilterOutputStream) this).out.write(this.f112542OooOoo);
        ((FilterOutputStream) this).out.write(62);
        ((FilterOutputStream) this).out.write(10);
        this.f112537OooOo = 0;
        this.f112538OooOo0o = i2;
        this.f112543OooOoo0 = true;
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte b;
        this.f112543OooOoo0 = false;
        byte[] bArr = this.f112540OooOoO0;
        int i2 = this.f112537OooOo;
        int i3 = i2 + 1;
        this.f112537OooOo = i3;
        bArr[i2] = (byte) i;
        if (i3 < 4) {
            return;
        }
        OooO00o();
        for (int i4 = 0; i4 < 5 && (b = this.f112539OooOoO[i4]) != 0; i4++) {
            ((FilterOutputStream) this).out.write(b);
            int i5 = this.f112538OooOo0o - 1;
            this.f112538OooOo0o = i5;
            if (i5 == 0) {
                ((FilterOutputStream) this).out.write(10);
                this.f112538OooOo0o = this.f112541OooOoOO;
            }
        }
        this.f112537OooOo = 0;
    }
}
