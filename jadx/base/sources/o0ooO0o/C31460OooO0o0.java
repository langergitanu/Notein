package o0ooO0o;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o0ooO0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31460OooO0o0 extends InputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f112518OooOo = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31454OooO f112519OooOo0o;

    public C31460OooO0o0(C31454OooO c31454OooO) {
        this.f112519OooOo0o = c31454OooO;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long j = this.f112518OooOo;
        C31454OooO c31454OooO = this.f112519OooOo0o;
        c31454OooO.seek(j);
        long position = c31454OooO.f112486OooOoO0 - c31454OooO.getPosition();
        if (position > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) position;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i;
        long j = this.f112518OooOo;
        C31454OooO c31454OooO = this.f112519OooOo0o;
        c31454OooO.seek(j);
        if (c31454OooO.OooOOOo()) {
            return -1;
        }
        c31454OooO.OooO0OO();
        if (c31454OooO.f112487OooOoOO + ((long) c31454OooO.f112488OooOoo) >= c31454OooO.f112486OooOoO0) {
            i = -1;
        } else {
            if (!c31454OooO.OooOOO0(false)) {
                throw new IOException("Unexpectedly no bytes available for read in buffer.");
            }
            byte[] bArr = c31454OooO.f112489OooOoo0;
            int i2 = c31454OooO.f112488OooOoo;
            c31454OooO.f112488OooOoo = i2 + 1;
            i = bArr[i2] & 255;
        }
        if (i != -1) {
            this.f112518OooOo++;
            return i;
        }
        Log.e("PdfBox-Android", "read() returns -1, assumed position: " + this.f112518OooOo + ", actual position: " + c31454OooO.getPosition());
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.f112518OooOo;
        C31454OooO c31454OooO = this.f112519OooOo0o;
        c31454OooO.seek(j2);
        c31454OooO.seek(this.f112518OooOo + j);
        this.f112518OooOo += j;
        return j;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f112518OooOo;
        C31454OooO c31454OooO = this.f112519OooOo0o;
        c31454OooO.seek(j);
        if (c31454OooO.OooOOOo()) {
            return -1;
        }
        int i3 = c31454OooO.read(bArr, i, i2);
        if (i3 != -1) {
            this.f112518OooOo += (long) i3;
            return i3;
        }
        Log.e("PdfBox-Android", "read() returns -1, assumed position: " + this.f112518OooOo + ", actual position: " + c31454OooO.getPosition());
        return i3;
    }
}
