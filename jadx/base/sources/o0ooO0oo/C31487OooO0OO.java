package o0ooO0oo;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: o0ooO0oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31487OooO0OO extends BufferedOutputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f112654OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f112655OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f112656OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f112657OooOoO0;

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() throws IOException {
        try {
            if (this.f112655OooOo0o && !this.f112654OooOo) {
                write(13);
                this.f112657OooOoO0++;
            }
            this.f112655OooOo0o = false;
            this.f112654OooOo = false;
            super.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (this.f112657OooOoO0 == 0 && i2 > 10) {
                this.f112656OooOoO = false;
                for (int i3 = 0; i3 < 10; i3++) {
                    byte b = bArr[i3];
                    if (b >= 9 && (b <= 10 || b >= 32 || b == 13)) {
                    }
                    this.f112656OooOoO = true;
                    break;
                }
            }
            if (this.f112656OooOoO) {
                if (this.f112655OooOo0o) {
                    this.f112655OooOo0o = false;
                    if (!this.f112654OooOo && i2 == 1 && bArr[i] == 10) {
                        return;
                    } else {
                        write(13);
                    }
                }
                if (this.f112654OooOo) {
                    write(10);
                    this.f112654OooOo = false;
                }
                if (i2 > 0) {
                    byte b2 = bArr[(i + i2) - 1];
                    if (b2 == 13) {
                        this.f112655OooOo0o = true;
                        i2--;
                    } else if (b2 == 10) {
                        this.f112654OooOo = true;
                        int i4 = i2 - 1;
                        if (i4 <= 0 || bArr[(i + i4) - 1] != 13) {
                            i2 = i4;
                        } else {
                            this.f112655OooOo0o = true;
                            i2 -= 2;
                        }
                    }
                }
            }
            super.write(bArr, i, i2);
            this.f112657OooOoO0 += i2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
